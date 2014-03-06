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
public final class Car {
    private String carId;
    private String name;
    private String model;

    public String getCarId() {
        return carId;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }
    
    private Car(Builder builder){
        carId = builder.carId;
        name = builder.name;
        model = builder.model; 
    }
    
    public static class Builder{
        private String carId;
        private String name;
        private String model;
      
        public Builder(String carId){
            this.carId = carId;
        }
        
        public Builder name(String value){
            name = value;
            return this;
        }
        
        public Builder model(String value){
            model = value;
            return this;
        }
        
        public Builder Car(Car car){
            carId = car.getCarId();
            name = car.getName(); 
            model = car.getModel();
            return this;
        }
        
        public Car build(){
            return new Car (this);
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
        final Car other = (Car) obj;
        if (!Objects.equals(this.carId, other.carId)) {
            return false;
        }
        return true;
    }
    
    
}
