package practice.reverseArray;


public class Main {

    // используя данный метод, вы можете использовать ваши методы, и проверить их работу на разных
    // значений для проверки и отладки
    public static void main(String[] args) {
        String line = "Каждый охотник желает знать, где сидит фазан";
        String[] colors = line.split(",?\\s+");

        for (int i = colors.length - 1; i >=0; i-- ){
            System.out.println(colors[i]);
        }
    }
}
