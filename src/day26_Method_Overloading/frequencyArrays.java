package day26_Method_Overloading;

public class frequencyArrays {
    public static void main(String[] args) {
        String str="ABB";
        char ch='A';
        int result=frequency(str,ch);
        System.out.println(result);
    }
public static int frequency (String str, char ch){
    char [] arr=str.toCharArray();//[A,A,A]
    int count=0;
    for (int each: arr){
        if (each==ch){
            count++;
        }
    }
    return count;

}
}
