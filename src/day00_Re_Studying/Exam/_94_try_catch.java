package day00_Re_Studying.Exam;

public class _94_try_catch {

}
 class App{
    String myStr="7007";
    public void doStaff(String str){
        int myNum=0;
        try{
            String myStr=str;
            myNum=Integer.parseInt(myStr);
        }catch (NumberFormatException e){;
        System.out.println("Error");}
        System.out.println(myStr+" "+myNum);
    }

     public static void main(String[] args) {
         App obj=new App();
         obj.doStaff("9009");
     }

}
