package sub2.test;

public class Test01 {

    public static void main(String[] args) {

        char var1 = 'A';
        int var2 = var1;
        char var3 = 'B';
        int var4 = var1 + var3;

        System.out.println("var1 : " + var1);
        System.out.println("var2 : " + var2);
        System.out.println("var3 : " + var3);
        System.out.println("var4 : " + var4);

        int a = 10;
        int b = a;

        System.out.println(a > b || a == b);
        System.out.println(a > b || a == b);

        System.out.println(a > b ^ a == 10);
        System.out.println(a > b ^ a == b);

        System.out.println(a == b & test(1));
        System.out.println(a == b && test(2));

        System.out.println(a > b || a == b);
        System.out.println(a > b || a == b);


    }
    public static boolean test(int n){
        System.out.println("test(" + n + ")");
        return true;
    }

}
