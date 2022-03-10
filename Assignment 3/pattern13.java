class pattern13{
public static void main(String[] args){


for(int i=1;i<=5;i++)
{
for(int k=1;k<i;k++)
{
System.out.print(" ");
}
for(int j=i;j<=5;j++)
{ 
System.out.print("*");
}




System.out.println();

}

for(int l=1;l<=4;l++)
{
for(int n=1;n<5-l;n++)
{
System.out.print(" ");
}


for(int m=1;m<=l+1;m++)
{ 
System.out.print("*");
}




System.out.println();

}
}
}