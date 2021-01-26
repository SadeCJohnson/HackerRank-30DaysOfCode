package ExtraPractice;

public class Computer {
    String operatingSystemName;
    String internetBrowserName;

    //This is the constructor
    //Computer(Windows,Firefox)
    Computer(String operatingSystem, String internetBrowser){
        this.operatingSystemName = operatingSystem;
        this.internetBrowserName = internetBrowser;
    }



    public static void main(String[] arg){
        Computer piaComputer = new Computer("Windows", "Firefox");
    }
}
