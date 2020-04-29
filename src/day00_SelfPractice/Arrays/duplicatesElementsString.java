package day00_SelfPractice.Arrays;
//DUPLICATES ELEMENTS IN A STRING ARRAY

public class duplicatesElementsString {

    public static void main(String[] args) {

        String[] elements = {"Aba", "B", "C", "D", "F", "A"};
        String r=duplicatesElements(elements);
        System.out.println(r);

        int [] numbers={1,2,3,4,5,6,1,2};
        int x=duplicateNumbers(numbers);
        System.out.println(x);


    }
    public static String duplicatesElements(String[] elements) {
        String result="";
        for (int i = 0; i < elements.length; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                if (elements[i].equals(elements[j])) {
                    result = elements[i];
                }
            }
        }
            return result;

    }
    public static int duplicateNumbers(int [] numbers){
        int count=0;

        for (int i=0; i<numbers.length;i++){
            for (int j=i+1; j<numbers.length; j++){
                if (numbers[i]==numbers[j]){
                    count=numbers[i];
                }
            }
        }
return count;


    }

}

