package JAVABatch15.class32.class17;
/*
6) Write Book class that will have instance variables and 2 Constructors.
While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
 */

public class Book {

    String book;
    String name;
    int age;

    Book(String bookWriter,String nameOfBook,int ageOfBook){

        book=bookWriter;
        name=nameOfBook;
        age=ageOfBook;

    }



    void historyOfBooks(){
        System.out.println("Book name is "+name+" "+"writer is "+book+"posted since "+age);
    }
    void ageOfBook(){
        System.out.println("Book name is "+name+" "+"writer is "+book);
    }
}
