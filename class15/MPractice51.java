package JAVABatch15.class32.class15;
/*
Create a method createEmail(). Based on values of users name, lastName and email type, your method should return complete email Address.
 Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or

 type=>String
 name=>createEmail()
 parameters=> String name, String lastName, String email

 [
 return
 }
 */

public class MPractice51 {

    String createEmail(String firstName, String lastName, String email) {

        return firstName+lastName+"@"+email+".com";
    }

}
