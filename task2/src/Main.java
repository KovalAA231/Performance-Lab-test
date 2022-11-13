import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        /* x^2 + y^2 = r^2 - формула окружности

         */

        StringBuilder sb = new StringBuilder();

        String[] circleCoordinates = new String[3]; // [x0, y0, r]
        String[] pointCoordinates = new String[2]; // [x, y]

        float x0 = 0;
        float y0 = 0;
        float r = 0;

        float x = 0;
        float y = 0;

        float result;

        try {
//            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\OEM\\Desktop\\examplesTask21.txt"));
            BufferedReader br = new BufferedReader(new FileReader(args[0]));

            while(true) {
                String line = br.readLine();
                if(line == null) {
                    break;
                }
                sb.append(line.concat(" "));
            }

            circleCoordinates = sb.toString().split(" ");

            x0 = Float.parseFloat(circleCoordinates[0]);
            y0 = Float.parseFloat(circleCoordinates[1]);
            r = Float.parseFloat(circleCoordinates[2]);

        } catch(Exception ex) {
            ex.printStackTrace();
        }

        try {
//            BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\OEM\\Desktop\\examplesTask22.txt"));
            BufferedReader br2 = new BufferedReader(new FileReader(args[1]));

            while(true) {
                String line = br2.readLine();

                if(line == null) {
                    break;
                }

                pointCoordinates = line.split(" ");

                x = Float.parseFloat(pointCoordinates[0]);
                y = Float.parseFloat(pointCoordinates[1]);

                result = (x - x0) * (x - x0) + (y - y0) * (y - y0);

                if(result > r * r) {
                    System.out.println(2);
                } else if(result < r * r) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }

        } catch(Exception ex) {
            ex.printStackTrace();
        }

    }
}
