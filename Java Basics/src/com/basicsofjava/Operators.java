package com.basicsofjava;

public class Operators {

    public static void main(String[] args) {
        //UnaryOperator of pre increment and post increment
        int x=10;
        int a=10;
        int b=10;
        System.out.println(x++);//10(11)
        System.out.println(++x);//12
        System.out.println(a++ + ++a);//10+12=22
        System.out.println(b++ + b++);//10+11=21
        // ~ and !
        boolean c=true;
        boolean d=false;
        System.out.println(~a);
        System.out.println(~b);
        System.out.println(!c);
        System.out.println(!d);

        //Arithmetic operator
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(10*10/5+3-1*4/2);
        //swift operator
        System.out.println(10<<2);//10*2^2=40
        System.out.println(10<<3);//10*2^3=80
        System.out.println(20<<2);//20*2^2=80
        System.out.println(15<<4);//15*2^4=240


        System.out.println(10>>2);//10/2^2=2
        System.out.println(20>>2);//20/2^2=5
        System.out.println(20>>3);//20/2^3=2
        //>> vs >>>
        //for +ve numbers >> and >>> works same
        System.out.println(20>>2);
        System.out.println(20>>>2);
        //for negative numbers >>> changes parity bit (MSB) to 0
        System.out.println(-20>>2);
        System.out.println(-20>>>2);
        // Logical && vs Bitwise &

        int L=10;
        int R=5;
        int G=45;
        System.out.println(L<R&&L<G);//false&&true=false
        System.out.println(L<R&L<G);//false&true=false

        System.out.println(L<R&&L++<G);//false&&true=false
        System.out.println(L);//10 because second condition is not checked
        System.out.println(L<R&L++<G);//false&true=false
        System.out.println(L);//11 because second condition is checked
        // || vs |
        System.out.println(L>R||L<G);//true||true=true
        System.out.println(L>R|L<G);//true/true=true


        System.out.println(L<R||L++<G);//false&&true=true
        System.out.println(L);//12 because second condition is not checked
        System.out.println(L<R|L++<G);//false&true=true
        System.out.println(L);//13 because second condition is checked
        // Ternary Operator
        int max=(L>G)?L:G;
        System.out.println(max);

        int min=(L<G)?L:G;
        System.out.println(min);
        //assignment operator
        L+=4;
        System.out.println(L);
        R-=20;
        System.out.println(R);
        L*=10;
        System.out.println(L);
        G/=9;
        System.out.println(G);
        G%=2;
        System.out.println(G);



    }
}
