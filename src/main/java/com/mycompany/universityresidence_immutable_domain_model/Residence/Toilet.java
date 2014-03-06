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
public final class Toilet {
    private String toiletId;
    private int numberOfShowers;
    private int numberOfToilets;
    private int numberOfBaths;
    private String toiletColour;

    public String getToiletId() {
        return toiletId;
    }

    public int getNumberOfShowers() {
        return numberOfShowers;
    }

    public int getNumberOfToilets() {
        return numberOfToilets;
    }

    public int getNumberOfBaths() {
        return numberOfBaths;
    }

    public String getToiletColour() {
        return toiletColour;
    }
    
    private Toilet(Builder builder){
        toiletId = builder.toiletId;
        numberOfShowers = builder.numberOfShowers;
        numberOfToilets = builder.numberOfToilets;
        numberOfBaths = builder.numberOfBaths;  
    }
    
    public static class Builder{
        private String toiletId;
        private int numberOfShowers;
        private int numberOfToilets;
        private int numberOfBaths;
        private String toiletColour;
      
        public Builder(String kitchenId){
            this.toiletId = kitchenId;
        }
        
        public Builder numberOfShowers(int value){
            numberOfShowers = value;
            return this;
        }
        
        public Builder numberOfToilets(int value){
            numberOfToilets = value;
            return this;
        }
        
        public Builder numberOfBaths(int value){
            numberOfBaths = value;
            return this;
        }
        
        public Builder toiletColour(String value){
            toiletColour = value;
            return this;
        }
        
        public Builder Toilet(Toilet toilet){
            numberOfShowers = toilet.getNumberOfShowers();
            numberOfToilets = toilet.getNumberOfToilets(); 
            numberOfBaths = toilet.getNumberOfBaths();
            toiletColour = toilet.getToiletColour();
            return this;
        }
        
        public Toilet build(){
            return new Toilet (this);
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Toilet other = (Toilet) obj;
        if (!Objects.equals(this.toiletId, other.toiletId)) {
            return false;
        }
        return true;
    }
    
}
