import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] testArray = {1,2,3,4,5};
        System.out.println("testArray before 'reverse' method " + Arrays.toString(testArray) );
        reverse(testArray);
        System.out.println("testArray after 'reverse' method " + Arrays.toString(testArray));

        System.out.println("");

        int[] testArrayTwo = {6,7,8,9,10};
        System.out.println("testArray two before 'reverseCopy method" + Arrays.toString(testArrayTwo));
        int[] reversedCopy = reverseCopy(testArrayTwo);
        System.out.println("reversedCopy after 'reverseCopy' method " + Arrays.toString(reversedCopy));
        System.out.println("testArrayTwo after 'reverseCopy' method " + Arrays.toString(testArrayTwo));

    }


    private static void reverse(int[] array) { //this is a mutable method. just means that the passed array is
                                                // manipulating the data passed

        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }

    private static int[] reverseCopy(int[] array) { // second solution for reversal or array with enhanced for loop
                                        // also is a non-mutating method as the passed parameter is not manipulated

        int[] reversedArray = new int[array.length]; //copy created
        int maxIndex = array.length - 1;
        for (int el : array) {
            reversedArray[maxIndex--] = el; //decrementing so that last index is assigned to the element form 'array' in
                                            //the enhanced loop
        }

        return reversedArray;
    }
}