package day13_StringClass;

public class startsWithEndsWith {
    public static void main(String[] args) {
        String webSite="www.Cybertekschool.com";
         webSite=webSite.toLowerCase();
         boolean validEnding=webSite.endsWith(".com")||webSite.endsWith(".net")||webSite.endsWith(".edu");

         if (webSite.startsWith("www.") && validEnding){
            System.out.println("valid address");
            }else{
            System.out.println("Invalid address");
        }
        }

    }

/*
must start with www.
ends with .com, .edu, .net, Gov
 */