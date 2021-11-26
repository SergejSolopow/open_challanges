package solopow.anytest;
import java.util.Arrays;
import java.util.ArrayList;



public class Challenges 
{    
    public static ArrayList fizzbuzz(int n) 
    {        
        /*
        initialise an instance of the class ArrayList with a name of arr.
        Use Object atribute as Superclass for String or int Integer classe
        */
      
        ArrayList<Object> arr = new ArrayList<Object>();
    
        /*
        iterate through the first n numbers using for(){} flow control
        and figutre out numbers with matching conditions. 
        Add to the ArrayyList arr wit add method. 
        */
    
        for(int i = 1; i <= n; i++)
        {
        if(i%3 == 0 && i%5 != 0)
        {
            arr.add("Fizz");
        }
        else if(i%5 == 0 && i%3 != 0)
        {
            arr.add("Buzz");
        }
        else if(i%5 == 0 && i%3 == 0)
        {
            arr.add("FizzBuzz");
        }
        else
        {
            arr.add(i);
        }
    }
        
    return arr;
  }   
    
    public static ArrayList primeFinder(int n) 
    {        
        /*
        initialise ArrayList of the Ineger type. 
        */
        ArrayList<Integer> primeList = new ArrayList<Integer>();
        
        /*
        find out prime numbers using for() control flow
        add primes to the arr using add method
        */        
        for(int i = 2; i <= n; i++ )
        {
            for(int j = 2; j <= i; j++)
            {                
                if(i%j == 0 && j != i)
                {
                    break;
                }                
                else if(i%j == 0 && j == i)
                {
                    primeList.add(j);
                }
            }
        }
        
        return primeList; 
    }
    
    public static int[] missingNos(int[] array, int k) 
        {
    
        int[] toReturn = new int[k];
        int[] tempArr = new int[array.length + k];
        int index = 0;
        for(int i : array)
        {
            tempArr[i - 1] = i;
        }
        
        for(int i = 0; i < tempArr.length; i++)
        {
            if(tempArr[i] == 0)
            {
                toReturn[index] = i + 1;
                index++;
            }
        }        
        return toReturn;
  }
   
    public static void main(String[] args)
    {       
       System.out.println(fizzbuzz(16));
       System.out.println(primeFinder(13));
       System.out.println(Arrays.toString(missingNos(new int[]{1, 2, 4, 5, 6, 7, 8, 10}, 2)));
    }
}

