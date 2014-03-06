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
public final class SecurityRoom {
    private List<Security> securities;

    public List<Security> getSecurities() {
        return securities;
    }
   
   private SecurityRoom(Builder builder){
        securities = builder.securities;
    }
    
    public static class Builder{
        private List<Security> securities;
      
        public Builder(List<Security> sec){
            this.securities = sec;
        }
        

        public Builder SecurityRoom(SecurityRoom sec){
            this.securities = sec.securities;
            return this;
        }
        
        public SecurityRoom Build(){
            return new SecurityRoom(this);
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
        final SecurityRoom other = (SecurityRoom) obj;
        if (!Objects.equals(this.securities, other.securities)) {
            return false;
        }
        return true;
    }
    
    
}
