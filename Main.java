import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner nazwa = new Scanner(System.in);
    double a;
    double b;
    System.out.print("Podaj a: ");
    a = nazwa.nextInt();  
    b = (a % 10);
    System.out.print("Reszta z dzielenia przez 10 to: "+b);
    
  }
}