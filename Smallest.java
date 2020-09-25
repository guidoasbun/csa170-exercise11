/* 
*   Guido Asbun
*   CS A170 
*   24-September-2020     
* 
*   Exercise 11
*/ 

import java.util.Scanner;
public class Smallest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter three integers, I’ll find the smallest ");
        int numOne = input.nextInt();
        int numTwo = input.nextInt();
        int numThree = input.nextInt();
        int smallestNum;
        
        if((numOne <= numTwo) && (numOne <= numThree)){
            smallestNum = numOne;
        }else if((numTwo <= numOne) && (numTwo <= numThree)){
            smallestNum = numTwo;
        }else{
            smallestNum = numThree;
        }
        
        System.out.println("The smallest is: " + smallestNum);
    }
}