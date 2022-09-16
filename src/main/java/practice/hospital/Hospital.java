package practice.hospital;


import java.text.DecimalFormat;
import java.util.Arrays;

public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {
        float[] patientsTemperature = new float[patientsCount];
        for (int i = 0; i < patientsCount; i++) {
            patientsTemperature[i] = Math.round(((float) (Math.random() * 8) + 32) * 100) / (float) 100.0;
            getReport(patientsTemperature);
        }
        return patientsTemperature;
    }

    public static String getReport(float[] temperatureData) {
        float averagetemp = 0.0F;
        float sum = 0;
        int count = 1;
        for (int i = 0; i < temperatureData.length; i++) {
            sum = sum + temperatureData[i];
            if (temperatureData[i] >= 36.2 && temperatureData[i] <= 36.9) {
                count++;
            }
        }
        averagetemp = sum / temperatureData.length;

        DecimalFormat decimalFormat1 = new DecimalFormat("#.##");
        String regex = "[^0-9||.||' ']";
        String report =
            "Температуры пациентов: " + (Arrays.toString(temperatureData).replaceAll(regex, "")) +
            "\nСредняя температура: " + decimalFormat1.format(averagetemp) +
            "\nКоличество здоровых: " + count;

        return report;
    }
}
