class pattern7{
public static void main(String[] args){
for(int l=1;l<=4;l++)
{
for(int m=l;m<=4;m++)
{
System.out.print(" ");
}

for(int n=1;n<=2*l-1;n++)
{ 
System.out.print("*");
}




System.out.println();

}

for(int i=1;i<=5;i++)
{
for(int k=1;k<i;k++)
{
System.out.print(" ");
}

for(int j=i;j<=10-i;j++)
{ 
System.out.print("*");
}




System.out.println();

}



}
}