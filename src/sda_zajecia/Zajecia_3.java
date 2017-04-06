package sda_zajecia;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-06.
 */
public class Zajecia_3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first number: ");
        int a= scanner.nextInt();
        System.out.println("Insert second number: ");
        int b= scanner.nextInt();
        System.out.println("Insert third number: ");
        int c= scanner.nextInt();
        minMax(a,b,c);
        fahrenheitToCelcius(90);
        celciusToFarenheit(35);

    }

    //****************************************
    public static void minMax(int a,int b, int c){
        int min=0;
        int max=0;
        //max
        if(a>=b && a>=c){
            max=a;
        }else if (b>=c && b>=a){
            max=b;
        }else {
            max=c;
        }
        //min
         if(a<=b && a<=c){
            min=a;
        }else if (b<=c && b<=a){
           min=b;
        }else {
            min=c;
        }
        System.out.println("Max value: "+ max);
        System.out.println("Max value: "+ min);

    }

    //*****************************************************

    public static void celciusToFarenheit(int celcius){
        double farenheit=0;
        farenheit= 1.8*celcius+32;
        System.out.println(celcius + "C ="+farenheit+"F");
    }


    //*****************************************************

    public static void fahrenheitToCelcius(int fahrenheit){
        double celcius=0;
        celcius=(fahrenheit-32)/(double)1.8;
        System.out.println(fahrenheit+ "F ="+celcius+"C");
    }


}
