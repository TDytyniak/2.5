import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("podaj 3 liczby");
    Scanner scanner = new Scanner(System.in);
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();
    
    double max=0;
    if(a > b && b < c)
      max= a;
      else if (a < c && b < c)
        max= c;
    else if (a < b && b > c)
      max= b;
    System.out.println(max);
  }
}