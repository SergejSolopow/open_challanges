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
    
    public static int[] flattenArray(int[][] input)     {
    
        int[] toReturn = new int[input[0].length + input[1].length];
    
        int k = 0;
        for(int[] i : input)
        {
            for(int j : i)
            {
                toReturn[k] = j;
                k++;
            }
        }
        return toReturn;    
    }
    
    public static int[] productOfTheOthers(int[] array)
    {
    
        int[] toReturn = new int[array.length];
        int product;
        for(int i = 0; i < array.length; i++)
        {   
            product = 1; 
            for(int j = 0; j < array.length; j++)
            {
                if(i == j)
                {
                    product *= 1;
                }
                else
                {
                    product *= array[j];
                }
            }
            
            toReturn[i] = product;
        }        
        return toReturn;
    }
    
    public static double[] statsFinder(int[] array) 
    {
        double[] toReturn = new double[2];
        //mean value
        double sum = 0;
        for(int i : array)
        {
            sum += i;
        }
        toReturn[0] = sum / array.length;

        //finde out mode
        //create ArrayList with unic modes
        ArrayList<Integer> unicList = new ArrayList<Integer>();
        boolean isThere = false;
        
        for(int i : array)
        {
            for(int j : unicList)
            {
                if(i == j)
                {
                    isThere = true;
                    break;
                }
                else if(i != j)
                {
                    isThere = false;
                }
            }
            
            if(isThere == false)
            {
                unicList.add(i);
            }
        }        
        
        //Array with a mode intensity
        int[] modeIntens = new int[unicList.size()];
        for(int i = 0; i < unicList.size(); i++)
        {
            for(int j : array)
            {
                if(unicList.get(i) == j)
                {
                    modeIntens[i] += 1;
                }
            }
        }        
        
        //compare mode intensity, finde out the most occuring value
        //create ArrayList for the case of more than one mode
        int position = 0;      
        
        for(int i = 0; i < modeIntens.length - 1; i++)
        {
            if(modeIntens[i] > modeIntens[position])
            {
                position = i;
            }            
        }
        toReturn[1] = unicList.get(position);

    return toReturn;
  }
    
    public static int fibFinder(int n) 
    {
       
       int toReturn = 0;
       //last two members in the Fibonacci sequence
       int k1 = 0;
       int k2 = 1;
       
       for(int i = 0; i <= n; i++)
       {
           if(i == 0)
           {
               toReturn = k1;
           }
           else if(i == 1)
           {
               toReturn = k2;
           }
           else
           {
               toReturn = k1 + k2;
               k1 = k2;
               k2 = toReturn;
           }
       }
          
       return toReturn;
    }
     
    public static void main(String[] args)
    {  
       //Test all the methods
       System.out.println(fizzbuzz(16));
       System.out.println(primeFinder(13));
       System.out.println(Arrays.toString(missingNos(new int[]{1, 2, 4, 5, 6, 7, 8, 10}, 2)));
       System.out.println(Arrays.toString(flattenArray(new int[][]{{1, 2}, {3, 4, 5}})));
       System.out.println(Arrays.toString(productOfTheOthers(new int[]{1, 2, 3, 4, 5})));
       System.out.println(Arrays.toString(statsFinder(new int[]{500, 400, 400, 375, 300, 350, 325, 300})));
       System.out.print(fibFinder(6));
    }
}    