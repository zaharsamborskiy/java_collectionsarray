package practice.twoDimensionalArray;

public class TwoDimensionalArray {

    public static final char SYMBOL = 'X';


    public static char[][] getTwoDimensionalArray(int size) {
        char[][] sizes = new char[size][size];
        int i;
        int j = 0;
        for (i = 0; i < sizes.length; i++) {
            for (j = 0; j < sizes.length; j++) {
                sizes[i][j] = (j == i || j == sizes.length - 1 - i) ? SYMBOL : ' ';
            }
        }
        //TODO: Написать метод, который создаст двумерный массив char заданного размера.
        // массив должен содержать символ SYMBOL по диагоналям, пример для size = 3
        // [X,  , X]
        // [ , X,  ]
        // [X,  , X]

        return sizes;
    }
}
