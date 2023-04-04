package JAVABatch15.class32.class10;

import java.util.Arrays;

public class D2Array {
    public static void main(String[] args) {

        //a 2d array which can hold 3 one D arrays
        //each of size 3
        String [] [] thomsonTrain=new String[3][];
        String[] cabin0={"Adem", "Zafar","Sam"};
        String[] cabin1={"Nabi", "Aipa","Tami"};
        String[] cabin2={"Elvira", "Safi","Zahra"};

        thomsonTrain[0]=cabin0;
        thomsonTrain[1]=cabin1;
        thomsonTrain[2]=cabin2;

        //in the first [] we specify the address of 1 D ARRAY

        System.out.println(thomsonTrain[2][1]);
        System.out.println(Arrays.toString(thomsonTrain[0]));



    }
}
