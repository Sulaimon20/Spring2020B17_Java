package day00_Re_Studying.Constructor;

interface Test{
    void method();

}
public class PrivateConstructor implements Test{
    private PrivateConstructor(){}

    public static void main(String[] args) {
        PrivateConstructor obj=new PrivateConstructor();


    }

    @Override
    public void method() {

    }
}
// Test extends PrivateConstructor{
  //  public static void main(String[] args) {
//        PrivateConstructor obj=new PrivateConstructor();

    //}
//}

