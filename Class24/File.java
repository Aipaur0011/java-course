package JAVABatch15.class32.Class24;
/*
Create a class File that will have the following behaviors: open, edit, close.
Edit and close are implemented method while open is an abstract.
Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
 Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc
 */

public abstract class File {

    int size;

    File(int size) {
        this.size=size;
    }

    abstract void open();


    void edit(){
        System.out.println("editing the file");
    }

    void close(){
        System.out.println("CLosing the file");
    }
}



class JavaFile extends File{

    JavaFile(int size){
        super(size);
    }

    void open(){
        System.out.println("Opening the file intelliJ");
    }

    @Override
    void edit() {
        System.out.println("editing the file in intelliJ");
    }

    void close(){
        System.out.println("Use close  button in IntelliJ");
    }
}



class WordFile extends File{

    WordFile(int size){
        super(size);
    }

    @Override
    void open() {
        System.out.println("Opening the file in Microsoft word ");
    }

    @Override
    void edit() {
        System.out.println("Editing the file in the Microsoft word");
    }

    @Override
    void close() {
        System.out.println("Click on close button in Microsoft files");
    }
}

class pdfFile extends File{

    pdfFile(int size){
        super(size);
    }
    void open() {
        System.out.println("Opening the file in Adobe reader ");
    }

    @Override
    void edit() {
        System.out.println("Using the file in Adobe ");
    }

    @Override
    void close() {
        System.out.println("Click on close button in Adobe reader");
    }
}



