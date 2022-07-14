import java.util.Scanner;
class largestofnum{
public static void main(String args[])
{
Scanner so=new Scanner(System.in);
System.out.print("Enter the first number:");
int firstNum=so.nextInt();
System.out.print("Enter the second number:");
int secondNum=so.nextInt();
if(firstNum>secondNum)
{
System.out.println(firstNum+" is largest");
}
else{
System.out.println(secondNum+" is largest");
}
}
}
