package JAVABatch15.class32.class17;

public class BookTester {
    public static void main(String[] args) {

        Book pushkin=new Book("A.S.Pushkin","Ruslan i Liudmila",1877);

        Book aitmatov=new Book("C.Aitmatov", "The day lasts more than a Hundred years",1980);

        pushkin.historyOfBooks();
        aitmatov.ageOfBook();
    }
}
