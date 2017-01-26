/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nepal.springfirst.controller.admin;


import com.nepal.springfirst.entity.Player;
import com.nepal.springfirst.service.PlayerService;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 *
 * @author Raju
 */
@Controller
@RequestMapping("/admin/player")
public class PlayerController {
    @Autowired
    private PlayerService playerService;
    @RequestMapping(method = RequestMethod.GET)
    public String Index( ModelMap map) throws SQLException{     
       map.addAttribute("players",playerService.getAll());
        return"admin/player/index";
    }
    
    @RequestMapping(value="/edit/{id}", method = RequestMethod.GET)
    public String edit(@PathVariable("id")int id, ModelMap map) throws SQLException{      
        map.addAttribute("player",playerService.getById(id));
        return "admin/player/edit";
    }
    
    @RequestMapping(value="/add", method = RequestMethod.GET)
    public String add(ModelMap map) throws SQLException{    
        map.addAttribute("player",new Player());
        return "admin/player/add";
    }
    
    @RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable("id")int id) throws SQLException{
       playerService.delete(id);
       return "redirect:/admin/player";
    }
    
    @RequestMapping(value="/save", method = RequestMethod.POST)
    public String save(@ModelAttribute ("player") Player p) throws SQLException{
      if(p.getId()==0){
          playerService.insert(p);
      }
      else{
          playerService.update(p);
      }
      return "redirect:/admin/player?success";
    }
}
