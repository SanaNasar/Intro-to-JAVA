/* Find prime numbers and print all the numbers, whether prime or not. */
class PrimeCalculatorWithIfDemo
{
    public static void main(String[] args)
    {
        // declare local variables
        int i, j;
        boolean isPrime;
        for(i=1; i< 20; i++)
        {
            isPrime = true;
            // see if the number is evenly divisible
            for(j=2; j <= i/j; j++)
            {
                // if it is, then its not prime
                if((i%j) == 0)
                {
                    isPrime = false;
                }
            } // end of inner for
            if(isPrime)
            {
                System.out.println(i + " is prime.");
            }
            if(!isPrime)
            {
            System.out.println(i + " is NOT prime.");
            }
        } // end of outer for
    } // end of main
} // end of class