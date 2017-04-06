package sda_zajecia;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-05.
 */
public class Kalkulator {
    public static void main(String[] args) {
        System.out.println("1.DODAWANIE");
        System.out.println("2.ODEJMOWANIE");
        System.out.println("3.MNOŻENIE");
        System.out.println("4.DZIELENIE");
        System.out.println("5.WARTOSC BEZWZGLEDNA");

        System.out.println("10. SUMA CIAGU");
        System.out.println("100. SREDNIA");

        Scanner scanner = new Scanner(System.in);
        int selected = scanner.nextInt();
        int number1 = 0;
        int number2 = 0;
        if (selected <10){
            System.out.println("Insert first number");
            number1 = scanner.nextInt();

            System.out.println("insert second number");
             number2 = scanner.nextInt();
        }else if(selected<100){
            System.out.println("Insert first number");
            number1 = scanner.nextInt();

        }

        if (selected == 1) {
        sum(number1,number2);

        } else if (selected == 2) {

            division(number1,number2);

        } else if (selected == 3) {

            multiply(number1,number2);

        } else if (selected == 4) {

            divide(number1,number2);


        } else if (selected == 5) {

            abs(number1,number2);

        }else if (selected == 10){
            sumLessThan(number1);
        }else if (selected == 100){
            int [] array ={1,2,3,4,5,6,7,8,9,10};
            avg(array);
        }
    }
    //************************************************
    public static void avg (int[] array){
        double sum=0;

        for(int i=0;i<array.length;i++){
            sum +=array[i];

        }
        System.out.println(sum/(double)array.length);
    }

    //**************************************

    public static void sumLessThan(int number1){

        int  suma= 0;
        for (int i=1;i<number1;i++){
            suma += i;
        }
        System.out.println(suma);
    }
    //**************************************************

    public static void divide(int number1,int number2){
        if (number2 == 0) {
            System.out.println("NIE DZIEL PRZEZ 0");
        }
            System.out.println(number1 + " / " + number2 + " = " + (number1 / (double)number2));

    }
    //*************************************************************
    public static void sum(int a,int b){
        System.out.println(a+ " + " + b + " = " + (a + b));

    }
    //*******************************************
    public static void division(int a,int b){
        System.out.println(a + " - " +b+ " = " + (a - b));
    }
    //*******************************************
    public static void multiply(int a,int b){
        System.out.println(a + " x " + b + " = " + (a*b));
    }
    //*******************************************
    public static void abs(int a,int b){
        int wynik = 0;
        wynik = a - b;
        if (wynik < 0) {
            wynik = wynik * (-1);

        }
        System.out.println("Wartosc bezwzgledna"+ wynik);

    }
}



