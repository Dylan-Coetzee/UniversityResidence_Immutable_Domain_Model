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
public final class LaundryRoom {
    private String buildingID;
    private int numberOfMachines;
    private int numberOfDryers;
    private int numberOfToilets;

    public String getBuildingID() {
        return buildingID;
    }

    public int getNumberOfMachines() {
        return numberOfMachines;
    }

    public int getNumberOfDryers() {
        return numberOfDryers;
    }

    public int getNumberOfToilets() {
        return numberOfToilets;
    }
    
    private LaundryRoom(Builder builder){
        buildingID = builder.buildingID;
        numberOfMachines = builder.numberOfMachines;
        numberOfDryers = builder.numberOfDryers;
        numberOfToilets = builder.numberOfToilets;
    }
    
    public static class Builder{
        private String buildingID;
        private int numberOfMachines;
        private int numberOfDryers;
        private int numberOfToilets; 
      
        public Builder(String buildingID){
            this.buildingID = buildingID;
        }
        
        public Builder numberOfMachines(int value){
            numberOfMachines = value;
            return this;
        }
            
        public Builder numberOfDryers(int value){
            numberOfDryers = value;
            return this;
        }
        
        public Builder numberOfToilets(int value){
            numberOfToilets = value;
            return this;
        }
        
        public Builder LaundryRoom(LaundryRoom laundryRoom){
            numberOfMachines = laundryRoom.getNumberOfMachines();
            numberOfDryers = laundryRoom.getNumberOfDryers(); 
            numberOfToilets = laundryRoom.getNumberOfToilets();
            return this;
        }
        
        public LaundryRoom build(){
            return new LaundryRoom(this);
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
        final LaundryRoom other = (LaundryRoom) obj;
        if (!Objects.equals(this.buildingID, other.buildingID)) {
            return false;
        }
        return true;
    }
    
    
}
