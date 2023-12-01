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
        int[] input = {-1, 0, -4, 6, -2};
        int[] expected = {-4, -2, -1, 0, 6}; // Sorted array

        sorter.basicSelectionSort(input);

        System.out.println("testWithMixedNumbers Sorted array: " + Arrays.toString(input));
        
        assertArrayEquals(expected, input, "The array is not sorted correctly.");
    }
    
    @Test
    public void testWithDuplicateNumbers() {
        SelectionSort sorter = new SelectionSort();
        int[] input = {8, 8, -2, -2, 5};
        int[] expected = {-2, -2, 5, 8, 8}; // Sorted array

        sorter.basicSelectionSort(input);

        System.out.println("testWithDuplicateNumbers Sorted array: " + Arrays.toString(input));
        
        assertArrayEquals(expected, input, "The array is not sorted correctly.");
    }
}
