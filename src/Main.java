public class Main {
    public static void main(String[] args) {
        char[][][] elements = new char[2][2][2];

        System.out.println("Number of layers: " + elements.length);
        System.out.println("Number of rows: " + elements[0].length);
        System.out.println("Number of columns: " + elements[0][0].length);

        System.out.println("Initial array:");
        printArray(elements);

        elements[1][0][1] = 'A';

        System.out.println("Array after updating:");
        printArray(elements);
    }

    private static void printArray(char[][][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Turn " + i + ":");
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
