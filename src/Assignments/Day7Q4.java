package Assignments;

abstract class Marks
{
    public abstract float getPercentage();
}

class A extends Marks
{
    int a,b,c;

    public A(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public float getPercentage()
    {
        return (float)((a+b+c)/3);
    }
}
class B extends Marks
{
    int a,b,c,d;

    public B(int a, int b, int c,int d)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    @Override
    public float getPercentage()
    {
        return (float)((a+b+c+d)/4);
    }
}
public class Day7Q4
{
    public static void main(String[] args)
    {
        A studentA = new A(70,83,100);
        B studentB = new B(50,75,60,65);

        System.out.println(studentA.getPercentage());
        System.out.println(studentB.getPercentage());
    }
}
