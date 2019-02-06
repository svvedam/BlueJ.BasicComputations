 

import java.util.*;
public class NormalizeAngle {

    public Integer normalizeValueUsingModulo(Integer angle){
        if (angle<0){
          
            angle = angle + 359;
        }
        else
        {
            angle = angle%359;
        }
        
        return angle;
    }

    public Integer normalizeValueUsingFloorMod(Integer integer){
        if (integer<0){
          
            integer = integer + 359;
        }
        else
        {
            integer = Math.floorMod(integer,359);
        }
        
        return integer;
    }

    public static void main(String[] args){
        NormalizeAngle normalizeAngle = new NormalizeAngle();
        Scanner scanner = new Scanner(System.in);
        int angle;
        int usingMod;
        int usingFloorMod;
        
        System.out.println("Enter the angle: " );
        angle=(scanner.nextInt());
        
        usingMod=normalizeAngle.normalizeValueUsingModulo(angle);
        usingFloorMod=normalizeAngle.normalizeValueUsingFloorMod(angle);
        
        System.out.println("Normalized value using modulo : "+usingMod);
        System.out.println("Normalized value using FloorModulo : "+ usingFloorMod);
        
        
        

    }
}
