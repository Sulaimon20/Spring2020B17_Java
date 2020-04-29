package OfficeHours;

class Practice_4_1 {
    public static void main(String[] args) {
        String sentence="I like Java";
        System.out.println(sentence.substring(7,10)+1);

        String str="I like C#, C# is cool";
         str=str.replace("C", "Java");
        System.out.println(str);
        str=str.replaceFirst("C#", "Java");
        System.out.println(str);
    }
}
