/*
  Usage: java CommandLineArgsDemo 200 10
*/
class CommandLineArgsDemo
{
    public static void main(String[] args)
    {
        //HelloWorld myHelloWorld = new HelloWorld();
        int numerator = Integer.parseInt(args[0]);
        int denominator = Integer.parseInt(args[1]);
        System.out.println(numerator / denominator);
    }
}