package day40_Encapsulation.ReplIt;

public class Calc {

    private int x;
    private int y;
    private int result;

    public int getResult() {
        return result;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void plus(){
        result=x+y;
    }
    public void minus(){
        result=x-y;
    }

    public static void main(String[] args) {

        Calc a = new Calc();
        a.setX(10);
        a.setY(5);
        a.minus();
        System.out.println("1+1 = "+ a.getResult());
        a.plus();
        System.out.println("1+1 = "+ a.getResult());


    }

}
