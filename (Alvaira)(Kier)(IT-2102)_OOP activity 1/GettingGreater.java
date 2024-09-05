import java.util.Scanner;
class GettingGreater
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Getting the Greater Value");
        System.out.print("Enter the first character : ");
        char num1 = input.next().charAt(0);
        System.out.print("Enter the second character: ");
        char num2 = input.next().charAt(0);
        
        System.out.println("---------------------------------------------");
        
        if (num1 > num2)
        {
        System.out.println("The character with the greater value is: " + num1);
        }
        else
        {
            System.out.println("The character with the greater value is: " + num2);
        }
        System.out.println("---------------------------------------------");
        
        int asciiValue1 = (int) num1;
        int asciiValue2 = (int) num2;
        
        System.out.println("Showing the ASCII Codes");
        System.out.println(num1 + " : " + asciiValue1);
        System.out.print(num2 + " : " + asciiValue2);
        input.close();
    }
}
