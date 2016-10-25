//class ClassName
class Box
{ // CLASS BODY DEFINES ITS MEMBERS
  // declare fields
  double width, height, depth;
  double volume; // width * height * depth;
  // define constructors
  Box(String boxName)
  {
        System.out.println("This box is called " + boxName);
  }
  Box(double w, double h, double d)
  {
      volume = w * h * d;
  }
  // define methods
  double getVolume() // parameterless method
  {
    return volume;
  }
  void enlargeBox(Box b) // object parameter
  {
     volume *= 2;
     System.out.println("This method specifies a formal parameter of type Box, \nso the runtime call must pass in a reference to a Box object.");
  }
}
// RUNTIME
class ClassFormDemo
{
  public static void main(String[] args)
  {
    double volume;
    Box myBox0 = new Box("Big yellow Box");
    Box myBox1 = new Box(1, 2, 3);
    Box myBox2 = new Box(1.5, 2.5, 3.5);
    System.out.println(myBox1.getVolume());
    System.out.println(myBox2.getVolume());
    myBox2.enlargeBox(myBox1); // object argument
    System.out.println(myBox2.getVolume());
  }
}