//Write a program to calculate the total inversion of an array. 
//The inversion of an array is defined as a pair of indices for which i < j and array[i] > array[j].


package assessment;

public class InversionArray {


    public static int countInversions(int[] array) {
        int count = 0;
        
        
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    count++; 
                }
            }
        }
        
        return count;  
    }

    public static void main(String[] args) {
        int[] array = { 2, 4, 1, 3, 5 };
        
        System.out.println("Total Inversions: " + countInversions(array));
    }

	

}
