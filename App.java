import java.util.Random;
import java.util.Scanner;

class App {
    public static void main (String[] args) {
        System.out.println("Welcome to the calculator!");
        //Instantiate the random class
        Random random = new Random();
        //set 2 random integers up to 100 using random instance
        int randomNum = random.nextInt(100);
        int otherRandomNum = random.nextInt(100);
        //display the numbers
        System.out.println("Your numbers are: " + randomNum + " and " + otherRandomNum);
         //Instantiate the scanner class
        Scanner scanner = new Scanner(System.in);
        //request operator from user
        System.out.println("Please enter a function to perform (+, - or *):");
        //set operator using the scanner instance
        String input = scanner.next();
        //declare the result variable
        int result;
        //use switch to identify the string input and perform the necessary function
        switch (input) {
            case "+":
                result = randomNum + otherRandomNum;
                break;
            case "-":
                result = randomNum - otherRandomNum;
                break;
            case "*":
                result = randomNum * otherRandomNum;
                break;
            //if input not valid, display error
            default:
                System.out.println("Sorry, that's not a valid function!");
                return;
        }
        //display result of function
        System.out.println("Result: " + result);
        //close the scanner instance
        scanner.close();
    }
}
