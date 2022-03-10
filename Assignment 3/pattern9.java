class pattern9{
public static void main(String[] args){
for(int l=1;l<=5;l++)
{
for(int m=1;m<=5-l;m++)
{
System.out.print(" ");
}

for(int n=1;n<=l;n++)
{ 
System.out.print("*");
}




System.out.println();

}

for(int i=1;i<=5;i++)
{
for(int k=1;k<=i;k++)
{
System.out.print(" ");
}

for(int j=1;j<=5-i;j++)
{ 
System.out.print("*");
}




System.out.println();

}



}
}