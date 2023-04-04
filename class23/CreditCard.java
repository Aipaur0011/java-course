package JAVABatch15.class32.class23;
//Create a class CreditCard and define variable balance and interest.
// Create an instance method that will calculate interest based on the given balance.
//Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
//Call the method by creating an object of each of the three classes.

public class CreditCard {

    double balance;
    double interest;

    public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    public void  calculateInterest(){
        System.out.println("interest "+(balance*interest)/100);
    }
}
class Visa extends CreditCard{

    public Visa(double balance, double interest){
        super(balance,interest);
    }
    }
    class AX extends CreditCard{

        @Override
        public void calculateInterest() {
            super.calculateInterest();
        }

        AX(double balance, double interest){
        super(balance, interest);
    }


    }


