public class Section {
    private Plant [] plants;
    private int area;
    private TempRange tempRange;

    // default constructor
    Section(){
        tempRange = new TempRange(30,40);
        plants = new Plant[10];
        for(int i = 0; i < plants.length; i++){
            plants[i] = new Plant();
        }
        area = 10;
    }

    // parameter constructor
    Section(int area, TempRange tempRange){
        this.area = area;
        this.tempRange = tempRange;
        plants = new Plant[area];
        for(int i = 0; i < plants.length; i++){
            plants[i] = new Plant();
        }
    }

    // copy constructor
    Section(Section s){
        this.area = s.area;
        this.tempRange = s.tempRange;
        plants = new Plant[s.plants.length];
        for(int i = 0; i < plants.length; i++){
            plants[i] = new Plant(s.plants[i]);
        }
    }

    // equals operator
    public boolean equals(Object obj){
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        Section other = (Section)obj;
        if(area != other.area) return false;
        if(tempRange != other.tempRange) return false;
        for(int i = 0; i < plants.length; i++){
            if(!plants[i].equals(other.plants[i])) return false;
        }
        return true;
    }

    // toString
    public String toString() {
        String s = "area=" + area + ", tempRange=" + tempRange + ", plants=";
        for(int i = 0; i < plants.length; i++){
            s += plants[i].toString() + " ";
        }
        return s;
    }

    // setter methods
    public void setArea(int area) {
        this.area = area;
    }

    public void setTempRange(TempRange tempRange) {
        this.tempRange = tempRange;
    }

    public void setPlants(Plant [] plants) {
        this.plants = plants;
    }

    // getter methods
    public int getArea(){
        return this.area;
    }

    public TempRange getTempRange(){
        return this.tempRange;
    }
    
    public Plant [] getPlants(){
        return this.plants;
    }
}
