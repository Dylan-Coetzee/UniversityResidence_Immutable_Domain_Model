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
public abstract class CatsvilleResidence implements Residence {
    private String name;

    public String getName() {
        return name;
    }
    
    private CatsvilleResidence(Builder builder){
        name = builder.name;
    }
    
    public static class Builder{
        private String name;
      
        public Builder(String name){
            this.name = name;
        }
        
        public Builder CatsvilleResidence(CatsvilleResidence CatsvilleResidence){
            return this;
        }
        
        public CatsvilleResidence build(){
            return new CatsvilleResidence(this) {};
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final CatsvilleResidence other = (CatsvilleResidence) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
    @Override
    public String getResidenceName(){
        return "Catsville";
    }
}
