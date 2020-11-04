package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Lambda_Expressions {
	
	public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        Predicate<Integer> oddNumber= x -> x%2 != 0;
        list.removeIf(oddNumber);
        System.out.println(list);//[2, 4, 6, 8]

        System.out.println("================================");

        ArrayList<Integer>list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        Predicate<Integer> lessThan5= x -> x>5;
        list2.removeIf(lessThan5);
        System.out.println(list2);//[1, 2, 3, 4, 5]
        
	System.out.println("=====================================");

        ArrayList<String>list3 = new ArrayList<>(Arrays.asList("Abie","Bie","Muhtar", "momai", "Olu","Wow","Tom"));

        Predicate<String> startsWithM= s -> s.toLowerCase().startsWith("m");
        list3.removeIf(startsWithM);
        System.out.println(list3);//[Abie, Bie, Olu, Wow, Tom]

        System.out.println("=====================================");

        ArrayList<String>list4 = new ArrayList<>(Arrays.asList("Abie","Bie","Muhtar", "Asiya", "Kuzzat","Tom"));

        Predicate<String> startsWithMorA= s -> s.startsWith("M")|| s.startsWith("A");
        list4.removeIf(startsWithMorA);

        System.out.println(list4);


        System.out.println("=====================================");

        ArrayList<Character>chars = new ArrayList<>(Arrays.asList('A','B','3','4','5','@','Z'));

        Predicate<Character> removeDigits= s -> s >=48 && s<=57;
        chars.removeIf(removeDigits);

        System.out.println(chars);


        System.out.println("=====================================");

        ArrayList<Character>chars1 = new ArrayList<>(Arrays.asList('A','B','3','4','5','@','Z'));

        Predicate<Character> removeDigits1= s -> Character.isDigit(s);
        chars1.removeIf(removeDigits1);

        System.out.println(chars1);


        System.out.println("=====================================");


        ArrayList<Character>chars2 = new ArrayList<>(Arrays.asList('&','B','$','!','5','@','$', '%'));

        Predicate<Character> removeSpecial= s -> s>32 &&s<48||s>58 &&s<65;
        chars2.removeIf(removeSpecial);

        System.out.println(chars2);












    }
}
