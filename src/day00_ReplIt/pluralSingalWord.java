package day00_ReplIt;

public class pluralSingalWord {
    public static void main(String[] args) {


        int amt = 9;
        String word = "dish";

        String sent ="";
        if(word.endsWith("ay")||word.endsWith("oy")||word.endsWith("uy")){
            sent=amt+" "+word+"s";
        }else if(word.endsWith("y")){
            sent=amt+" "+word.replace("y","ies");
        }else if(word.endsWith("ey")){
            sent=amt+" "+word+"s";
        }else if(word.endsWith("sh")||word.endsWith("ch")){
            sent=amt+" "+word+"es";
        }else if(word.endsWith("us")){
            sent=amt+" "+word.replace("us","i");
        }else if(word.endsWith("fe")){
            sent=amt+" "+word.replace("fe","ves");
        }else{
            sent=amt+" "+word+"s";
        }
        if(amt==1){
            sent=amt+" "+word;
        }
        System.out.print(sent);
    }

}


