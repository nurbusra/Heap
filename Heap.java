package heap;

import java.util.Scanner;

/**
 *
 * @author busra
 */
public class Heap {

    public static void main(String [] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Virgül ile ayrılmış sayıları girin:");
        String input = scanner.nextLine();
        String[] inputNumbers = input.split(",");
        
        int[] numbers = new int[inputNumbers.length];
        for (int i = 0; i < inputNumbers.length; i++) {
            numbers[i] = Integer.parseInt(inputNumbers[i]);
        }

        // Dizinin minimum heap olup olmadığını kontrol eder.
        
        boolean isMinHeap = true;
        
        for (int i = 0; i < numbers.length; i++) {
            int leftChildIndex = 2 * i + 1;
            int rightChildIndex = 2 * i + 2;
            
            if (leftChildIndex < numbers.length && numbers[i] > numbers[leftChildIndex]) {
                isMinHeap = false;
                break;
            }
            if (rightChildIndex < numbers.length && numbers[i] > numbers[rightChildIndex]) {
                isMinHeap = false;
                break;
            }
        }

        if (isMinHeap) {
            System.out.println("Bu dizi minimum heap'tir.");
        } else {
            System.out.println("Bu dizi minimum heap değildir.");
        }
    }
}
}
