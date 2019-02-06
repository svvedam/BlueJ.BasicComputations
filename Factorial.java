 


import java.math.*;
import java.util.*;

public class Factorial {

    public BigInteger factorialOf(Integer value){
        
        BigInteger f= new BigInteger("1");
        
        for(int i = 2; i<=value ; i++){
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }

    public static void main(String[] args){
        Factorial factorialBigInt = new Factorial();
        Scanner scanner = new Scanner(System.in);
        BigInteger factValue = new BigInteger("1");
        
        Integer passValue= new Integer(1);
        
        System.out.println("Enter the Big Integer value : " );
        passValue=(scanner.nextInt());
        
        factValue=factorialBigInt.factorialOf(passValue);
        
        
        System.out.println("Factorial value : "+factValue);
        
        
        
        

    }
    
    
}
