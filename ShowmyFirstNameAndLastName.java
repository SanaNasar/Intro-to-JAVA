 /*
  usage:
  java ShowMyFirstNameAndLastName 
  Sana Nasar
*/
/* 
  to run the application on Cmdline
  RUN - javac filename.java
  - java filename args1 args2
*/

class ShowMyFirstNameAndLastName
{
    public static void main(String[] args)
    {
        // display command-line arguments
        System.out.println(args[0] + " " + args[1]);
        // demonstrate the modululus operator
        System.out.println("The remainer when dividing 10051 by 10 is " + 10051 % 10);
    }
}