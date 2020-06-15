package day46_final_abstract.Abstraction.Tasks;

abstract public class Browser {

    public String BrowserName;
    abstract void get(String url);
    abstract void close();
    abstract void maximize();

    public String toString() {
        return "Browser name is: " + BrowserName;
    }

    class ChromeBrowser extends Browser {
        public ChromeBrowser() {
            this.BrowserName = BrowserName;
        }

         void get(String url) {
            System.out.println(BrowserName + " browser is opening " + url);
        }

         void close() {
            System.out.println("closes the chrome browser");
        }

        void maximize() {
            System.out.println("maximize the chrome browser");
        }

    }

    class FirefoxBrowser extends Browser {
        public FirefoxBrowser(String BrowserName) {
            this.BrowserName = BrowserName;
        }

         void get(String url) {
            System.out.println(BrowserName + " browser is opening " + url);
        }

         void close() {
            System.out.println("closes the Firefox browser");
        }

         void maximize() {
            System.out.println("maximize the Firefox browser");
        }
    }

    class OperaBrowser extends Browser {

        public OperaBrowser(String BrowserName) {
            this.BrowserName = BrowserName;
        }

         void get(String url) {
            System.out.println(BrowserName + " browser is opening " + url);
        }

         void close() {
            System.out.println("closes the Opera browser");
        }

         void maximize() {
            System.out.println("maximize the Opera browser");
        }
    }
}

