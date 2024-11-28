import java.util.Scanner;

public class GetArrayMean
{
    public static double getArrayMean(int[] array) 
    {
        int sum = 0;
        for (int num : array) 
        {
            sum += num; 
        }
        return (double) sum / array.length;
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
    
        if (n <= 0) 
        {
            System.out.println("The number of integers must be greater than zero.");
            return;
        }
    
        int[] numbers = new int[n];
        input.nextLine(); 
    
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = input.nextInt();
        }
    
        double mean = getArrayMean(numbers);
        System.out.println("The mean of the array elements is: " + mean);
    }
}
    
