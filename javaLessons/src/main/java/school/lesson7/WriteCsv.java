package school.lesson7;

import java.io.IOException;
import java.io.PrintWriter;

public class WriteCsv {

    private static final String[] header = {"Number", "Age", "Quantity"};
    private static final int[][] data = {
            {2, 25, 4},
            {3, 41, 8},
            {4, 42, 9}
    };

    public static void main(String[] args) throws IOException {
        String result;


        try (PrintWriter writer = new PrintWriter("/Users/olena.kondzolka/IdeaProjects/olenasAndersenCourse/javaLessons/src/main/java/school/lesson7/values1.csv")) {
            StringBuilder sb = new StringBuilder();


            for (String s : header) {
                sb.append(s).append(";");
            }

            result = sb.deleteCharAt(sb.length() - 1).toString();

            for (int i = 0; i < data.length; i++) {
                sb.append('\n');
                for (int j = 0; j < data[i].length; j++) {
                    sb.append(data[i][j]);
                    sb.append(";");
                }
                result = sb.deleteCharAt(sb.length() - 1).toString();
            }


            writer.write(sb.toString());

            System.out.println("CSV written!");
            System.out.print("\n");
            System.out.println(result);

        }
    }
}
