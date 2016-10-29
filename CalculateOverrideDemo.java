class TwoDimensionalShape
{
    double length;
}
class Square extends TwoDimensionalShape
{
    Square(double lengthOfSide)
    {
        this.length = lengthOfSide;
    }
    double calculateArea()
    {
        return Math.pow(this.length, 2);
    }
}
class Rectangle extends TwoDimensionalShape
{
    double length;
    double length2;
    Rectangle(double lengthOfOneSide, double lengthOfAnotherSide)
    {
        this.length = lengthOfOneSide;
        this.length2 = lengthOfAnotherSide;
    }
    double calculateArea()
    {
        double area;
        area = this.length * this.length2;
        return area;
    }
}
class Circle extends TwoDimensionalShape
{
    Circle(double radius, boolean isCircle)
    {
        this.length = radius;
    }
    double calculateArea()
    {
        return Math.PI * (Math.pow(this.length, 2));
    }
}
class CalculateAreaOverrideDemo
{
  public static void main(String[] args)
  {
      Square mySquare = new Square(3);
      Rectangle myRectangle = new Rectangle(3, 6);
      Circle myCircle = new Circle(3,true);
      System.out.println(mySquare.calculateArea());
      System.out.println(myRectangle.calculateArea());
      System.out.println(myCircle.calculateArea());
  }
}