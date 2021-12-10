
package pricepane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestClass 
{   
    
    public static int fibFinder(int n) 
    {
        // Write your code here
        int toReturn = 0;
        int sum = 0;
        int k1;
        int k2;
            for(int i = 0; i <= n; i++)
            {
                if(i < 2)
                {
                    sum = i;
                    
                }
                else if(i > 2)
                {
                    k1;
                }
                toReturn = sum;
            }
        return toReturn;
    }    
    
   public static void main(String[] args)
   {
       System.out.println(fibFinder(6));
   }   
}
