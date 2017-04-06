package sda_zajecia;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-04.
 */
public class ZadaniaScanner {
    public static void main(String[] args) {
      //  max();
    //displayEvenElements();
       // sumOddElements();
        //countEvenElements();
       // incrementElements();
   // multiplyBy2();
   // fillArrayWithUnknownSize();
    addElementsMultipliedBy();


    }

    public static void addElementsMultipliedBy(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Insert size: ");
        int size = scanner.nextInt();
        int [] array = new int[size];
        for (int i=0; i<array.length;i++){
            System.out.println("Insert number");
            int number= scanner.nextInt();
            if(i == 0){
                array[i]= number;

            }else{
                array[i]= array[i-1]*number;


            }
        }
        int sum=0;
        for(int i=0;i<array.length;i++) {
            sum +=array[i];
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }
        System.out.println(sum/(double)array.length);

    }




    //**********************************************************************


    public static void fillArrayWithUnknownSize(){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int [100];
        int element =1 ;
        int i=0;
        while (element !=0){
            System.out.println("Insert next number. Press 0 to break.");
            element= scanner.nextInt();
            array[i]= element;
            i++;
        }
        for (int j= 0; j<i; j++){
            System.out.println(array[j]);//
        }
    }
    //*****************************************************

    public static void fillArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for(int i =0;i<array.length;i++){
            System.out.println("Insert next number: ");
            array[i]=scanner.nextInt();
            System.out.println(array[i]);
        }

    }

    //**********************************************************

    public static void multiplyBy2(){
        int [] array = {2,3,-4,5,6,-7,-8,9,-11,13};
        for(int i=0;i<array.length;i++){
            if (array[i] % 3 ==0 && array[i]>0){
                array[i]= array[i]*2; // array[i] *=2
                System.out.println(array[i]);
            }
        }

    }
//*************************************************************
   public static void addPreviusElement() {
       int [] array = {2,3,-4,5,6,-7,-8,9,-11,13};
       for(int i=1;i<array.length;i++){
           array[i]+= array[i-1];

       }
       for (int i =0; i<array.length;i++){
           System.out.println(array[i]);


       }
   }
//**************************************************************
    public static void incrementElements(){
        int [] array = {2,3,-4,5,6,-7,8,9,-11,13};
        for(int i=0; i<array.length;i++){
            if(array[i]<0){
                array[i] ++;

            }
            System.out.println(array[i]);
        }

    }

//***************************************************************
    public static void countEvenElements(){
        int [] array = {2,3,4,5,6,7,8,9,11,13};
        int counter = 0;
        for(int i=0;i<array.length;i++){
            if(array[i] % 2 ==0){


                counter ++; // counter= counter +1 lub counter +=1
                            }

        }

    }
//**************************************************************
    public static void isEven(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first number:  ");
        int number1= scanner.nextInt();
        if(number1 % 2 ==0){
            System.out.println("number 1 is even");
        }else {
            System.out.println("number 1 is odd");
        }
    }
    //*******************************************************
    public static void sumOddElements(){
        int [] array = {2,3,4,5,6,7,8,9,11,13};
        int sum=0;
        for (int i=0;i<array.length;i++){
            if (array[i] %2 != 0){
                sum += array[i];

            }

        }
        System.out.println(sum);
    }
//*****************************************************************************
    public static void displayEvenElements(){
        int [] array = {2,3,4,5,6,7,8,9,11,13};
        for (int i = 0 ; i<array.length;i++){
            if(i % 2 == 0){
                System.out.println(array[i]);
            }
        }
    }
//****************************************************************************
    public static void max(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first number:  ");
        int number1= scanner.nextInt();
        System.out.println("Insert second number:  ");
        int number2= scanner.nextInt();

        if(number1>number2){
            System.out.println("Number 1 is bigger ");
        }else if(number1==number2){
            System.out.println("Numbers are equal");

        }else{
            System.out.println("Second number is bigger");

        }

    }



}
