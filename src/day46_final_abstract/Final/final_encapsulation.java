package day46_final_abstract.Final;

public class final_encapsulation {
    private  int data1=200;
    private int data2=300;
//  GETTER
    public int getData1() {
        return data1;
    }
//  SETTER
    public void setData1(int data1) {
        this.data1 = data1;
    }

    public static void main(String[] args) {
        final_encapsulation obj=new final_encapsulation();
        System.out.println(obj);



    }



}
