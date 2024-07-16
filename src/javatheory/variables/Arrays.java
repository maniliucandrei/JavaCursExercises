package javatheory.variables;

public class Arrays {
    public static void main(String[] args) {
        int[] array1 = {50, -20, 0, 30, 40, 60, 12};
        int[] array2 = {45, 20, 10, 20, 30, 50, 11};

        // Verificam daca ambele siruri au valoarea cel putin egala cu 2
        if (array1.length >= 2 && array2.length >= 2) {
            // Check if the first and last elements are the same in both arrays
            boolean sameFirstElement = (array1[0] == array2[0]);
            boolean sameLastElement = (array1[array1.length - 1] == array2[array2.length - 1]);

            // Afisam rezultatele
            System.out.println("Array 1: ");
            printArray(array1);
            System.out.println("Array 2: ");
            printArray(array2);

            System.out.println("First elements are the same: " + sameFirstElement);
            System.out.println("Last elements are the same: " + sameLastElement);
        } else {
            System.out.println("Both arrays should have at least 2 elements.");
        }
    }

    // Metoda in care ajutam folosim functia for
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

