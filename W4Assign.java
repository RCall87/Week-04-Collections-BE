public class Main {

    public static void main(String[] args) {
        // Task 1: Create an array of int called ages
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

        // Task 1a: Subtract the first element from the last element and print the result
        int result = ages[ages.length - 1] - ages[0];
        System.out.println("Result: " + result);

        // Task 1b: Create a new array with one more element than the ages array and calculate the difference
        int[] newAges = new int[ages.length + 1];
        for (int i = 0; i < ages.length; i++) {
            newAges[i] = ages[i];
        }
        int newResult = newAges[newAges.length - 1] - newAges[0];
        System.out.println("New Result: " + newResult);

        // Task 1c: Calculate the average age and print the result
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        double average = (double) sum / ages.length;
        System.out.println("Average Age: " + average);

        // Task 2: Create an array of String called names
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

        // Task 2a: Calculate the average number of letters per name and print the result
        int totalLetters = 0;
        for (String name : names) {
            totalLetters += name.length();
        }
        double averageLetters = (double) totalLetters / names.length;
        System.out.println("Average Letters per Name: " + averageLetters);

        // Task 2b: Concatenate all the names together with spaces and print the result
        StringBuilder concatenatedNames = new StringBuilder();
        for (String name : names) {
            concatenatedNames.append(name).append(" ");
        }
        System.out.println("Concatenated Names: " + concatenatedNames.toString().trim());

        // Task 3: Access the last element of any array
        int lastElement = ages[ages.length - 1];
        System.out.println("Last Element of ages array: " + lastElement);

        // Task 4: Access the first element of any array
        int firstElement = ages[0];
        System.out.println("First Element of ages array: " + firstElement);

        // Task 5: Create a new array of int called nameLengths and add the length of each name
        int[] nameLengths = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }

        // Task 6: Calculate the sum of all elements in the nameLengths array and print the result
        int sumOfNameLengths = 0;
        for (int length : nameLengths) {
            sumOfNameLengths += length;
        }
        System.out.println("Sum of Name Lengths: " + sumOfNameLengths);

        // Task 7: Method to repeat a word n times
        String repeatedWord = repeatWord("Hello", 3);
        System.out.println("Repeated Word: " + repeatedWord);

        // Task 8: Method to get the full name from first name and last name
        String fullName = getFullName("John", "Doe");
        System.out.println("Full Name: " + fullName);

        // Task 9: Method to check if the sum of an array is greater than 100
        boolean isSumGreaterThan100 = isSumGreaterThan100(ages);
        System.out.println("Is Sum Greater Than 100? " + isSumGreaterThan100);

        // Task 10: Method to calculate the average of an array of double
        double[] values = {5.5, 6.8, 7.3, 9.2};
        double averageValue = calculateAverage(values);
        System.out.println("Average Value: " + averageValue);

        // Task 11: Method to compare the averages of two arrays
        double[] array1 = {10.5, 11.2, 12.1};
        double[] array2 = {8.6, 9.7, 10.9};
        boolean isFirstAverageGreaterThanSecond = isFirstArrayAverageGreaterThanSecond(array1, array2);
        System.out.println("Is First Array Average Greater Than Second Array Average? " + isFirstAverageGreaterThanSecond);

        // Task 12: Method to check if it's hot outside and if money in pocket is enough to buy a drink
        boolean isHotOutside = true;
        double moneyInPocket = 15.0;
        boolean willBuyDrink = willBuyDrink(isHotOutside, moneyInPocket);
        System.out.println("Will Buy Drink? " + willBuyDrink);
    }

    // Task 5: Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
    public static int[] getNameLengths(String[] names) {
        int[] nameLengths = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }
        return nameLengths;
    }

    // Task 7: Method to repeat a word n times
    public static String repeatWord(String word, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(word);
        }
        return result.toString();
    }

    // Task 8: Method to get the full name from first name and last name
    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    // Task 9: Method to check if the sum of an array is greater than 100
    public static boolean isSumGreaterThan100(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum > 100;
    }

    // Task 10: Method to calculate the average of an array of double
    public static double calculateAverage(double[] array) {
        if (array.length == 0) {
            return 0.0;
        }
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Task 11: Method to compare the averages of two arrays
    public static boolean isFirstArrayAverageGreaterThanSecond(double[] array1, double[] array2) {
        double average1 = calculateAverage(array1);
        double average2 = calculateAverage(array2);
        return average1 > average2;
    }

    // Task 12: Method to check if it's hot outside and if money in pocket is enough to buy a drink
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
    }

     // Task 13: Custom method to calculate the total cost of buying items
     public static double calculateTotalCost(double unitPrice, int quantity) {
        return unitPrice * quantity;
    }

    public static void main(String[] args) {
        // ... (Previous main method code)

        // Task 13: Using the custom method to calculate total cost
        double unitPrice = 2.5;
        int quantity = 10;
        double totalCost = calculateTotalCost(unitPrice, quantity);
        System.out.println("Total Cost: " + totalCost);
    }
}
