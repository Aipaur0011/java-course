package JAVABatch15.class32.class9;
/*
Create an array of countries. While retrieving
all values from an array print capital for each country choose any five countries.
 */
public class HW6 {
    public static void main(String[] args) {

        String [] counties={"Cyprus", "Kyrgyzstan", "Turkey", "USA", "Uzbekistan"};
        String [] capitals={"Nicosia", "Bishkek", "Istanbul", "Washington DC", "Tashkent"};

        for (int i=0; i< counties.length;i++){

            System.out.println(" Capital of "+ counties[i] + " is "+capitals[i]);
        }
    }
}
