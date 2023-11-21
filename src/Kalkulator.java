import java.util.Scanner;

public class Kalkulator
{
    public static int add(int a, int b)
    {
        return a + b;
    }
    public static int subtract(int a, int b)
    {
        return a - b;
    }
    public static int multiply(int a, int b)
    {
        return a * b;
    }
    public static int split(int a, int b)
    {
        return a / b;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);


        while (true)
        {
            System.out.println("Number one:");
            int numberFirst = scanner.nextInt();

            System.out.println("Select an operation");
            System.out.println(" ");
            System.out.println("1. adding");
            System.out.println("2. subtraction");
            System.out.println("3. multiplication");
            System.out.println("4. dividing");
            System.out.println("5. output");
            System.out.println("6. result ");

            System.out.print("Your choice: ");
            int selection = scanner.nextInt();

            if (selection == 5)
            {
                System.out.println("Goodbay");
                break;
            }


            System.out.println("Enter number two:");
            int numberTwo = scanner.nextInt();




           if (selection == 1)
            {
                System.out.println("The result of the Addition is:" + add(numberFirst, numberTwo));
            }
            else if (selection == 2)
            {
                System.out.println("The result of Subtraction is:" + subtract(numberFirst,numberTwo));
            }
            else if (selection == 3)
            {
                System.out.println("The result of the Multiplication is:" + multiply(numberFirst,numberTwo));
            }
            else if (selection == 4)
            {
                System.out.println("The result of the Divide is: "  + split(numberFirst,numberTwo));
            }
            else
            {
                System.out.println("select other numbers:  ;-)");
                break;
            }
        }
    }
}
