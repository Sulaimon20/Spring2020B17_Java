package day37_Constructors.Replit;

public class Accumulator {
    int sum;

// constructor
    public Accumulator( int sum  ){
        this.sum=sum;
    }

    // method named getSum
    public int getSum() {
        return sum;
    }

 //A method named add that accepts an integer parameter.
    public void add(int num) {
        sum= sum + num;
    }
    public void remove(int num) {
        sum= sum - num;
    }

//
    public String toString() {
        return "Sum is: " + sum;
    }

    public static void main(String[] args) {

        Accumulator obj=new Accumulator(12);
        //System.out.println(obj.add(1));

    }
}
