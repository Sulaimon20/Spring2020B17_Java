package OfficeHours._4_22_Methods;

public class reverse {
    public static void main(String[] args) {

        String str = "Cybertek";
        String rev= reverse(str);
        System.out.println(rev);
    }
        public static String reverse(String str){
            String result="";
            for (int i=str.length()-1; i>=0; i--){
                result+=str.charAt(i);
            }
            return  result;
        }


}
