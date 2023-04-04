package JAVABatch15.class32.class11;
/*
2) Create 2D array of cars : american, german, korean, italian.
Then retrieve all values from that array using 2 different loops
 */

public class HW4 {
    public static void main(String[] args) {

        String [][] cars={{"Ford","Dodge","Tesla"}, {"BMW","Audi", "Porsche","Volskwagen"},{"KIA","Hyundai","Genesis","Daewoo"},
                {"Alfa Romeo", "Ferrari","Mazzanti"}
        };

        for (int i = 0; i <cars.length ; i++) {
            for (int j = 0; j <cars[i].length ; j++) {

                System.out.println(cars[i][j]);
            }
        }
        System.out.println();
    }
}
