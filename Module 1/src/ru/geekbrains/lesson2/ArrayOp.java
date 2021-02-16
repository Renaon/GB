package ru.geekbrains.lesson2;


public class ArrayOp {

    public static void main(String[] args){

        new ArrayOp().oneAndZero();
        System.out.println("***");
        new ArrayOp().eightNu();
        System.out.println("\n***");
        new ArrayOp().multSix();
        System.out.println("\n***");
        new ArrayOp().diagonal();
        System.out.println("\n***");
        new ArrayOp().minmax();
        System.out.println("\n***");
        boolean borderland = new ArrayOp().left_right();
        System.out.println("Наличие границ, при которой сумма левой и правой части равны - " + borderland);
        System.out.println("\n***");
        int n = (int) (Math.random() * 4);
        new ArrayOp().offset(n);
    }

     void oneAndZero(){
        byte[] arr = new byte[10];
        for(int i = 0; i< arr.length; i++){
            arr[i] = this.random01();
            System.out.print(arr[i]);
        }
        System.out.println();
        for(int i = 0; i<arr.length; i++){
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
            System.out.print(arr[i]);
        }
        System.out.println();

    }

    private byte random01(){
       return (byte) (Math.random() * 2);
    }

    private void eightNu(){
        int[] arr = new int[8];
        for (int i = 0; i< arr.length; i++){
            arr[i] =i*3;
            System.out.print(arr[i] + " ");
        }

    }

    private void multSix(){
        int[] arr ={ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for(int i = 0; i< arr.length; i++){
            if(arr[i] < 6) arr[i] *= 2;
            System.out.print(arr[i] + " ");
        }
    }

    private void diagonal(){
        int size = (int) (Math.random() * 10);
        int[][] arr = new int[size][size];

        for (int i = 0; i<size; i++){
            for(int j = 0; j<size; j++){
                if(i==j) arr[i][j] = 1;
                else arr[i][j] = 0;

                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    private void minmax(){
        int[] arr = new int[10];
        System.out.println("Массив: ");
        for (int i = 0; i< arr.length; i++){
            arr[i] = (int) (Math.random() * 21);
            System.out.print(arr[i] + " ");
        }

        int min = arr[0];
        int max = arr[0];
        for (int i: arr){
            if(min>i) min = i;
            if(max<i) max = i;
        }
        System.out.println("\nMinimum: " + min + " Maximum: " + max);
    }

    private boolean left_right(){
        int[] arr = new int[10];
        System.out.println("Массив: ");
        for (int i = 0; i< arr.length; i++){
            arr[i] = (int) (Math.random() * 21);
            System.out.print(arr[i] + " ");
        }

        int sum_left = 0;
        int sum_right = 0;
        for(int i = 0; i < arr.length; i++){
            for(int l = 0; l<=i; l++){
                sum_left += arr[l];
            }
            for (int r = i+1; r < arr.length; r++){
                sum_right += arr[r];
            }
            if(sum_left == sum_right) return true;
            sum_left = 0;
            sum_right = 0;
        }

        return false;

    }

    private void offset(int n){
        int[] arr = new int[10];
        System.out.println("Массив: ");
        for (int i = 0; i< arr.length; i++){
            arr[i] = (int) (Math.random() * 21);
            System.out.print(arr[i] + " ");
        }
        int j = 0;
         while(j<n){
             int tmp = arr[0];
             arr[0] = arr[arr.length-1];

             for(int m = 1; m< arr.length; m++){
                 arr[arr.length-m] = arr[arr.length-m-1];
             }
             arr[1] = tmp;
             j++;
         }

         System.out.println("\n New array: ");
         for (int i = 0; i< arr.length; i++) System.out.print(arr[i] + " ");

    }

}
