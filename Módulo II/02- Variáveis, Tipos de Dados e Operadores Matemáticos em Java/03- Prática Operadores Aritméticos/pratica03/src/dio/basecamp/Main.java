package dio.basecamp;

public class Main {

    public static void main(String[] args) {

        System.out.println("PrePos");
        prePos();
        System.out.println("Aritmético");
        aritmetico();
        System.out.println("Atribuição");
        atribuicao();
        System.out.println("Precedência");
        precedencia();

    }

    private static void prePos() {

        int k = 10;

        int i = ++k;
        int j = k--;
        int x = k;

        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("x: " + x);
    }

    private static void aritmetico() {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a+b;
        int r2 = c-a;
        int r3 = d*b;
        int r4 = e/a;
        int r5 = c%b;

        System.out.println("a+b= " + r1);
        System.out.println("c-b= " + r2);
        System.out.println("d*e= " + r3);
        System.out.println("e/a= " + r4);
        System.out.println("c%b= " + r5);
    }

    public static void atribuicao() {

        int i = 1500;
        short j = 15;
        long l = 500L;
        int y = 35;
        float f = 3.5F;
        double d = f;

        System.out.println("d: " + d);

        i+=5; //i=i+5
        j-=3; //j=j-3
        d/=2.7d; //d=d/2.7d
        l*=3; //l=l*3
        y%= 2; //y=y%2

        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("l: " + l);
        System.out.println("y: " + y);
        System.out.println("f: " + d);

        i = y = j;

        System.out.println("y: " + y);
        System.out.println("i: " + i);

    }

    private static void precedencia() {

        int i = 10;
        int j = 20;
        int k = 30;

        int a = i++ + --j * k;// 10 + 19 * 30 => 10 + 570 = 580

        System.out.println("i++ + --j * k: " + a);
        System.out.println("i: " + i);

        int b = k/ --i % 3 + 1;// 30 / 10 % 3 + 1 => 3 % 3 +1 = 0+1 = 1

        System.out.println("k/ --i % 3 + 1: " + b);

        System.out.println("i: " + i);

        int c = 2;

        c *=i +=5; // c = 2*i; i+5=10+5=15; 15*2=30

        System.out.println("c *=i +=5: " + c);

    }
}
