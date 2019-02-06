     

import java.util.Scanner;
public class IntegerPrinter {

    public String printIntegerAsBinary(int value){
        Integer i = new Integer(value);
        String Binary = Integer.toBinaryString(i);
        return Binary;
    }

    public String printIntegerAsOctal(int value){
        Integer i = new Integer(value);
        String Octal = Integer.toOctalString(i);
        return Octal;
    }

    public String printIntegerAsHexadecimal(int value){
        Integer i = new Integer(value);
        String Hexadecimal = Integer.toHexString(i);
        return Hexadecimal;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int enteredValue = 0;
        
        System.out.println("Enter an integer value : ");
        enteredValue= scanner.nextInt();
        
        
        IntegerPrinter printInteger = new IntegerPrinter();
        System.out.println("Printing Binary value : "
        + printInteger.printIntegerAsBinary(enteredValue));
        System.out.println("Printing Octal value : "
        +printInteger.printIntegerAsOctal(enteredValue));
        System.out.println("Printing Hexadecimal value: "
        +printInteger.printIntegerAsHexadecimal(enteredValue));
        
    }
}
