Question 1:
CODE:    
package com.branching;

public class WhileLoop {

	public static void main(String[] args) {
		//initialize input value starting and ending
		    int startingNumber =10;
		    int endingNumber =50;
		//while condition check input is greater than equal to last input 
		     while(startingNumber<=endingNumber) {
	        //condition is true then come if condition
		     if(startingNumber%10==0)
				System.out.println(startingNumber);
		 //print starting input to adding a increment operator
			startingNumber++;
		}

	}
INPUT:10,50
OUTPUT:
10
20
30
40
50

Question 2:
CODE:
package com.findingnumber;

public class NegativeorPositive {

	public static void main(String[] args) {
		
		        int number = -12;
                        //java version 8 approach to solve if else ladder
		        // true if number is less than 0
		        if (number < 0)
		            System.out.println(number + " is a negative number.");

		        // true if number is greater than 0
		        else if ( number > 0)
		            System.out.println(number + " is a positive number.");

		        // if both test expression is evaluated to false
		        else
		            System.out.println(number + " is 0");
		    }
		}

INPUT:-12
OUTPUT:-12 is a negative number.

Question 3:
code:

package com.reversenumber;

public class ReverseNumber {

	public static void main(String[] args) {
		 int num = 876, reversed = 0;
                 //update/increment expression contains 
		    for(;num != 0; num /= 10) {
		      int digit = num % 10;
		      reversed = reversed * 10 + digit;
		    }
                  //for loop excuted then print reversed number
		    System.out.println("Reversed Number: " + reversed);
		  }
		

	}

input:876
output:Reversed Number: 678

Question 4:
code:

package com.findsmallestnumber;
import java.util.Scanner;
public class SmallestNumber {

	public static void main(String[] args) {
		
		        int a,b,c;
                    //read the input value  a,b,c 
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the first number:");
		        a = sc.nextInt();
		        System.out.println("Enter the second number:");
		        b = sc.nextInt();
		        System.out.println("Enter the third number:");
		        c = sc.nextInt();
                     //logical AND operator any one value print 
		        if(a < b && a < c)
		        {
		            System.out.println("The smallest number is:"+a);
		        }
                    //Else check if b< c, if true then display the smallest number as b.
		        else if(b < c)
		        {
		            System.out.println("The smallest number is:"+b);
		        }
                    //Else display the smallest number is c.
                        else
		        {
		            System.out.println(" The smallest number is:"+c);
		        }
		 
		    }
}

input:a,b,c
output:Enter the first number:
100
Enter the second number:
120
Enter the third number:
10
 The smallest number is:10

Question 5:
code:
 package com.looping;
import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
        //read the Scanner input get name and purchase amt
		Scanner in = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = in.nextLine();
        System.out.print("Enter Purchase Amount: ");
        double amt = in.nextInt();
      //initialize the discount value starting 0
        int d = 0;
        
        if (amt <= 500)
            d = 0;
        else if (amt <= 1000)
            d = 10;
        else
            d = 20;
            
        double discAmt = amt * d / 100.0;
        double finalAmt = amt - discAmt;
      //print the calculate purchase amt the applied disc amt
        System.out.println("Name: " + name);
        System.out.println("Purchase Amount: " + amt);
        System.out.println("Final Payable Amount: " + finalAmt);		                
	}
}

input:dis=0,10,20
output:
Enter Name: iniya
Enter Purchase Amount: 800
Name: iniya
Purchase Amount: 800.0
Final Payable Amount: 720.0

Question 6:
code:
package com.numbers;
import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		//initialize row and column digit 5 
		int i =55555, j=1111;
                //for loop was introduced in java version 1.5
		for(int k=1;k<=5;k++)
		{
			System.out.println(i);
		//for condition is true then print i value calculate the given below
			i=i-j; 
		j=j/10;
	}
}
}
input:i,j,k
output:
55555
54444
54333
54322
54321







