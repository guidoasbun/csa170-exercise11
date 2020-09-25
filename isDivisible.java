/* 
*   Guido Asbun
*   CS A170 
*   24-September-2020     
* 
*   Exercise 11
*/ 

import java.util.Scanner;
public class isDivisible{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter two integers, I'll check if one is divisible by the other: ");
        int numOne = input.nextInt();
        int numTwo = input.nextInt();
        
        if (numOne % numTwo > 0){
            if (numTwo % numOne == 0){
                System.out.println(numTwo + " is divisible by " + numOne);
            }else {
                System.out.println(numOne + " and " + numTwo + " are not divisible");
            }
        }else{
            System.out.println(numOne + " is divisible by " + numTwo);
        }
    }
}