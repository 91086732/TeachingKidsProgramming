public class Pow
{
  public static void main(String[] args)
  {
    int base = 2;
    int exp = 3;
    int result = pow(base, exp);
    System.out.println("The result is " + result);
  }
  public static int pow(int base, int exponent)
  {
    int product = 1;
    for (int i = 0; i < exponent; i++)
    {
      product = product * base;
    }
    return product;
  }
}
