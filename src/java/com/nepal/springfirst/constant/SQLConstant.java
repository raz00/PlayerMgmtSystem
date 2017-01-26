/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nepal.springfirst.constant;

/**
 *
 * @author Raju
 */
public class SQLConstant {
    public final static String PLAYER_GETALL="SELECT * FROM " + TableConstant.PLAYER_TABLE;
    public final static String PLAYER_GETBYID="SELECT * FROM " + TableConstant.PLAYER_TABLE + " WHERE id=?";
    public final static String PLAYER_DELETE="DELETE FROM " + TableConstant.PLAYER_TABLE + " WHERE id=?";
    public final static String PLAYER_INSERT="INSERT INTO " + TableConstant.PLAYER_TABLE + 
                          " (first_name,last_name,email,squad_position,contact,status) VALUES(?,?,?,?,?,?)";
    public final static String PLAYER_UPDATE="UPDATE " + TableConstant.PLAYER_TABLE + 
                          " SET first_name=?,last_name=?,email=?,squad_position=?,contact=?,status=? WHERE id=?";
}
 