package day25_MethodsRecap;

public class WarmUp2 {
    public static void main(String[] args) {
    String str="Chrome";
    String str2=getDriver(str);
        System.out.println(str2);
    String srt3=getDriver1(str);
        System.out.println(srt3);
    String srt4=getDriver2(str);
        System.out.println(srt4);
    String srt5=getDriver3(str);
        System.out.println(srt5);


    }
    public static String getDriver(String Browser){
//chrome", "firefox", "id", "safari", "edge", "Opera"}, then it returns the name of that specific browser' driver
//					Ex: getDriver("chrome");  ==> "Chrome
        String result = "";
        if (Browser.equalsIgnoreCase("chrome")){
            result="chrome";
        }else if (Browser.equalsIgnoreCase("firefox")) {
            result="firefox";
        }else if (Browser.equalsIgnoreCase("id")) {
            result= "id";
        }else if (Browser.equalsIgnoreCase("safari")) {
            result="safari";
        }else if (Browser.equalsIgnoreCase("edge")) {
             result ="edge";
        }else if (Browser.equalsIgnoreCase("Opera")) {
            result= "Opera";
        }else{
            result="Invalid";
        }
        return result+ " Driver";
    }//multi branch if statement
    public static String getDriver1(String Browser){
    String result = (Browser.equalsIgnoreCase("chrome") ? "chrome" :
      (Browser.equalsIgnoreCase("firefox")) ? "firefox":
      (Browser.equalsIgnoreCase("id")) ? "id":
      (Browser.equalsIgnoreCase("safari")) ? "safari":
      (Browser.equalsIgnoreCase("edge")) ? "edge":
      (Browser.equalsIgnoreCase("Opera")) ? "Opera":
       "Invalid");
        return result+ " Driver";

    }//ternary
    public static String getDriver2(String Browser){
        String result = "";
        switch (Browser.toLowerCase()){
            case "chrome":
                result="Chrome";
                break;
            case "firefox":
                result="Firefox";
                break;
            case "id":
                result="id";
                break;
            case "safari":
                result="Safari";
                break;
            case "edge":
                result="Edge";
                break;
            case "opera":
                result="Opera";
                break;
            default:
                result="Invalid";
        }

        return result+ " Driver";

    }//switch
    public static String getDriver3(String Browser){

        switch (Browser.toLowerCase()){
            case "chrome":return "Chrome Driver";

            case "firefox": return "Firefox Driver";

            case "id": return "id Driver";

            case "safari": return "Safari Driver";

            case "edge": return "Edge Driver";

            case "opera":return "Opera Driver";

            default:
                return "Invalid Driver";
        }



    }//switch other way




}
