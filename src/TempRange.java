public class TempRange {
    private int minTmp, maxTmp;

    // default constructor
    TempRange(){
        this.minTmp = 50;
        this.maxTmp = 60;
    }

    // parameter constructor
    TempRange(int minTmp, int maxTmp){
        if (maxTmp > minTmp){
            this.minTmp = minTmp;
            this.maxTmp = maxTmp;
        }
        else 
            System.err.println("invalid min and max values");
    }

    // copy constructor
    TempRange(TempRange t){
        this.minTmp = t.minTmp;
        this.maxTmp = t.maxTmp;
    }

    // setter method
    public void setMinTmp(int minTmp){
        this.minTmp = minTmp;
    }

    public void setMaxTmp(int maxTmp){
        this.maxTmp = maxTmp;
    }

    // getter method
    public int getMinTmp(){
        return this.minTmp;
    }

    public int setMaxTmp(){
        return this.maxTmp;
    }

    public boolean equals(Object obj){
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        TempRange other = (TempRange) obj;
        if(this.minTmp != other.minTmp) return false;
        if(this.maxTmp != other.maxTmp) return false;
        return true;
    }

    public String toString(){
        return "minTmp=" + this.minTmp + ","
        + "maxTmp=" + maxTmp;
    }
}
