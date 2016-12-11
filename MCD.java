import java.util.*;

public class MCD
{
  public static void main(String[] args)
  {
    System.out.println("Inserisci 2 numeri");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    Scanner in = new Scanner(System.in);
    int b = in.nextInt();
    System.out.println(Calcolo(a,b));
  }

  public static int Calcolo(int a, int b)
  {
    if (b == 0)
    {
      return a;
    }
    else
    {
      return Calcolo(b, a % b);
    }
  }
}
