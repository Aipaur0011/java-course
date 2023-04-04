package JAVABatch15.class32.Class24;

public class FileTester {
    public static void main(String[] args) {

       File [] files={new JavaFile(1024), new WordFile(25), new pdfFile(50)};


        for (int i = 0; i < files.length ; i++) {
            File f=files[i];
            f.open();
            f.edit();
            f.close();

        }
    }
}
