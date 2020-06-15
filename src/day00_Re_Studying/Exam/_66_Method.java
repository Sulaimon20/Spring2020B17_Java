package day00_Re_Studying.Exam;

public class _66_Method {
    static int count=0;
    int i=0;

    public void changeCount(){
       while (i<5){
           i++;
           count++;
       }
    }

    public static void main(String[] args) {
        _66_Method obj1=new _66_Method();
        _66_Method obj2=new _66_Method();

        obj1.changeCount();
        obj2.changeCount();

        System.out.println(obj1.count+" "+obj2.count);
    }
}
