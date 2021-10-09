package helloworld;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class program {
    public static void main(String[] args){
        String myName = "Edison Santana";
        String[] myNames = myName.split(" ");
        for(String n: myNames){
            System.out.println(n.substring(0, 5));

        
        }

        int[] myVals = new int[] {1,2,3,4,5};
        System.out.println(Arrays.equals(myVals, myVals));
        for(int e : Arrays.copyOfRange(myVals, 1,3)){
            System.out.println(e);
            System.out.println(myVals.length);
        }
        List<Integer> myList = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            myList.add(i);
        }

        for(int e : myList){
            System.out.println(e + " value of list");
        }
    }

    
}
