package day40_Encapsulation;

public class Encapsulation {
    // getter - read only
//hiding the data with private
// we don't have access to data

    private long SSN;
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


    }



