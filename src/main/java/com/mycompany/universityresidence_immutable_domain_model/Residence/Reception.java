/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.universityresidence_immutable_domain_model.Residence;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author dylan
 */
public final class Reception {
   //private List<Security> securities;
    private String name;
    private int ID;
    
    private Reception(){};
    private Reception(Reception data){
        this.ID = data.ID;
        this.name = data.name;
    }
    
    private Reception(Builder data){
        this.ID = data.ID;
        this.name = data.name;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }
    
    public static class Builder{
        private String name;
        private int ID;
        
        public Builder(int value){
            this.ID = value;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        
        public Builder Reception(Reception data){
            this.name = data.name;
            return this;
        }
        
        public Reception build(){
            return new Reception(this);
        }
    } 

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.ID;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Reception other = (Reception) obj;
        if (this.ID != other.ID) {
            return false;
        }
        return true;
    }
    
    
    
    
}
