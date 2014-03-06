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
public final class Block {
    private String blockName;
    private String blockType;
    private int NumberOfStories;
    private int Capacity;

    public String getBlockName() {
        return blockName;
    }

    public String getBlockType() {
        return blockType;
    }

    public int getNumberOfStories() {
        return NumberOfStories;
    }

    public int getCapacity() {
        return Capacity;
    }
    
    private Block(Builder builder){
        blockName = builder.blockName;
        blockType = builder.blockType;
        NumberOfStories = builder.NumberOfStories;
        Capacity = builder.Capacity;  
    }
    
    public static class Builder{
        private String blockName;
        private String blockType;
        private int NumberOfStories;
        private int Capacity;
      
        public Builder(String blockName){
            this.blockName = blockName;
        }
        
        public Builder blockType(String value){
            blockType = value;
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
        
        public Builder Block(Block block){
            blockType = block.getBlockType();
            NumberOfStories = block.getNumberOfStories();
            Capacity = block.getCapacity(); 
            return this;
        }
        
        public Block build(){
            return new Block(this);
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
        final Block other = (Block) obj;
        if (!Objects.equals(this.blockName, other.blockName)) {
            return false;
        }
        return true;
    }
    
    
}
