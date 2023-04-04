package JAVABatch15.class32.class14;

public class ArrayAddMachine {
    public static void main(String[] args) {

        int []array2={10,10,10,30};
        addArrayElementsMachine(array2);
        int[]array3={20,40,30,50};
        addArrayElementsMachine(array3);
    }

    static void addArrayElementsMachine(int[]arr){
        int sum=0;
        for (int number:arr){
            sum+=number;
        }
        System.out.println(sum);
    }
}
