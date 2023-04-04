package JAVABatch15.class32.class19;

public class ThisKeyword {

    int a,b;

    ThisKeyword(int a, int b){
        this.a=a;
        this.b=b;
    }

    void hello(){
        System.out.println("hello batch 15");
    }

    void howAreyYou(){
        System.out.println("How are you batch 15");
    }

    void greetings(){
        this.hello();//this keyword refers to the current instance methods
        this.howAreyYou();
    }


    public void sum(int a, int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {

        ThisKeyword obj=new ThisKeyword(10,20);
        obj.sum(100,200);

        //----------------------------
        obj.greetings();


    }
}
