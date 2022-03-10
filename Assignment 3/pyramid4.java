class pyramid4{
public static void main(String[] args){

for(int i=1;i<=9;i++)
{
for(int j=1;j<=9-i;j++)
{
System.out.print("  ");

}
for(int k=1;k<=i;k++)
{
System.out.print(k+" ");
}
int x=i-1;
for(int b=1;b<i;b++)
{
System.out.print(x+" ");
x--;
}





System.out.println();
}



}
}