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
public final class Security {
    private String securityId;
    private String name;
    private String surname;

    public String getSecurityId() {
        return securityId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    
    private Security(Builder builder){
        securityId = builder.securityId;
        name = builder.name;
        surname = builder.surname; 
    }
    
    public static class Builder{
        private String securityId;
        private String name;
        private String surname;
      
        public Builder(String securityId){
            this.securityId = securityId;
        }
        
        public Builder name(String value){
            name = name;
            return this;
        }
        
        public Builder surname(String value){
            surname = value;
            return this;
        }
        
        public Builder Security(Security security){
            securityId = security.getSecurityId();
            name = security.getName(); 
            surname = security.getSurname();
            return this;
        }
        
        public Security build(){
            return new Security (this);
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
        final Security other = (Security) obj;
        if (!Objects.equals(this.securityId, other.securityId)) {
            return false;
        }
        return true;
    }
    
}
