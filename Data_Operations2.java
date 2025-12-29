class Data_Operations2
{
public static void main(String[] args)
{
int num1=67;
int num2=91;
int num3=55;
boolean A=(num1==67);
boolean B=(num3==55);
boolean C=(num2<num1);

System.out.println("num1:"+num1);
System.out.println("num2:"+num2);
System.out.println("num3:"+num3);
System.out.println("num1>=num2:"+(num1>=num2));
System.out.println("num2<=num3:"+(num2<=num3));
System.out.println("num1<num2:"+(num1<num2));
System.out.println("num2>num3:"+(num2>num3));
System.out.println("num2!=55:"+(num2!=55));
System.out.println("num1==67:"+(num1==67));
System.out.println("A:"+A);
System.out.println("B:"+B);
System.out.println("C:"+C);
System.out.println("A and B:"+(A&&B));
System.out.println("B or C:"+(B||C));
System.out.println("Not B:"+(!B));
}
}
