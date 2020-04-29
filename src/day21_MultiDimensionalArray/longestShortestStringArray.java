package day21_MultiDimensionalArray;

public class longestShortestStringArray {
    public static void main(String[] args) {

        String[] names = {"Iman", "Omar", "Muhtar", "Emrah", "Mohammed", "Ana", "AAAAABBBBBBBBCCCCCC"};

        int maxLengthString = names[0].length(); //4
        int minLengthString = names[0].length();

        String logestword = names[0];
        String shortestWord = names[0] ;

        for(int i = 0; i < names.length ; i++  ){
//          for longest word
            if(names[i].length() > maxLengthString ){
                maxLengthString = names[i].length();
                logestword = names[i];
            }
//          for shortest word
            if(names[i].length() < minLengthString){
                minLengthString = names[i].length();
                shortestWord = names[i];
            }

        }


        System.out.println(logestword);
        System.out.println(shortestWord);

    }
}
