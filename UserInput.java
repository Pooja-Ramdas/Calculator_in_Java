import java.util.*;
public class UserInput
{
    Scanner sc = new Scanner(System.in);
    //Function to input two numbers and return them as an array
    int[] input()
    {
        System.out.println("Enter the value of the first operand: ");
        int first = sc.nextInt();
        System.out.println("Enter the value of the second operand: ");
        int second = sc.nextInt();
        int arr[] = new int[2];
        arr[0] = first;
        arr[1] = second;
        return arr;
    }
    //Function to input a single number
    int inputSingle()
    {
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        return(num);
    }


}
