package day02_Variables;

public class Variables {
    public static void main(String[] args) {
String s="cadilat";
        System.out.println("solution(s) = " + solution(s));
    }



   public static String solution(String s) {
        String str=s.toLowerCase();
      String result="";
        for (int i = 0; i <=str.length()-1; i++) {
            int count = 0;
            for (int j = 0; j <= str.length()-1; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
                if (count==2){
                    result=""+str.charAt(j);
                }
            }
        }
        return result;
    }
}
