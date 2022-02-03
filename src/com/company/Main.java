package com.company;

public class Main {

    // DATA TYPES
    // int        1
    // double     1.5
    // boolean    true/false
    // char       'a'

    // String     "Word dsgsdkgj 39489284 89^&*^&*("



//      psvm
    public static void main(String[] args) {

        int x = 7;
        int x1;

        x = x + 8;
        x += 8;

        double y = 5.35;
        boolean b1 = true;
        boolean b2 = false;
        char c = 'a';

        String s1 = "my string is number 1";
        String s2 = "Yohai";

//                index : 0  1  2  3  4
        int[] intArray = {10,20,30,40,50};
        double[] doubleArray = {1.5,2.9,3,4.3,5.7};
        boolean[] booleanArray = {true,false,true};
        char[] charArray = {'a','b','c','d'};

        int[] intArray2 = {};
        int[] intArray3 = new int[3];

        String[] stringArray1 = {"first","second","third"};
        String[] stringArray2 = {s1,s2};

//        System.out.println(intArray[3]);
//
//          fori
//              start    end    step
//        for (int i = 0; i < 56; i++) {
//            System.out.println(i);
//        }
//
//        for (int i = 56; i > 0; i--) {
//            System.out.println(i);
//        }
////                              i = i * 2
//        for (int i = 2; i < 100; i *= 2) {
//            System.out.println(i);
//        }

//        String string1 = "mashu";
        String[] stringArray3 =
                {"banana", "apple", "orange", "mango", "pineapple", "avocado"};
//       index :    0         1        2         3          4           5

//        for (int i = 0; i < stringArray3.length; i++){
//            System.out.println(stringArray3[i]);
//        }
//
        //[banana, apple, orange, mango, pineapple, avocado]
//
//        System.out.print("[");
//        for (int i = 0; i < stringArray3.length; i++) {
//            if (i == stringArray3.length - 1) {
//                System.out.print(stringArray3[i]);
//            } else {
//                System.out.print(stringArray3[i] + ", ");
//            }
//        }
//        System.out.print("]");
//
//        for (int i = 0; i <= 4; i++) {
//            System.out.println(intArray[i]);
//        }
//
//        for (int i = 4; i >= 0; i--) {
//            System.out.println(intArray[i]);
//        }
//
//      sout
//        System.out.println("main");
//
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(b1);
//        System.out.println(b2);
//        System.out.println(c);
//
//        System.out.println(s1);
//
//        x1 = 8;
//
//        System.out.println("int x1 = " + x1);
//        System.out.println("double y = " + y);
//        System.out.println("boolean b1 = " + b1);
//        System.out.println("boolean b2 = " + b2);
//        System.out.println("char c = " + c);
//        int a = 5;
//        int b = 5;
//
//        int age = 21;
//
//        if(a >= b){
//            System.out.println("a is bigger than b");
//        }
//
//        if (age > 17){
//            System.out.println("you can drink");
//        }else{
//            System.out.println("you're a child go home");
//        }
//
//        System.out.println("I made to the end");

//        if (a > b){
//            System.out.println("a is bigger than b");
//        }else{
//            System.out.println("b is bigger than a");
//        }
//
//        if (a == 5){
//            System.out.println(true);
//        }else{
//            System.out.println(false);
//        }
//
//        if (a == 7){
//            System.out.println("seven");
//        }else if (a > 7){
//            System.out.println("bigger than seven");
//        }else{
//            System.out.println("smaller than seven");
//        }
//       foreach
        for (String s : stringArray3){
            System.out.println(s);
        }

        for (int number : intArray) {
            System.out.println(number);
        }






    }

}

