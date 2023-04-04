package JAVABatch15.class32.class10;

public class ForEachoopsDemo3 {
    public static void main(String[] args) {

        int[] arr={10,13,20,25,45,50};
        //we cant update the elements in far each loop because we dont have access to the index;

        for(int x:arr){ //x=variable like "i"
            if(x%2!=0){
                x=0;

            }
            System.out.println(x);
        }
    }
}
