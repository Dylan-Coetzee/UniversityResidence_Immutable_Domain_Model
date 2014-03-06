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
public final class ManagersHouse {
    private List<ResidenceManager> managers;

    public List<ResidenceManager> getManagers() {
        return managers;
    }
   
   private ManagersHouse(ManagersHouse data){
        this.managers = data.managers;
    }
   
   private ManagersHouse(Builder data){
       this.managers = data.managers;
   }
    
    public static class Builder{
        private List<ResidenceManager> managers;
      
        public Builder(List<ResidenceManager> data){
            this.managers = data;
        }
        

        public Builder ManagersHouse(ManagersHouse data){
            this.managers = data.managers;
            return this;
        }
        
        public ManagersHouse build(){
            return new ManagersHouse(this);
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
        final ManagersHouse other = (ManagersHouse) obj;
        if (!Objects.equals(this.managers, other.managers)) {
            return false;
        }
        return true;
    }
    
    
}
