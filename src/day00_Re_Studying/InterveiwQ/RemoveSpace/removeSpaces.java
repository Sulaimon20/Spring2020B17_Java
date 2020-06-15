package day00_Re_Studying.InterveiwQ.RemoveSpace;

public class removeSpaces {
    public static void main(String[] args) {
        String str = "     Such   a    good   day    today    ";
        str = str.trim();
        while (str.contains("  ") ){
            str = str.replace("  ", " ");
        }
        System.out.println(str);

//method 2
            String str1 = "     Such   a    good   day    today    ";
            String str2=str1.replaceAll("\\s+"," ");
            System.out.println(str2);
        }
    }



