/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsptechs.main.bean.ui.tree.database.bean;

import lombok.Data;

/**
 *
 * @author sarkhanrasullu
 */
@Data
public class SUDatabaseBean {

    private String name;
    private SUConnectionBean connection;
    
    @Override
    public String toString() {
        return name;
    }

    public SUDatabaseBean(String name, SUConnectionBean connection) {
        this.name = name;
        this.connection = connection;
    }
    
    

}
