package day07_practices;

public class Browser {

    public static void main(String[] args) {

        String browserName = "";

        if (browserName == "chrome" || browserName == "firefox" || browserName == "opera"
        || browserName == "safari" || browserName == "edge"){
            if (browserName == "chrome"){
                System.out.println(browserName + " browser is selected");
            } else if (browserName == "firefox") {
                System.out.println(browserName + " browser is selected");
            } else if (browserName == "opera") {
                System.out.println(browserName + " browser is selected");
            } else if (browserName == "safari") {
                System.out.println(browserName + " browser is selected");
            }else {
                System.out.println(browserName + " browser is selected");
            }
        }else {
            System.out.println("invalid browser name");
        }


    }
}

