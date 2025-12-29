class Data_Operations1
{
public static void main(String[] fgasgs)
{
byte num1=67;
byte num2=91;
byte num3=77;
int sum=num1+num2+num3;
int difference=num2-num1;
int product=num1*num2*num3;
float division=num2/num3;
int modulus=num3%num1;
int postincrement=++num1;
int postdecrement=--num1;

System.out.println("num1:"+num1);
System.out.println("num2:"+num2);
System.out.println("num3:"+num3);
System.out.println("sum(num1+num2+num3):"+sum);
System.out.println("difference(num2-num1):"+difference);
System.out.println("Product(num1*num2*num3):"+product);
System.out.println("Division(num2/num3):"+division);
System.out.println("Modulus(num3%num1):"+modulus);
System.out.println("After increment of num1:"+postincrement);
System.out.println("After decrement of num2:"+postdecrement);
}
}
