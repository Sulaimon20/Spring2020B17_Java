package day44_Exceptions.warmUp;

public class Browsers {

    protected void openBrowser() {
        System.out.println("opens the default browser");
    }

    protected void closeBrowser() {
        System.out.println("closes the default browser");
    }

}

class ChromeBrowser extends Browsers {
    public void openBrowser() {
        System.out.println("opens the chrome browser");
    }

    public void closeBrowser() {
        System.out.println("closes the chrome browser");
    }
}

class FirefoxBrowser extends Browsers {

     public void openBrowser() {
         System.out.println("opens the Firefox browser");
     }

    public void closeBrowser() {
        System.out.println("closes the Firefox browser");
    }
 }

class OperaBrowser extends Browsers {
        @Override
        public void openBrowser() {
            System.out.println("opens the Opera browser");
        }
        public void closeBrowser() {
            System.out.println("closes the Opera browser");
        }
    }

class Test extends Browsers {
    public static void main(String[] args) {

        Test testBrowser=new Test();
        testBrowser.openBrowser();
        testBrowser.closeBrowser();

        Browsers testChrome=new ChromeBrowser();
        testChrome.openBrowser();
        testChrome.closeBrowser();

        Browsers testFirebox=new FirefoxBrowser();
        testFirebox.openBrowser();
        testFirebox.closeBrowser();

        Browsers testOpera=new OperaBrowser();
        testOpera.openBrowser();
        testOpera.closeBrowser();


        /*
        ChromeBrowser testChrome=new OperaBrowser();
        testChrome.openBrowser();
        testChrome.closeBrowser();

        FirefoxBrowser testFirebox=new FirefoxBrowser();
        testFirebox.openBrowser();
        testFirebox.closeBrowser();

        OperaBrowser testOpera=new OperaBrowser();
        testOpera.openBrowser();
        testOpera.closeBrowser();
*/
    }

    }

/*

    5. create a class called Test:
            create an object of each browsers and call the openBrowser & closeBrowser actions
 */