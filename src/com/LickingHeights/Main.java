package com.LickingHeights;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int size = 10;
        int lowestNumber = 0;
        int highestNumber = 10;


        int[] array = createNumberArray(size, lowestNumber, highestNumber);
        Pattern1();
        Pattern2();
        Pattern3();
        Pattern4();
        Pattern5();
        System.out.println("The sum of the array is " + sum(array));
        System.out.println("The minimum of the array is " + min(array));
        System.out.println("The maximum of the array is " + max(array));
        printArray(array);
        bubbleSort(array);
        System.out.println("After bubble sort");
        printArray(array);
        String[] adj = {"loud","quiet","mindblowing","super cool"};
        String[] places = {"London", "Paris", "Germany", "Dublin,Ireland"};
        String[] people = {"harry styles","timothee chalamet","Betty Cooper","Sam Cahill"};
        String[] verbs = {"run","jump","skip","laugh"};
        String[] times = {"evening","dawn","morning","dusk"};
        String[] things = {"chair","book","movie","monster"};
       System.out.println(sentenceGenerator(adj,places,people,verbs,times,things));
       String[]firstName = {"lil","dawg","biggie","wiz"};
       String[]secondName={"ice","snapback","dr","brocoli"};
       String[]lastName={"khalifa","wayne","chalamet","redbeard"};
       System.out.println(print80sRapperName(firstName,secondName,lastName));









        }

    public static int[] createNumberArray(int size, int lowestNumber, int highestNumber) {
        int[] array = new int[size];

        //fill with random values
        for (int i = 0; i < size; i++) {
            array[i] = createRandomNumber(lowestNumber, highestNumber);
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int createRandomNumber(int lowestNumber, int highestNumber) {

        int number = (int) ((Math.random() * (highestNumber - lowestNumber + 1)) + lowestNumber);
        return number;
    }

    public static void Pattern1() {
        for (int rows = 0; rows < 7; rows++) {

            for (int columns = 0; columns < 6; columns++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Pattern2() {
        for (int rows = 1; rows < 7; rows++) {

            for (int columns = 0; columns < 7; columns++) {
                System.out.print(rows);

            }
            System.out.println();

        }
    }

    public static void Pattern3() {
        for (int rows = 1; rows < 7; rows++) {

            for (int columns = 1; columns < 7; columns++) {
                System.out.print(columns);

            }
            System.out.println();

        }

    }

    public static void Pattern4() {
        for (int rows = 6; rows > 0; rows--) {
            for (int columns = rows; columns < 7; columns++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void Pattern5() {
        for (int rows = 1; rows < 7; rows++) {
            for (int columns = 1; columns <= rows; columns++) {
                System.out.print(columns);
            }
            System.out.println();
        }

    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;

    }
    public static int[] bubbleSort(int[]array){
        int i,j;
        for(i=0; i < array.length-1; i++){
            for(j=i+1; j<array.length; j++){
                if(array[i]>array[j]){
                    int temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }
        return array;

    }
    public static String sentenceGenerator(String[] adj, String[] verbs, String[]people, String[]places, String[]times, String[]things){
    return "I was  "+randomWord(verbs)+" down the "+randomWord(places)+" around "+randomWord(times)+" with my best friend " +randomWord(people)+" and we " +randomWord(verbs)+" a "+randomWord(adj)+randomWord(things)+" that was "+randomWord(verbs)+randomWord(things);


    }


    public static String randomWord(String[]array){
        Random random = new Random();
        return array[random.nextInt(array.length)];

    }
    public static String print80sRapperName(String[]firstName,String[]secondName,String[]lastName){
        return randomWord(firstName)+" "+randomWord(secondName)+" "+randomWord(lastName);
    }








}


