// Demonstrate the relational operators.
class RelationalOperatorsDemo
{
  public static void main(String[] args)
  {
    int i, j;
    i = 10;
    j = 11;
    // relational operators
    if(i < j) System.out.println("i < j");
    if(i <= j) System.out.println("i <= j");
    if(i != j) System.out.println("i != j");
    if(i == j) System.out.println("this won't execute");
    if(i >= j) System.out.println("this won't execute");
    if(i > j) System.out.println("this won't execute");
  }
}