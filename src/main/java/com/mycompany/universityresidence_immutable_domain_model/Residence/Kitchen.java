/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.universityresidence_immutable_domain_model.Residence;

import java.util.Objects;

/**
 *
 * @author dylan
 */
public final class Kitchen {
    private String kitchenId;
    private String stove;
    private String fridge;
    private String basin;

    public String getKitchenId() {
        return kitchenId;
    }

    public String getStove() {
        return stove;
    }

    public String getFridge() {
        return fridge;
    }

    public String getBasin() {
        return basin;
    }
    
    private Kitchen(Builder builder){
        kitchenId = builder.kitchenId;
        stove = builder.stove;
        fridge = builder.fridge;
        basin = builder.basin;  
    }
    
    public static class Builder{
        private String kitchenId;
        private String stove;
        private String fridge;
        private String basin;
      
        public Builder(String kitchenId){
            this.kitchenId = kitchenId;
        }
        
        public Builder stove(String value){
            stove = value;
            return this;
        }
        
        public Builder fridge(String value){
            fridge = value;
            return this;
        }
        
        public Builder basin(String value){
            basin = value;
            return this;
        }
        
        public Builder Kitchen(Kitchen kitchen){
            stove = kitchen.getStove();
            fridge = kitchen.getFridge(); 
            basin = kitchen.getBasin();
            return this;
        }
        
        public Kitchen build(){
            return new Kitchen (this);
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Kitchen other = (Kitchen) obj;
        if (!Objects.equals(this.kitchenId, other.kitchenId)) {
            return false;
        }
        return true;
    }
}
