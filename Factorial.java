import java.util.Scanner;
class FindFactDoWhile{
public static void main(String args[]){
int n, fact=1;
Scanner scan=new Scanner(System.in);
System.out.println("Enter number for find factorial");
n=scan.nextInt();
int i=1;
do
{
    fact=fact*i;
    i++;
}while(i<=n);
System.out.println("number "+n+" factorial is : "+fact);
}
}