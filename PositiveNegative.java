import java.util.*;
class PositiveNegative{
public static void main(){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number to be checked");
  int n=sc.nextInt();
  if(n>0)
    System.out.println("Positive number");
  else if(n<0)
    System.out.println("Negative number");
  else
    System.out.println("Neutral number");
}
}
