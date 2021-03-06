// Demonstrate when constructors are called.
class A
{
  //class A extends java.lang.Object {
  int x = 1;
  A()
  {
    System.out.println("Constructing A.");
  }
}
 
// Create a subclass by extending class A.
class B extends A
{
  int x = 33;
 
  B()
  {
    System.out.println("Constructing B.");
    System.out.println("B's x = 33? " + x);
  }
}
 
// Create another subclass layer by extending B.
class C extends B
{
  int x = 44;
 
  C()
  {
    System.out.println("Constructing C.");
  }
}
 
class OrderOfConstruction
{
  public static void main(String[] args)
  {
    C c = new C();
    int x = 0;
    System.out.println(x); // current class
    // System.out.println(this.x);  // no object
    System.out.println(c.x); // the value from A
  }
}
// What does this mean for the initialization of instance variables?