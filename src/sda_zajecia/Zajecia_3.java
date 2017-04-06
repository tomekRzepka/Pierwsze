package sda_zajecia;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-06.
 */
public class Zajecia_3 {
    public static void main(String[] args) {
    /*Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first number: ");
        int a= scanner.nextInt();
        System.out.println("Insert second number: ");
        int b= scanner.nextInt();
        System.out.println("Insert third number: ");
        int c= scanner.nextInt();
        minMax(a,b,c);
        fahrenheitToCelcius(90);
        celciusToFarenheit(35);
*/
    Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your weight");
        int number1= scanner.nextInt();
        System.out.println("Insert your height in meters");
        double number2 = scanner.nextDouble();

    bmi(number1,number2);
    }
    public static void bmi(int weight, double height){

        double bmi= weight/(height*height);
        System.out.println("Your's BMI : " + bmi);
        if ( bmi >= 18.5 &&  bmi <= 24.9){
            System.out.println("Your BMI is correct");
        }else if(bmi<18.5) {
            System.out.println("Masz niedowage");

        }else{
            System.out.println("You are too FAT!!");
        }
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
