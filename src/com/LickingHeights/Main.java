package com.LickingHeights;

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
        for(i=0; i < array.length; i++){
            for(j=0; j<array.length; j++){
                if(array[i]>array[j]){
                    int temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
                else{
                    array[i]=array[i];
                    array[j]=array[j];
                }
            }
        }
        return array;

    }




}


