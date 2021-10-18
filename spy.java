import java.util.Scanner;  
public class SpyNumberExample1   
{  
public static void main(String args[])  
{   
int num, product=1, sum=0, ld; 
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number to check: " );    
num=sc.nextInt();    
while(num>0)  
{        
ld=num%10;    
sum=sum+ld;  
product=product*ld;    
num=num/10;  
}    
if(sum==product)    
System.out.println("The given number is a spy number.");  
else  
System.out.println("The given number is not a spy number.");  
}  
}  
