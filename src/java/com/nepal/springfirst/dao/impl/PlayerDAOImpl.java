/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nepal.springfirst.dao.impl;

import com.nepal.springfirst.constant.SQLConstant;
import com.nepal.springfirst.dao.PlayerDAO;
import com.nepal.springfirst.entity.Player;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Raju
 */
@Repository(value="PlayerDAO")
public class PlayerDAOImpl implements PlayerDAO{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Override
    public List<Player> getAll() throws SQLException {
     return jdbcTemplate.query( SQLConstant.PLAYER_GETALL, new RowMapper<Player>() {
         @Override
         public Player mapRow(ResultSet rs, int i) throws SQLException {
             return mapData(rs);
         }
     });
    }
    
    private Player mapData(ResultSet rs) throws SQLException{
        Player p= new Player();
        p.setId(rs.getInt("id"));
        p.setFirstName(rs.getString("first_name"));
        p.setLastName(rs.getString("last_name"));
        p.setEmail(rs.getString("email"));
        p.setSquadPosition(rs.getString("squad_position"));
        p.setContactNo(rs.getString("contact"));
        p.setStatus(rs.getBoolean("status"));
        p.setJoinedDate(rs.getDate("joined_date"));
        p.setModifiedDate(rs.getDate("modified_date"));
        return p;
    }
    @Override
    public Player getById(int id) throws SQLException {
        return jdbcTemplate.queryForObject(SQLConstant.PLAYER_GETBYID, new Object[]{id}, new RowMapper<Player>() {
            @Override
            public Player mapRow(ResultSet rs, int i) throws SQLException {
               return mapData(rs);
            }
        });
    }

    @Override
    public int insert(Player p) throws SQLException {
        return jdbcTemplate.update(SQLConstant.PLAYER_INSERT, new Object[]{p.getFirstName(),p.getLastName(),p.getEmail(),p.getSquadPosition(),p.getContactNo(),p.isStatus()});
    }

    @Override
    public int update(Player p) throws SQLException {
         return jdbcTemplate.update(SQLConstant.PLAYER_UPDATE, new Object[]{p.getFirstName(),p.getLastName(),p.getEmail(),p.getSquadPosition(),p.getContactNo(),p.isStatus(),p.getId()});
    }

    @Override
    public int delete(int id) throws SQLException {
       return jdbcTemplate.update(SQLConstant.PLAYER_DELETE, new Object[]{id});
    }
    
}
