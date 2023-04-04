package JAVABatch15.class32.class10;
/*
0)Write a java program to find the second largest number in the array?
 */

public class HW10 {
    public static void main(String[] args) {
        int temporary =0;
        int size = 0;
        int []num={10,20,30,40,50,11,22,33,44,55};

        size = num.length;

        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if(num[i]>num[j]) {
                    temporary = num[i];
                    num[i] = num[j];
                    num[j] = temporary;
                }
            }
        }
        System.out.println("The second largest number in the Array is "+num[size-2]);
    }
}
