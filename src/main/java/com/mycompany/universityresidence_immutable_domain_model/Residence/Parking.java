/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.universityresidence_immutable_domain_model.Residence;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dylan
 */
public final class Parking {
    private int parkNumber;
    //private List<Car> cars;
    private int capacity;

    public int getParkNumber() {
        return parkNumber;
    }

    //public List<Car> getCars() {
    //    return cars;
    //}

    public int getCapacity() {
        return capacity;
    }
    
    private Parking(Builder builder){
        parkNumber = builder.parkNumber;
        //cars.add((Car) builder.cars);
        capacity = builder.capacity;
    }
    
    public static class Builder{
        private int parkNumber;
        //private List<Car> cars;
        private int capacity;
      
        public Builder(int parkNumber){
            this.parkNumber = parkNumber;
        }
        
        //public Builder cars(Car park){
          //  cars.add((Car)park);
            //return this;
        //}
        
          
        public Builder capacity(int value){
            capacity = value;
            return this;
        }

        public Builder Parking(Parking parking){
            //cars.add((Car)parking.getCars());
            capacity = parking.getCapacity(); 
            return this;
        }
        
        public Parking build(){
            return new Parking(this);
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
        final Parking other = (Parking) obj;
        if (this.parkNumber != other.parkNumber) {
            return false;
        }
        return true;
    }
    
    
}
