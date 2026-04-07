import java.util.Arrays;

class AboutArray{

    public static void main(String args[]){
        // Instead of creating multiple variables like this:
        // int i = 7;
        // int j = 8;
        // int k = 9;

        // We can store multiple values in a single array
        int[] numbers = {7, 8, 9};
        System.out.println(numbers[0]);

        // If we do not have values at the time of declaration, we can create an array by specifying its size. Java will automatically assign default values to each element.
        // You are creating an array with 3 empty slots
        // Java fills them with default values (0 for int)
        int[] nums = new int[3];
        // System.out.println(nums); will not print the array
        System.out.println(Arrays.toString(nums));

        // multidimensional array - normal array
        int[][] moreNumbers = new int[3][4];

        for(int i = 0; i<3; i++){
            for(int j = 0; j<4; j++){
                moreNumbers[i][j] = (int)(Math.random()*100);
                System.out.print(moreNumbers[i][j]+" ");
            }
            System.out.println();
        }

        // enhanced for loop
        for(int n[]: moreNumbers){
            // System.out.print(Arrays.toString(n));
            for(int m: n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

        // multidimensional array - jagged array (column is not specified we can give it later)
        int[][] randomNumbersArray = new int[3][];
        randomNumbersArray[0] = new int[3];
        randomNumbersArray[1] = new int[5];
        randomNumbersArray[2] = new int[7];

        for(int i = 0; i<randomNumbersArray.length; i++){
            for(int j = 0; j<randomNumbersArray[i].length; j++){
                System.out.print(randomNumbersArray[i][j]+" ");
            }
            System.out.println();
        }

        // for(int n[]: randomNumbersArray){
            // System.out.print(Arrays.toString(n));
        //     for(int m: n){
        //         System.out.print(m+" ");
        //     }
        //     System.out.println();
        // }

        // three dimensional array
        int[][][] randomNumbersArray = new int[3][2][5];

    }

}