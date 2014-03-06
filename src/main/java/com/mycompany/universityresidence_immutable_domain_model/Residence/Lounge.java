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
public final class Lounge {
        private String loungeID;
        private int numberOfCouches;
        private int numberOfTables;

    public String getLoungeID() {
        return loungeID;
    }

    public int getNumberOfCouches() {
        return numberOfCouches;
    }

    public int getNumberOfTables() {
        return numberOfTables;
    }
        
    private Lounge(Builder builder){
        loungeID = builder.loungeID;
        numberOfCouches = builder.numberOfCouches;
        numberOfTables = builder.numberOfTables;
    }
    
    public static class Builder{
        private String loungeID;
        private int numberOfCouches;
        private int numberOfTables; 
      
        public Builder(String loungeID){
            this.loungeID = loungeID;
        }
        
        public Builder numberOfCouches(int value){
            numberOfCouches = value;
            return this;
        }
            
        public Builder numberOfTables(int value){
            numberOfTables = value;
            return this;
        }

        public Builder Lounge(Lounge lounge){
            numberOfCouches = lounge.getNumberOfCouches();
            numberOfTables = lounge.getNumberOfTables(); 
            return this;
        }
        
        public Lounge build(){
            return new Lounge(this);
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
        final Lounge other = (Lounge) obj;
        if (!Objects.equals(this.loungeID, other.loungeID)) {
            return false;
        }
        return true;
    }
    
    
}
