package day54_Maps_GarbageCollector;
public class String_VS_Buffer_VS_Builder {

    public static void main(String[] args) {

        String str1 = "Cybertek";
        str1.concat(" School");  // "Cybertek School"

        System.out.println(str1);   // Cybertek

        System.out.println("===============================================");

        StringBuilder builder = new StringBuilder("Cybertek");
        builder.append(" School");

        System.out.println(builder);//Cybertek School

        System.out.println("================================================");
        StringBuffer buffer = new StringBuffer("Cybertek");
        buffer.append(" School");

        System.out.println(buffer);//Cybertek School

        System.out.println("============================================");

        String word = "ABCD";
        String word2 = "Java java is language";


        StringBuilder sb = new StringBuilder(word).reverse();
       // sb.reverse();

        System.out.println(sb);
        StringBuilder sb1 = new StringBuilder(word2).replace(4,9, "");
        System.out.println("before " + word2);
        System.out.println("after " + sb1);
        word = sb.toString();

        System.out.println(word);






    }


}