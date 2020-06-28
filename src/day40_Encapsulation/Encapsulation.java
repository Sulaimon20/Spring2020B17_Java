package day40_Encapsulation;

public class Encapsulation {
    // getter - read only
//hiding the data with private
// we don't have access to data

    private static long SSN;
    private boolean bl;
    private String s;
//      getter - this is only for reading
//to use this, we can have an access to the private data,
    //getter : read only

    long getSSN() {
    return SSN;
    }

    // setter:  write only
     void setSSN(long SSN){
        this.SSN=SSN;
     }

    public boolean isBl() {
        return bl;
    }

    public void setBl(boolean bl) {
        this.bl = bl;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}



