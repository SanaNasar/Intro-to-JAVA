/*
  Call the method for getting a square root
  using a method of a class in the java.lang package.
*/
class SquareRootDemo
{
   public static void main(String[] args)
   {
      System.out.println("The square root of 144 is " + Math.sqrt(144));
      double x, y, z;
      x = 3;
      y = 4;
      z = Math.sqrt(x*x + y*y);
      System.out.println("Hypotenuse is " + z);
   }
}