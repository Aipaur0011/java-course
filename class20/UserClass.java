package JAVABatch15.class32.class20;

public class UserClass {
    String name;
    int mobileNum;

    UserClass(String name, int mobileNum){
        this.name = name;
        this.mobileNum = mobileNum;
    }
}
class userInfo extends UserClass {
    String address;

    userInfo(String name, int mobileNum, String address){
        super(name, mobileNum);
        this.address = address;
    }
    void userDetails(){
        System.out.println("Name: " + name);
        System.out.println("Mobile Number: " + mobileNum);
        System.out.println("Address: " + address);
    }
    public static void main(String[] args) {
        userInfo user = new userInfo("Amber", 658487, "2365 Main St");
        user.userDetails();
    }
}

