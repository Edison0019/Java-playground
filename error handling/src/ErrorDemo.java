import java.util.Scanner;

public class ErrorDemo{
    public static void main(String[] args){
        int num, deno;
        Scanner input = new Scanner(System.in);
        System.out.println("Type the number");
        num = input.nextInt();
        deno = 0;
        try{
            System.out.println("Value is: " + num/deno);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            input.close();
            System.out.println("End of error");
        }
    }
}