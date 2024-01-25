import java.util.Scanner;

class Input2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1:  ");
        int number1 = input.nextInt();
        System.out.print("Please enter a symbol:  ");
        String symbol = input.next();
        System.out.println("Enter number2:  ");
        int number2 = input.nextInt();

        if(symbol.equals("*")){
            System.out.println(number1 * number2);
        }
        if(symbol.equals("+")){
            System.out.println(number1 + number2);
        }
        if(symbol.equals("-")){
            System.out.println(number1 - number2);
        }
        if(symbol.equals("/")){
            System.out.println(number1 / number2);
        }
        input.close();
    }
} 