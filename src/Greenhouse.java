public class Greenhouse{
    private String name;
    private String address;
    private int sections;

    // default constructor
    Greenhouse(){
        name = "Greenhouse";
        address = "California - Los Angeles - 25th st";
        sections = 1;
    }

    // parameters constructor
    Greenhouse(String name, String address, int sections) {
        if(!name.isEmpty() || !address.isEmpty()) {
        this.name = name;
        this.address = address;
        this.sections = sections;
        }
        else
            System.err.println("name or address is empty");
    }

    // copy constructor
    Greenhouse(Greenhouse t){
        this.name = t.name;
        this.address = t.address;
        this.sections = t.sections;
    }

    public String toString(){
        return "name: " + this.name +
        ", address: " + this.address +
        ", sections: " + this.sections;
    }

    // setter methods
    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setSections(int sections){
        this.sections = sections;
    }

    // getter methods
    public String getName(){
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public int getSections() {
        return this.sections;
    }

    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        Greenhouse other = (Greenhouse) obj;
        if(this.name != other.name) return false;
        if(this.address != other.address) return false;
        if(this.sections != other.sections) return false;
        return true;
    }

}
