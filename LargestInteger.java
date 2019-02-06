 


public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        int arraySize = integers.length;
        int maxValue=0;
        maxValue=integers[0];
        for(int i = 0; i< arraySize; i++)
        {
            if(maxValue<integers[i])
            {
                maxValue=integers[i];
            }
        
        }
        
        return maxValue;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        int arraySize = integers.length;
        int maxValue=0;
        maxValue=integers[0];
        for(int i = 0; i< arraySize; i++)
        {
            maxValue=Math.max(maxValue,integers[i]);
            
        }
        
        return maxValue;
    }
}
