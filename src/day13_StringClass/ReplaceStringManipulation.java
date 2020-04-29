package day13_StringClass;

public class ReplaceStringManipulation {
    public static void main(String[] args) {
        String s2="I like C# programaring";
        s2=s2.replace("C#", "Java");
        System.out.println(s2);//                       I like Java programaring
        String name = "COVID 18";
        name=name.replace("18", "19");
        System.out.println(name);//                         COVID 19

        String r2="Tomorrow is Monday, Tomorrow is Tueasday";
        r2=r2.replace("Tomorrow","Today");
        System.out.println(r2);//                   Today is Monday, Today is Tueasday

    }
}
