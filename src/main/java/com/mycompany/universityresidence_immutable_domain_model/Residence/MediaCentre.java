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
public final class MediaCentre {
    private int buildingId;
    private int numberOfPcs;
    private int numberOfKeyboards;

    public int getBuildingId() {
        return buildingId;
    }

    public int getNumberOfPcs() {
        return numberOfPcs;
    }

    public int getNumberOfKeyboards() {
        return numberOfKeyboards;
    }
    
    private MediaCentre(Builder builder){
        buildingId = builder.buildingId;
        numberOfPcs = builder.numberOfPcs;
        numberOfKeyboards = builder.numberOfKeyboards;
    }
    
    public static class Builder{
        private int buildingId;
        private int numberOfPcs;
        private int numberOfKeyboards;
      
        public Builder(int buildingId){
            this.buildingId = buildingId;
        }
        
        public Builder numberOfPcs(int value){
            numberOfPcs = value;
            return this;
        }
            
        public Builder numberOfKeyboards(int value){
            numberOfKeyboards = value;
            return this;
        }

        public Builder MediaCentre(MediaCentre mediaCentre){
            numberOfPcs = mediaCentre.getNumberOfPcs();
            numberOfKeyboards = mediaCentre.getNumberOfKeyboards(); 
            return this;
        }
        
        public MediaCentre build(){
            return new MediaCentre(this);
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
        final MediaCentre other = (MediaCentre) obj;
        if (this.buildingId != other.buildingId) {
            return false;
        }
        return true;
    }
    
    
}
