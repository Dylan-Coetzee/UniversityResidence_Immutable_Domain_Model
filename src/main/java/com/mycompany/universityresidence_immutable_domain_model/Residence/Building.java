/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.universityresidence_immutable_domain_model.Residence;

/**
 *
 * @author dylan
 */
public final class Building {
    private int buildingID;
    private String name;
    private int NumberOfStories;
    private int Capacity; 

    public int getBuildingID() {
        return buildingID;
    }
    
    public String getName() {
        return name;
    }
    
    public int getNumberOfStories() {
        return NumberOfStories;
    }

    public int getCapacity() {
        return Capacity;
    }
    
    private Building(Builder builder){
        buildingID = builder.buildingID;
        name = builder.name;
        NumberOfStories = builder.NumberOfStories;
        Capacity = builder.Capacity;  
    }
    
    public static class Builder{
        private int buildingID;
        private String name;
        private int NumberOfStories;
        private int Capacity; 
      
        public Builder(int buildingID){
            this.buildingID = buildingID;
        }
        
        public Builder name(String value){
            name = value;
            return this;
        }
        
        public Builder NumberOfStories(int value){
            NumberOfStories = value;
            return this;
        }
        
        public Builder Capacity(int value){
            Capacity = value;
            return this;
        }
        
        public Builder Building(Building building){
            name = building.getName();
            NumberOfStories = building.getNumberOfStories();
            Capacity = building.getCapacity(); 
            return this;
        }
        
        public Building build(){
            return new Building(this);
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
        final Building other = (Building) obj;
        if (this.buildingID != other.buildingID) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}