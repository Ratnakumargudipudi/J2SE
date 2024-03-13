package com.basicsofjava;

public class ControlStatements {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        //if
        if (x+y>20){
            System.out.println("x+y is greater than 20");
        }
        //if-else
        if (x+y<20){
            System.out.println("x+y is less than 20");
        }
        else{
            System.out.println("x+y is greater than 20");
        }
        //if-else-if
        String City="HYD";
        if (City=="chennai"){
            System.out.println("city is  chennai");
        } else if (City=="benguluru") {
            System.out.println("city is benguluru");
            
        } else if (City=="kochi") {
            System.out.println("city is Kochi");
            
        } else if (City=="Vizag") {
            System.out.println("city is vizag");

        }
        else{
            System.out.println(City);
        }
        //nested if statement
        String address="Delhi,India";
        if (address.endsWith("India")){
            if (address.contains("goa")){
                System.out.println("your city is goa");
            } else if (address.contains("chennai")) {
                System.out.println("your city is chennai");

            }
            else{
                System.out.println(address.split(",")[0]);
            }

        }
        else{
            System.out.println("your are not living in india");
        }
        //switch statement
        int num=2;
        switch (num){
            case 0:System.out.println("number is 0");
                    break;
            case 1:
                System.out.println("number is 1");
                break;
            default:
                System.out.println(num);

        }
        //for loop
        int sum=0;
        for (int i=0;i<=10;i++){
            sum+=i;
        }
        System.out.println("the sum of first 10 natural numbers is"+ " "+sum);
        //for-each
        String[] subjects={"java","c","c++","golang","ruby","javascript"};
        System.out.println("printing the content of the array names:\n");
        for (String name:subjects){
            System.out.println(name);
        }
        //while loop
        int j=0;
        while (j<=10){
            System.out.println(j);
            j+=2;
        }
        //do while
        int k=0;
        System.out.println("printing the list of 10 even numbers");
        do {
            System.out.println(k);
            k+=2;
        }while (k<=10);
        //break
        for (int l = 0; l < 10; l++) {
            System.out.println(l);
            if (l==5){
                break;
            }

        }
        a:for (int m = 0; m <10 ; m++) {
           b: for (int n = 0; n < 15; n++) {
               c: for (int o = 0; o < 20; o++) {
                    System.out.println(m);
                    if (o==5){
                        break a;
                    }

                }
            }
        }
        //continue
        for (int q = 0; q <=2 ; q++) {
            for (int w = q; w <=5 ; w++) {
                if (w==4){
                    continue;
                }
                System.out.println(w);
            }

        }
    }
}
