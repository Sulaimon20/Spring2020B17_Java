package day25_MethodsRecap;

public class Frequency {
    public static void main(String[] args) {
        String str1="javajavajavajava";//AA
        String str2="java";
        int count=0;//if str1 contains str2



        while (str1.contains(str2)){
            count++;
            str1=str1.replaceFirst(str2,"");//we need to remove first index with blank;
        }   // we need to make replace that we are not counting the same index over again

        System.out.println(count);

        String a="python python python python";
        String b="python";
        int num1= Frequency(a,b);//4
        System.out.println(num1);

    }
    public static int Frequency(String str1, String str2){
        int count=0;//if str1 contains str2

        while (str1.contains(str2)){
            count++;
            str1=str1.replaceFirst(str2,"");//we need to remove first index with blank;
        }   // we need to make replace that we are not counting the same index over again

        return count;
    }
}
