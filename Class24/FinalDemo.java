package JAVABatch15.class32.Class24;

public class FinalDemo {
    public static void main(String[] args) {

        final int num; //we have created a constant variable
        num=20;
        //num=30; not possible, because variable is declared final
    }

    final void noONeShouldOverrideIt(){
        System.out.println("This method should never be overridden otherwise it might break the base");
    }
}

class Nelson extends FinalDemo{
    /*void noONeShouldOverrideIt(){ //can't override this method as it is declared as final
        System.out.println("Let's me do that");
    }*/
}
