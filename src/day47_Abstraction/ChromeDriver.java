package day47_Abstraction;

//this is sub class     extends    superclass
public class ChromeDriver extends RemoteWebDriver {

    //this is abstract override method
    @Override
    public void get(String URL){
        System.out.println("Opening "+URL+" in chrome browser");
    }
    //this is abstract override methods
    @Override
    public void quit(){
        System.out.println("Closing the chrome browser");
    }


}
