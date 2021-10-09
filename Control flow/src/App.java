import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Please write your age: \n");
        short age = input.nextShort();
        if(age > 100 || age < 0){
            System.out.println("Invalid Age");
        }else if(age < 18){
            System.out.println("Sorry you are under age");
        }else if(age < 21){
            System.out.println("Sorry you need parental consent");
        }else{
            System.out.println("Congratulations!");
        }
        input.close();

        int myNum = 3;
        // using ternary operator
        System.out.println(myNum > 0 ? true : false);

        // using switch statement
        switch(myNum){
            case 3:
                System.out.printf("Great! number is %d",myNum);
                break;
        }
    }
}
