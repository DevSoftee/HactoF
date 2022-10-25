import java.util.Scanner;
public class program4{
  public static void main(String[] args){
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the base of triangle:");
    double base=obj.nextDouble();
    System.out.println("Enter the height of triangle:");
    double height=obj.nextDouble();
    double area=(base*height)/2;
     System.out.println("Area of triangle:"+area);
  }
}