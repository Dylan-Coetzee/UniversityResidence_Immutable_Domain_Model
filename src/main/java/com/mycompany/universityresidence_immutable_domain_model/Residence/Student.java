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
public final class Student {
    private String studentNumber;
    private String name;
    private String surname;

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    
    private Student(Builder builder){
        studentNumber = builder.studentNumber;
        name = builder.name;
        surname = builder.surname; 
    }
    
    public static class Builder{
        private String studentNumber;
        private String name;
        private String surname;
      
        public Builder(String studentNumber){
            this.studentNumber = studentNumber;
        }
        
        public Builder name(String value){
            name = name;
            return this;
        }
        
        public Builder surname(String value){
            surname = value;
            return this;
        }
        
        public Builder Student(Student student){
            studentNumber = student.getStudentNumber();
            name = student.getName(); 
            surname = student.getSurname();
            return this;
        }
        
        public Student build(){
            return new Student (this);
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
        final Student other = (Student) obj;
        if (!Objects.equals(this.studentNumber, other.studentNumber)) {
            return false;
        }
        return true;
    }
    
    
}
