package day00_Re_Studying.Exam;

public class _70_StringAsVarAndObj {
    public static void main(String[] args) {
        String str1="Java";
        String str2=new String("java");
        if (str1.toLowerCase().equals(str2)){
            System.out.println("egual");
        }else{
            System.out.println("not equal");
        }
    }
}
