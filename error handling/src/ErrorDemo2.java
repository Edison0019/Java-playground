import java.util.InputMismatchException;
import java.util.Scanner;

public class ErrorDemo2 {
    public static void main(String[] args){
        int[] elements = new int[] {5,15,23,85,74,63};
        Scanner input = new Scanner(System.in);

        System.out.println("Type number below");
        try{
            int number = input.nextInt();
            if(number == 0){ //throwing custom exceptions
                throw new InputMismatchException();
            }
            System.out.printf("Number[%d] = %d%n",number, elements[number]);
        }catch(InputMismatchException e){
            System.out.println("Make sure to enter an integer or value greater than 0");
        }catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }finally{
            input.close();
            System.out.println("-- END OF CODE --");
        }
    }
}
