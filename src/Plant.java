public class Plant {

    private String name;
    private String type;
    private String model;
    private int age;
    private Image [] img;
    private TempRange tempRange;
    
    // default constructor
    public Plant(){
        this.name = "Plant";
        this.type = "rose";
        this.model = "rose";
        this.age = 2;
        this.img[0] = new Image("a.png");
        this.tempRange = new TempRange(50, 60);
    }

    // parameter constructor
    public Plant(String name, String type, String model, Image [] img, TempRange tempRange){
        this.name = name;
        this.type = type;
        this.model = model;
        this.img = img;
        this.tempRange = tempRange;
    }

    // copy constructor
    public Plant(Plant p){
        this.name = p.name;
        this.type = p.type;
        this.model = p.model;
        this.img = p.img;
        this.tempRange = p.tempRange;
    }

    // equals operator
    public boolean equals(Object obj){
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        Plant other = (Plant)obj;
        if(type != other.type) return false;
        if(name != other.name) return false;
        if(model != other.model) return false;
        if(img != other.img) return false;
        if(tempRange != other.tempRange) return false;
        return true;
    }

    // toString
    public String toString() {
        return "name=" + name + ", img=" + img + ", tempRange=" + tempRange;
    }

    // setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // getter methods
    public String getName(){
        return this.name;
    }

    public String getType(){
        return this.type;
    }

    public int getAge(){
        return this.age;
    }
}
