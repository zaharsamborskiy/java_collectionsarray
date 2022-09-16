package practice.reverseArray;

public class ReverseArray {

    public static String[] reverse(String[] strings) {
        int dlina = strings.length;
        String temp;
        for (int i = 0; i < dlina/2; i++) {
            temp = strings[dlina - 1 - i];
            strings[dlina - 1 - i] = strings[i];
            strings[i] = temp;
        }
        return strings;
    }

}