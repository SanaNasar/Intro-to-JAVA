/ the three types of members of a class are:
// field, constructor, method
class BananaRepublicGlider
{
    // declare any fields
    static boolean canFly;
 
    // definition of the constructor
    // which might or might not have
    // formal parameters
    BananaRepublicGlider()
    {
        System.out.println("parameterless constructor");
    }
 
    BananaRepublicGlider(String s1, String s2, boolean isInStorage)
    {
        System.out.println(s1);
        System.out.println(s2);
    }
 
    // defining method
    // which might or might not be parameterless
    static String fold()
    {
        return "fold like so, then like so";
    }
    static String brand()
    {
        return "attached the Banana branding";
    }
    String fly()
    {
        return "in flight, briefly";
    }
}
 
class AircraftDemo
{
    public static void main(String[] args)
    {
        // className objectID assignmentOperator
        // new to allocate memory
        // call to the constructor, which might or
        // might not have runtime arguments
        BananaRepublicGlider bng1 = new BananaRepublicGlider(BananaRepublicGlider.fold(), BananaRepublicGlider.brand(), true);
        //bng1.fly();
        String flightStatus = bng1.fly();
        // we pass a runtime arg to the println method
        System.out.println(flightStatus);
    }
}