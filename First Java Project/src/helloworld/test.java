package helloworld;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        for(int x = 0; x < 10; x++){
            myList.add(x+1);
        }

        for(int y : myList){
            System.out.println("value number: " + y);
        }
    }    
}