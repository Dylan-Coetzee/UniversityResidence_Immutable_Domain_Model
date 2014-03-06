/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.universityresidence_immutable_domain_model.Residence;

import java.util.List;

/**
 *
 * @author dylan
 */
public final class Room {
    private int roomNumber;
    //private List<Student> students;
    private int roomSize;
    private String roomColour;
    private String matColour;

    public int getRoomNumber() {
        return roomNumber;
    }

    //public List<Student> getStudents() {
    //    return students;
    //}

    public int getRoomSize() {
        return roomSize;
    }

    public String getRoomColour() {
        return roomColour;
    }

    public String getMatColour() {
        return matColour;
    }
    
    private Room(Builder builder){
        roomNumber = builder.roomNumber;
        //students.add((Student) builder.students);
        roomSize = builder.roomSize;
        roomColour = builder.roomColour; 
        matColour = builder.matColour;
    }
    
    public static class Builder{
        private int roomNumber;
        private List<Student> students;
        private int roomSize;
        private String roomColour;
        private String matColour;
      
        public Builder(int value){
            this.roomNumber = roomNumber;
        }
        
        public Builder students(Student student){
            students.add(student);
            return this;
        }
        
        public Builder roomSize(int value){
            roomSize = value;
            return this;
        }
        
        public Builder roomColour(String value){
            roomColour = value;
            return this;
        }
        
        public Builder matColour(String value){
            matColour = value;
            return this;
        }
        
        public Builder Room(Room room){
            roomNumber = room.getRoomNumber();
            //students.add((Student) room.getStudents());
            roomSize = room.getRoomSize();
            roomColour = room.getRoomColour();
            matColour = room.getMatColour();
            return this;
        }
        
        public Room build(){
            return new Room(this);
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
        final Room other = (Room) obj;
        if (this.roomNumber != other.roomNumber) {
            return false;
        }
        return true;
    }
    
}
