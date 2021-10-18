import java.util.*;  
class Neon  
{  
public static void main(String args[])  
{  
int sum = 0, n;      
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number: ");    
n = sc.nextInt();    
int sq = n * n;    
while(sq != 0)  
{       
int digit = sq % 10;    
sum = sum + digit;    
sq = sq / 10;  
}  
if(n == sum)  
System.out.println(n + " is a Neon Number.");  
else  
System.out.println(n + " is not a Neon Number.");  
}  
}  
