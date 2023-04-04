package JAVABatch15.class32.Class24;

public class Task {

    public static void main(String[] args) {
        Computer [] computers={new Apple(), new HP()};

        for(Computer c:computers){
            c.playVideo();
            c.browserInternet();


            if(c instanceof  Apple){//we are checking if the variable c contains the object of on Apple class
                Apple apple=(Apple)c;
                apple.installApp();
            }
        }
    }
}
class Computer{
    int RAM;
    int storage;
    String OS;


    void playVideo(){
        System.out.println("Video playing");
    }

    void browserInternet(){
        System.out.println("Browse the Internet");
    }
}


class Apple extends Computer{

    void playVideo(){
        System.out.println("Playing the internet using safari");
    }

    void editVideo(){
        System.out.println("Editing on iMovies");
    }

    void installApp(){
        System.out.println("Installing the apps from App Store");
    }
}


class HP extends Computer{
    void browserInternet(){
        System.out.println("Browsing using Chrome");
    }
    void playVideo(){
        System.out.println("Playing video using the ");
    }
}

