package day16_ForLoop;

public class EnglishAlphabet {
    public static void main(String[] args) {
        for (char ch='A'; ch<='Z'; ch++){
            System.out.print(ch+" ");//A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
        }
        System.out.println("\n");
        for (char ch='Z'; ch>='A'; ch--){
            System.out.print(ch+" ");//Z Y X W V U T S R Q P O N M L K J I H G F E D C B A
        }
        System.out.println("\n");

        for (char ch='a'; ch<='z'; ch++){
            System.out.print(ch+" ");//a b c d e f g h i j k l m n o p q r s t u v w x y z
        }
        System.out.println("\n");
        for (char ch='z'; ch>='a'; ch--){
            System.out.print(ch+" ");//z y x w v u t s r q p o n m l k j i h g f e d c b a
        }
    }
}
