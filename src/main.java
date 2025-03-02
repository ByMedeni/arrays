import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option to execute:");
            System.out.println("1. Average of 10 numbers and numbers greater than 50");
            System.out.println("2. Find duplicate elements in an array");
            System.out.println("3. Sum of positive and negative numbers");
            System.out.println("4. Sort 10 numbers in descending order");
            System.out.println("5. Sort and display 10 words");
            System.out.println("6. Display even numbers from 20 random numbers");
            System.out.println("7. Search for a city in a predefined list");
            System.out.println("8. Find max and min from predefined numbers");
            System.out.println("9. ArrayList operations (get, set, remove, clear, size)");
            System.out.println("10. Array operations (sort, binarySearch, copyOfRange, equals, fill)");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter 10 numbers :");
                    int[] numbers1 = new int[10];
                    int total = 0;
                    for (int i = 0; i < 10; i++) {
                        numbers1[i] = scanner.nextInt();
                        total += numbers1[i];
                    }
                    double average = total / 10.0;
                    System.out.println("Average of numbers: " + average);
                    System.out.print("Numbers greater than 50: ");
                    for (int num : numbers1) {
                        if (num > 50) {
                            System.out.print(num + " ");
                        }
                    }
                    break;

                case 2:
                    System.out.println("Enter array size: ");
                    int size2 = scanner.nextInt();
                    int[] array2 = new int[size2];
                    System.out.println("Enter array elements: ");
                    for (int i = 0; i < size2; i++) {
                        array2[i] = scanner.nextInt();
                    }
                    for (int i = 0; i < array2.length; i++) {
                        for (int j = i + 1; j < array2.length; j++) {
                            if (array2[i] == array2[j]) {
                                System.out.println("Duplicate element: " + array2[i]);
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("Enter array size: ");
                    int size3 = scanner.nextInt();
                    int[] array3 = new int[size3];
                    System.out.println("Enter array elements: ");
                    for (int i = 0; i < size3; i++) {
                        array3[i] = scanner.nextInt();
                    }
                    int positiveSum = 0, negativeSum = 0;
                    for (int i = 0; i < size3; i++) {
                        if (array3[i] > 0) {
                            positiveSum += array3[i];
                        } else if (array3[i] < 0) {
                            negativeSum += array3[i];
                        }
                    }
                    System.out.println("Sum of positive numbers: " + positiveSum);
                    System.out.println("Sum of negative numbers: " + negativeSum);
                    break;

                case 4:
                    ArrayList<Integer> numbers4 = new ArrayList<>();
                    System.out.println("Enter 10 numbers: ");
                    for (int i = 0; i < 10; i++) {
                        numbers4.add(scanner.nextInt());
                    }
                    Collections.sort(numbers4, Collections.reverseOrder());
                    System.out.println("Sorted numbers in descending order: " + numbers4);
                    break;

                case 5:
                    ArrayList<String> words = new ArrayList<>();
                    System.out.println("Enter 10 words: ");
                    for (int i = 0; i < 10; i++) {
                        words.add(scanner.nextLine());
                    }
                    Collections.sort(words);
                    System.out.println("Sorted words: " + words);
                    break;

                case 6:
                    ArrayList<Integer> numbers5 = new ArrayList<>();
                    ArrayList<Integer> evenNumbers = new ArrayList<>();
                    Random random = new Random();
                    for (int i = 0; i < 20; i++) {
                        numbers5.add(random.nextInt(100));
                    }
                    for (int number : numbers5) {
                        if (number % 2 == 0) {
                            evenNumbers.add(number);
                        }
                    }
                    System.out.println("Even numbers: " + evenNumbers);
                    break;

                case 7:
                    ArrayList<String> cities = new ArrayList<>(Arrays.asList("İstanbul", "Ankara", "İzmir", "Bursa", "Antalya"));
                    System.out.print("Enter a city to search: ");
                    String cityToSearch = scanner.nextLine();
                    if (cities.contains(cityToSearch)) {
                        int index = cities.indexOf(cityToSearch);
                        System.out.println("City found at index: " + index);
                    } else {
                        System.out.println("City not found.");
                    }
                    break;

                case 8:
                    ArrayList<Integer> numbers6 = new ArrayList<>(Arrays.asList(21, 5, 9, 23, 17, 1, 56, 32, 8, 14));
                    int max = Collections.max(numbers6);
                    int min = Collections.min(numbers6);
                    System.out.println("Max number: " + max);
                    System.out.println("Min number: " + min);
                    break;

                case 9:
                    ArrayList<Integer> numbers7 = new ArrayList<>(Arrays.asList(10, 20, 30));
                    System.out.println("First number in the list: " + numbers7.get(0));
                    numbers7.set(1, 50);
                    System.out.println("After set operation: " + numbers7);
                    numbers7.remove(1);
                    System.out.println("After remove operation: " + numbers7);
                    numbers7.clear();
                    System.out.println("After clear operation: " + numbers7);
                    System.out.println("Size of the list: " + numbers7.size());
                    break;

                case 10:
                    int[] arrays1 = {5, 3, 8, 7, 9};
                    Arrays.sort(arrays1);
                    System.out.println("Sorted array: " + Arrays.toString(arrays1));
                    int index = Arrays.binarySearch(arrays1, 7);
                    System.out.println("Index of 7: " + index);
                    int[] newArray = Arrays.copyOfRange(arrays1, 1, 4);
                    System.out.println("Copied array: " + Arrays.toString(newArray));
                    int[] arr1 = {1, 2, 3};
                    int[] arr2 = {1, 2, 3};
                    boolean areEqual = Arrays.equals(arr1, arr2);
                    System.out.println("Are arrays equal? " + areEqual);
                    int[] arrays2 = new int[5];
                    Arrays.fill(arrays2, 7);
                    System.out.println("Array after fill: " + Arrays.toString(arrays2));
                    break;

                case 0:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
