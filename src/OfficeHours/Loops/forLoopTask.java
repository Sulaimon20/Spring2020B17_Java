package OfficeHours.Loops;
public class forLoopTask {
    public static void main(String[] args) {

        for (int i=0; i<=10; i++ ){
            if (i==3){
                continue;
            }
            System.out.print(i);//sout: 1245678910
        }
        System.out.println();
        System.out.println(" =========================");
         String name="ANNA";
//          Reverse a word
         String result="";
            int lastindex=name.length()-1;     // we start to get the last index
            for (int i=lastindex; i>=0; i--) { //
                result+=name.charAt(i);
            }
        System.out.print(result); // ANNA
        System.out.println("\n");
            if (name.equalsIgnoreCase(result)){
                System.out.println(name+" palindrome");
            }else{
                System.out.println(name+"is not palindrome");
            }
        System.out.println("+++++++++");
            String name1="Gulen";
            String result1 = "";
            for (int i=0; i<name1.length()-1; i++){
                result1+=name1.charAt(i);
            }
        System.out.println(result1);
        System.out.println(name1.equals(result1));

    }
}
