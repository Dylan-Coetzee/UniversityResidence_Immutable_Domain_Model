/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.universityresidence_immutable_domain_model.Residence;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author dylan
 */
public final class BusWaitingStation {
    private String stationId;
    //private List<Student> students;
    private int Capacity;

    public String getStationId() {
        return stationId;
    }

    //public List<Student> getStudents() {
    //    return students;
    //}

    public int getCapacity() {
        return Capacity;
    }
    
    private BusWaitingStation(Builder builder){
        stationId = builder.stationId;
        //students.add((Student) builder.students);
        Capacity = builder.Capacity;  
    }
    
    public static class Builder{
        private String stationId;
        private List<Student> students;
        private int Capacity;
      
        public Builder(String stationId){
            this.stationId = stationId;
        }
        
        public Builder students(Student student){
            students.add(student);
            return this;
        }
        public Builder Capacity(int value){
            Capacity = value;
            return this;
        }
        
        public Builder BusWaitingStation(BusWaitingStation buswaitingstation){
            stationId = buswaitingstation.getStationId();
            //students.add((Student) buswaitingstation.getStudents());
            Capacity = buswaitingstation.getCapacity(); 
            return this;
        }
        
        public BusWaitingStation build(){
            return new BusWaitingStation(this);
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
        final BusWaitingStation other = (BusWaitingStation) obj;
        if (!Objects.equals(this.stationId, other.stationId)) {
            return false;
        }
        return true;
    }
    
    
}
