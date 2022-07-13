package dio.basecamp;

public class Main {

    public static void main(String[] args) {

        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 59.66;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s2 = "Fulano";
        boolean b1 = true;
        boolean b2 = false;

        long l1 = 1597L;
        long l2 = 3997L;
        byte y1 = 1;
        short h1 = 25;

        System.out.println("i1 == i2: " + (i1 ==i2));
        System.out.println("i1 != i2: " + (i1 !=i2));
        System.out.println("i1 > i2: " + (i1 >i2));
        System.out.println("i1 <= i2: " + (i1 <=i2));

        System.out.println("f1 == f2: " + (f1 ==f2));
        System.out.println("f1 != f2: " + (f1 !=f2));
        System.out.println("f1 >= f2: " + (f1 >=f2));
        System.out.println("f1 < f2: " + (f1 <f2));

        System.out.println("c1 == c2: " + (c1 ==c2));
        System.out.println("c1 != c2: " + (c1 !=c2));
        System.out.println("c1 > c2: " + (c1 >c2));
        System.out.println("c1 <= c2: " + (c1 <=c2));

        System.out.println("s1 == s2: " + (s1 ==s2));
        System.out.println("s1 != s2: " + (s1 !=s2));
//        System.out.println("s1 >= s2: ");
//        System.out.println("s1 < s2: ");

        System.out.println("b1 == b2: " + (b1 ==b2));
        System.out.println("b1 != b2: " + (b1 !=b2));
//        System.out.println("b1 > b2: " + (b1 >b2));
//        System.out.println("b1 <= b2: " + (b1 <=b2));

        System.out.println("i2 > f1: " + (i2 >f1));
        System.out.println("d1 == h1: " + (d1 ==h1));
//        System.out.println("s2 != c2: ");
//        System.out.println("s1 <= i1: ");

        System.out.println("l1 == i2: " + (l1 ==i2));
        System.out.println("l2 >= i1: " + (l2 >=i1));
        System.out.println("y1 != h1: " + (y1 !=h1));


    }

}
