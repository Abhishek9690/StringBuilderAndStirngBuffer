package StringBuilderAndStringBuffer;

public class StringBuilderAndStringBuffer {
    void fun()
    {
        StringBuffer sb1=new StringBuffer("Hello");
        StringBuffer sb2=new StringBuffer("Abhishek");
        System.out.println(sb1);
        System.out.println("\n\n------\n\n");
        sb1.append(sb2);
        System.out.println(sb1);
    }

    public static void main(String[] args) {
        StringBuilderAndStringBuffer obj=new StringBuilderAndStringBuffer();
        obj.fun();
    }
}
