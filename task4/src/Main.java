import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* считаем среднее, сумма разниц между средним и текущим и есть минимальное количество шагов.
        округляем среднее в сторону, с которой больше значений(если значений выше среднего больше, то округляем
        дробное среднее до ближайшего большего целого. если значений ниже среднего больше, то округляем
        дробное среднее до ближайшего меньшего целого)
         */
        List<Double> input = new ArrayList<>();

        double sum = 0;
        double avg = 0;

        int largerCount = 0;
        int lowerCount = 0;

        int result = 0;

        try {
//            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\OEM\\Desktop\\examplesTask4.txt"));
            BufferedReader br = new BufferedReader(new FileReader(args[0]));

            while(true) {
                String line = br.readLine();

                if(line == null) {
                    break;
                }

                input.add(Double.parseDouble(line));
            }

        } catch(Exception ex) {
            ex.printStackTrace();
        }

        for(int i = 0; i < input.size(); i++) {
            sum += input.get(i);
        }

        avg = sum / input.size();

        for(int i = 0; i < input.size(); i++) {

            if(input.get(i) > avg) {
                largerCount++;
            } else if (input.get(i) < avg) {
                lowerCount++;
            }

        }

        if(largerCount >= lowerCount) {
            avg = Math.ceil(avg);
        } else {
            avg = Math.floor(avg);
        }

        for(int i = 0; i < input.size(); i++) {
            result = (int) (result + Math.abs(input.get(i) - avg));
        }

        System.out.println(result);

    }
}
