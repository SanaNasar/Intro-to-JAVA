/* An array is a special type of object
 that is independent of whether it is empty
 and independent of what it can contain */
 
class ArrayTest
{
    static void instantiateArray()
    {
        String[] months = new String[4];
        System.out.println(months.getClass());
        System.out.println(months.toString());
        System.out.println(months.hashCode());
    }
}
 
class ArrayTestDemo
{
    public static void main(String[] args)
    {
        ArrayTest myArrayTest = new ArrayTest();
        myArrayTest.instantiateArray();
    }
}