class Pencil
{
    String color;
 
    Pencil(String externalColor)
    {
        color = externalColor;
    }
 
    String write()
    {
        return "The external color of this pencil is " + color;
    }
}
class Pen
{
    String color;
 
    Pen(String inkColor)
    {
        color = inkColor;
    }
 
    String write()
    {
        return "The color of this pen's ink is " + color;
    }
}
class PencilAndPenDemo
{
    public static void main(String[] args)
    {
        Pencil myYellowPencil = new Pencil("yellow");
        Pen myBlueInkPen = new Pen("blue");
        System.out.println(myYellowPencil.write());
        System.out.println(myBlueInkPen.write());
    }
}