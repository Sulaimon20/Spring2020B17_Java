package day14_StringClass;
//boolean expression
public class isEmpty {
    public static void main(String[] args) {
        String str= " ";//it is not empty therefore it is false
        boolean str1=str.isEmpty();
        System.out.println(str1);
        String userName=" ";
        if (userName.isEmpty()){
            System.out.println("please provide the user name first");
        }
    }
}
