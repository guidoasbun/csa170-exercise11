/* 
*   Guido Asbun
*   CS A170 
*   24-September-2020     
* 
*   Exercise 11
*/ 

import java.util.Scanner;
public class InOrder{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter three integers, I’ll find the smallest ");
        int numOne = input.nextInt();
        int numTwo = input.nextInt();
        int numThree = input.nextInt();
        int temp;
        
        if(numOne > numTwo){
            temp = numOne;
            numOne = numTwo;
            numTwo = temp;    
        }
        
        if(numTwo > numThree){
            temp = numTwo;
            numTwo = numThree;
            numThree = temp;
        }
        
        if(numOne > numTwo){
            temp = numOne;
            numOne = numTwo;
            numTwo = temp;    
        }
        
        System.out.println("The integers sorted in order are: " 
            + numOne + " " 
            + numTwo + " " 
            + numThree);
    }
}