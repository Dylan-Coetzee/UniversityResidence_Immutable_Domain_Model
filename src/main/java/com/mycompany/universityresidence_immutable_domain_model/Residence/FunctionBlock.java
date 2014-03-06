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
public final class FunctionBlock {
    private String buildingID;
    private String name;
    private int Capacity;

    public String getBuildingID() {
        return buildingID;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return Capacity;
    }
    
    private FunctionBlock(Builder builder){
        buildingID = builder.buildingID;
        name = builder.name;
        Capacity = builder.Capacity;  
    }
    
    public static class Builder{
        private String buildingID;
        private String name;
        private int Capacity; 
      
        public Builder(String buildingID){
            this.buildingID = buildingID;
        }
        
        public Builder name(String value){
            name = value;
            return this;
        }
            
        public Builder Capacity(int value){
            Capacity = value;
            return this;
        }
        
        public Builder FunctionBlock(FunctionBlock building){
            name = building.getName();
            Capacity = building.getCapacity(); 
            return this;
        }
        
        public FunctionBlock build(){
            return new FunctionBlock(this);
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
        final FunctionBlock other = (FunctionBlock) obj;
        if (!Objects.equals(this.buildingID, other.buildingID)) {
            return false;
        }
        return true;
    }

}
