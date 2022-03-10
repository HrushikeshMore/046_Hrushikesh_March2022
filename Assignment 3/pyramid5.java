class pyramid5{
public static void main(String[] args){
for(int i=9;i>=1;i--)
{
for(int j=1;j<=i;j++)
{
System.out.print("  ");
}int a=i;
for(int k=9;k>=i;k--)
{
System.out.print(a+" ");
a++;
}

int x=8;
for(int b=1;b<=9-i;b++)
{
System.out.print(x+" ");
x--;
}
System.out.println();
}
}
}