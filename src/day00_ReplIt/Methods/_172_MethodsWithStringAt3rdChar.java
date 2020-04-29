package day00_ReplIt.Methods;

public class _172_MethodsWithStringAt3rdChar {
    public static void main(String[] args) {
        System.out.println(at3("longword","foo"));
    }
    public static String at3(String target,String word)
    {
        String word1=target.substring(0,3);
        String word2=target.substring(3,target.length());
        return word1+word+word2;
    }
}
/*
at3("longword","foo")
will return: "lonfoogword"
              lonfoogword
  }
 */