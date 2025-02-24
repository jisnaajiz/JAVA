import java.util.Scanner;
public class div{
 public static void main(String[] args){
  Scanner obj=new Scanner(System.in);
  System.out.println("Enter the first number");
  float num1=obj.nextInt();
  System.out.println("Enter the second number");
  float num2=obj.nextInt();
  float div=num1/num2;
  System.out.println("The quotient is: "+div);
  }
 } 
