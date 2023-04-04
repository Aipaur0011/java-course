package JAVABatch15.class32.class12;
//razrewaet vyvesti znak/bukvu
public class StringDemo8countLetter {
    public static void main(String[] args) {
        String str="Java is love";
        char c=str.charAt(2);
        System.out.println(c);


        for (int i = 0; i <str.length() ; i++) {
            System.out.print(str.charAt(i));
        }

        int sum=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='a'){
                sum++;

            }

        }
        System.out.println(sum);

    }


}
