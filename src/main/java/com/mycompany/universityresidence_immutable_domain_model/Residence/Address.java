
import java.util.Objects;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author dylan
 */
public final class Address {
    private String street;
    private String city;
    private String province;
    private int zip;

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public int getZip() {
        return zip;
    }
    
    private Address(Builder builder){
        street = builder.street;
        city = builder.city;
        province = builder.province;
        zip = builder.zip;  
    }
    
    public static class Builder{
        private String street;
        private String city;
        private String province;
        private int zip; 
      
        public Builder(String street){
            this.street = street;
        }
        
        public Builder city(String value){
            city = value;
            return this;
        }
        
        public Builder province(String value){
            province = value;
            return this;
        }
        
        public Builder zip(int value){
            zip = value;
            return this;
        }
        
        public Builder Address(Address address){
            city = address.getCity();
            province = address.getProvince();
            zip = address.getZip(); 
            return this;
        }
        
        public Address build(){
            return new Address(this);
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
        final Address other = (Address) obj;
        if (!Objects.equals(this.street, other.street)) {
            return false;
        }
        return true;
    }
    
}
