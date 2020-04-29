package day25_MethodsRecap;
import Resources.Library;
public class test {
    public static void main(String[] args) {
        String str="ABCABABABABA";
        String result=Library.RemoveDuplicates(str);
        System.out.println(result);

        String str1="AABBCDEB";
        String str2="B";

        int num1=Library.Frequency(str1,str2 );
        System.out.println(num1);

        String str3="AABBCCDDFFQQQ";
        String z=Library.FrequencyOfCharacters(str3);
        System.out.println(z);

    }
}
