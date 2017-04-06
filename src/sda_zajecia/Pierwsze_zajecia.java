package sda_zajecia;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-04.
 */
public class Pierwsze_zajecia {
    public static void main(String[] args) {
      /*
       System.out.println("Hello world");
        System.out.println(5);
        int number = 5;
        int secondNumber = 3;
        System.out.println(number + 5.2);


        if(number > 3 )
        {
            System.out.println("this number is bigger than 3");
        }else{
            System.out.println("number is less than 3");
        }
        */

        /*
        checkAge();
        isNumberEven();
        checkBigger();
        */
        /*int[] array = {123,221,423,114,345,55656};
        for (int i =0; i<array.length;i++){
            System.out.println(array[i]);
        }
        */
        //displayEvenNumbers();
       // greaterThan0AndEven();
       // sumOfElements();
        //sumOfEven();
       // sumOfPositive();
        //sumOfEvenGreaterThan();
       // avg();
       /*
        int number1= 5;
        int number2= 3;
        System.out.println(number1/(double)number2);
        */
       sumOf();
        // sumMultipliedBy();
        // ****Nowy temat -

       /*
        Scanner scanner = new Scanner (System.in);
        String name = scanner.nextLine();
        System.out.println("Your name is " + name);
        int number = scanner.nextInt();
        System.out.println("Your number is: "+ number);
    */



    }
    public static void sumMultipliedBy(){
        int[] array = {1,2,3,4,5,6,7,8,9,0};

        int suma = 0;
        for (int i=1; i<array.length;i++){

                suma += array[i]*i;

            }
        System.out.println(suma);
        }




    public static void sumOf(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your number: ");
        int number = scanner.nextInt();
        int  suma= 0;
        for (int i=1;i<number;i++){
            suma += i;
        }
        System.out.println(suma);
    }

    public static void avg(){
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        double suma = 0;
        double avg =0;
        for (int i=0 ; i<array.length; i++){
            suma += array[i];
        }
        System.out.println("Suma wynosi: "+suma);
        System.out.println("No: "+ array.length);
        avg = suma / array.length;
        System.out.println("srednia wynosi : " + avg);
    }

    public static void sumOfEven(){
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        int suma = 0;
        for (int i=0; i<array.length;i++){
            if(array[i] % 2 == 0) {
                suma += array[i];
            }
        }
        System.out.println("Suma liczb parzystych wynosi : "+ suma);
    }
    public static void sumOfPositive(){
        int[] array = {1,2,-3,4,5,-6,7,8,-9,0};
        int suma = 0;
        for (int i=0; i<array.length;i++){
            if(array[i]> 0) {
                suma += array[i];
            }
        }
        System.out.println("Suma liczb dodatnich wynosi : "+ suma);
    }
    public static void sumOfEvenGreaterThan(){
        int[] array = {1,2,-3,4,5,-6,7,8,-9,0};
        int suma = 0;
        for (int i=0; i<array.length;i++){
            if(array[i]> 0 && array[i] % 2 == 0) {
                suma += array[i];
            }
        }
        System.out.println("Suma liczb dodatnich prarzystych wynosi : "+ suma);
    }

    public static void sumOfElements(){
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        int suma = 0;
        for (int i=0; i<array.length;i++){

            suma+=array[i];
        }
        System.out.println("Suma wynosi : "+ suma);

    }

    public static void checkAge() {
        System.out.println("test");
        int age = 18;
        if (age >= 18) {
            System.out.println("Age over 18");

        } else {
            System.out.println("Age under 18");
        }
    }


    public static void isNumberEven() {
        int number = 3;
        if (number % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is odd");
        }
    }

    public static void checkBigger() {
        int number1 = 3;
        int number2 = 4;

        if (number1 > number2) {
            System.out.println("Number 1 is bigger than number 2");
        } else if(number1 == number2){
            System.out.println("numbers are equal");

        }
        else {
            System.out.println("Number 2 is bigger");
        }
    }
    public static void arrayTest(){
        int[] array = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9};
        for(int i = 0;  i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    public static void displayEvenNumbers(){
        int[] array = {1,2,3,4,5,6,7,8,9,0};
           for (int i=0; i<array.length;i++){
                if(array[i] % 2 ==0){
                System.out.println(array[i]);
        }
           }
    }
    public static void greaterThan0AndEven(){
        int[] array = {-1,2,-3,4,-5,6,-7,8,-9,10,11,13,16,19,22,23};
        for (int i=0;i<array.length;i++){
            if(array[i]>0 && array[i] % 2 == 0){
                System.out.println(array[i]);
            }
        }

    }
}
