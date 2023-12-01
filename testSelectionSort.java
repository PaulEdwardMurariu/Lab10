import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class testSelectionSort {

    @Test
    public void testAllPositives() {
        SelectionSort sorter = new SelectionSort();
        int[] input = {5, 2, 4, 3, 1};
        int[] expected = {1, 2, 3, 4, 5}; // Sorted array

        sorter.basicSelectionSort(input);

        System.out.println("testAllPositives Sorted array: " + Arrays.toString(input));
        
        assertArrayEquals(expected, input, "The array is not sorted correctly.");
    }

    @Test
    public void testAllNegatives() {
        SelectionSort sorter = new SelectionSort();
        int[] input = {-5, -2, -4, -3, -1};
        int[] expected = {-5, -4, -3, -2, -1}; // Sorted array

        sorter.basicSelectionSort(input);

        System.out.println("testAllNegatives Sorted array: " + Arrays.toString(input));
        
        assertArrayEquals(expected, input, "The array is not sorted correctly.");
    }
    
    @Test
    public void testWithMixedNumbers() {
        SelectionSort sorter = new SelectionSort();
        int[] input = {-4, 0, -1, 9, -3};
        int[] expected = {-4, -3, -1, 0, 9}; // Sorted array

        sorter.basicSelectionSort(input);

        System.out.println("testWithMixedNumbers Sorted array: " + Arrays.toString(input));
        
        assertArrayEquals(expected, input, "The array is not sorted correctly.");
    }
    
    @Test
    public void testWithDuplicateNumbers() {
        SelectionSort sorter = new SelectionSort();
        int[] input = {7, 7, -3, -3, 4};
        int[] expected = {-3, -3, 4, 7, 7}; // Sorted array

        sorter.basicSelectionSort(input);

        System.out.println("testWithDuplicateNumbers Sorted array: " + Arrays.toString(input));
        
        assertArrayEquals(expected, input, "The array is not sorted correctly.");
    }
}
