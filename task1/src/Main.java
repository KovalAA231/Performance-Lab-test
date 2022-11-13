import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]); // длина массива
        int m = Integer.parseInt(args[1]); // длина обхода

        int[] inputArray = new int[n];

        for(int i = 0; i < inputArray.length; i++) { // заполняем массив значениями с 1 по n
            inputArray[i] = i + 1;
        }

        int i = 0;

        while(true) { // выводим все начала путей, пока не встретим нулевой индекс
            System.out.println(inputArray[i]);
            i = (i + (m - 1)) % n;

            if(i == 0) {
                break;
            }
        }

//        while(true) {       // конец пути - момент когда длина массива совпадет с шагом обхода
//            nn = n * x + 1; // (ищем первую 1, которая совпадет с длиной обхода)
//
//            while(nn > mm) {
//                mm = m + (m - 1) * y;
//                y++;
//            }
//
//            x++;
//
//            if(nn == mm) {
//                break;
//            }
//        }
//
//        resultArray = new int[nn];
//
//        for(int i = 0; i < resultArray.length; i++) {
//            resultArray[i] = inputArray[i % inputArray.length]; // добавляем весь путь в результирующий массив
//            System.out.println(resultArray[i]);
//        }
//
//        for(int i = 0; i < inputArray.length; i++) {
//            System.out.println(resultArray[(i + (m - 1)) % resultArray.length]);
//        }
    }
}