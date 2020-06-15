package day00_Re_Studying.Exam;

class C{
     public C (){
            System.out.println("C");
        }
    }
class B extends C{
     public B(){
            System.out.println("B");
        }
     }
 class A extends B{
     public A(){
            System.out.println("A");
     }

}



public class _9_Inheritance {
    public static void main(String[] args) {
        //A a=new A();

        int z[]={1,2,3};
        int x[]={1,2,3,4,5};
        x=z;
        for (int each:x){
            System.out.println(each+" ");
        }


    }
}
