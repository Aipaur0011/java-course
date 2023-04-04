package JAVABatch15.class32.class10;

public class ForEachLoopsDemo2 {
    public static void main(String[] args) {

        int [] arr={10,13,20,25,45,50};
        //arr[i]=0; this is how we update a single element in an array
        //print only the odd numbers from this array with the help of normal for loop

        for(int i=0; i< arr.length; i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }
        //replace all the odd numbers in this array with the help of a normal loop
        System.out.println("*******************");

        arr[0]=10;
        arr[1]=13;
        arr[2]=20;
        arr[3]=25;
        arr[4]=45;
        arr[5]=50;

        System.out.println("After replacing all odd numbers with zero");
        for(int i=0; i< arr.length;i++){
            if(arr[i]%2!=0){
                arr[i]=0;
            }
            System.out.println(arr[i]);
        }

    }
}
