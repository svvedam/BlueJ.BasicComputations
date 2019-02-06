 

import java.util.*;
public class ShortCalculator {  
     public void unsignedSum(short num1,short num2){
        short sum =0;
        sum = (short)(num1+num2);
        System.out.println("Unsigned sum is : " + sum);
    }

    public void difference (short num1,short num2){
        short diff =0;
        diff = (short)(num1-num2);
        System.out.println("Difference is : " + diff);
    }

    public void product(short num1,short num2){
        short multiply;
        multiply = (short)(num1*num2);
        System.out.println("Product is : " + multiply);
    }
    public void quotient(short num1,short num2){
        short quo;
        quo=(short)(num1/num2);
        System.out.println("Quotient is : " + quo);
    }
    public void remainder(short num1,short num2){
        short rem;
        rem=(short)(num1/num2);
        System.out.println("Remainder is : " + rem);
    }
    
    
    public static void main(String[] args){
    
        ShortCalculator shortCalc = new ShortCalculator();
        Scanner scanner = new Scanner(System.in);
        short number1;
        short number2;
        System.out.println("Enter first short number: " );
        number1=(short)scanner.nextInt();
        System.out.println("Enter second short number: " );
        number2=(short)scanner.nextInt();
        shortCalc.unsignedSum(number1,number2);
        shortCalc.difference(number1,number2);
        shortCalc.product(number1,number2);
        shortCalc.quotient(number1,number2);
        shortCalc.remainder(number1,number2);
        
    }
    
}
