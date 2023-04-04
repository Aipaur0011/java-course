package JAVABatch15.class32.Class24;

public abstract class Phone {
    /*
    Create a phone class, let's create abstract method like displayPictures
    unlockPhone
    SendText

    2 child classes(Iphone Samsung Google) and provide specific implementation
    let's write code achieve runtime polymorphism
     */

    abstract void displayPictures();

    abstract void unlockPhone();

    abstract void SendText();

}



    class Iphone extends Phone {
        @Override
        void displayPictures() {
            System.out.println("display working good");
        }

        @Override
        void unlockPhone() {
            System.out.println("unlock with face id");

        }

        @Override
        void SendText() {
            System.out.println("can sent text wiht siri");
        }
    }

    class Samsung extends Phone {


        @Override
        void displayPictures() {
            System.out.println("Samsung display works clear");
        }

        @Override
        void unlockPhone() {
            System.out.println("Samsung is unlock with touch");
        }

        @Override
        void SendText() {
            System.out.println("Samsung can sent text");

        }
    }

    class Google extends Phone {

        @Override
        void displayPictures() {
            System.out.println("Display is working");
        }

        @Override
        void unlockPhone() {
            System.out.println("Google is unlock");
        }

        @Override
        void SendText() {
            System.out.println("Google can send text");
        }
    }
