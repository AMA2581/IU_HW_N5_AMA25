public class Address {
    private String state;
    private String city;
    private String street;
    private String zipCode;

    // default constructor
    Address(){
        state = "California";
        city = "Los Angeles";
        street = "25th st";
        zipCode = "900251111";
    }

    // parameter constructor
    Address(String state, String city,
        String street, String zipCode){
        this.state = state;
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
    }

    // copy constructor
    Address(Address t){
        this.state = t.state;
        this.city = t.city;
        this.street = t.street;
        this.zipCode = t.zipCode;
    }

    public String toString(){
        return "Address{" + "state=" + state + ", city=" + city 
        + ", street=" + street + ", zipCode=" + zipCode + "}";
    }
    
    // setter methods
    public void setState(String state){
        this.state = state;
    }

    public void setCity(String city){
        this.city = city;
    }

    public void setStreet(String street){
        this.street = street;
    }

    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }

    // getter methods
    public String getState(){
        return state;
    }

    public String getCity(){
        return city;
    }
    
    public String getStreet(){
        return street;
    }

    public String getZipCode(){
        return zipCode;
    }
    
    public boolean equals(Object obj){
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        Address other = (Address) obj;
        if(this.state != other.state) return false;
        if(this.city != other.city) return false;
        if(this.street != other.street) return false;
        if(this.zipCode != other.zipCode) return false;
        return true;
    }
}
