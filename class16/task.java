package JAVABatch15.class32.class16;
/*
Create a method that will accept an array as parameters and will return a sum
of all elements from that array. Method should be visibly only within same package
and accessible by the creating an instance of the class

type=>array
name=>
parameters=>sum
 */

public class task {

    static int sumArrayElements(int[] array){

        int sum=0;
        for(int num:array){
            sum+=num;
        }
        return sum;
    }

    public static void main(String[] args) {

        int[]arr={10,25,35,45};
        task task=new task();


        System.out.println(task.sumArrayElements(arr));
    }
}
