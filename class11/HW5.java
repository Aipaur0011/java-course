package JAVABatch15.class32.class11;
/*
3) Using 2D array create a grocery list.
Inside you should have an array of veggies, fruits, dairy and sweets. Retrieve all values from that array using 2 different loops
 */

public class HW5 {
    public static void main(String[] args) {

        String [][] grocery={{"onion", "tomato", "carrot", "cucumber"},
                {"apple", "grapes", "orange", "cherry"},{"milk", "cottage", "butter", "cheese"},{"chocolate","candy", "waffles"}
        };

        for (int i = 0; i < grocery.length ; i++) {
            for (int j = 0; j <grocery[i].length ; j++) {
                System.out.println(grocery[i][j]);
            }

        }
        System.out.println();

    }
}
