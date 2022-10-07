package school.lesson7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadCsv {
    public static void main(String[] args) throws Exception {
        File myFile = new File("/Users/olena.kondzolka/IdeaProjects/olenasAndersenCourse/javaLessons/src/main/java/school/lesson7/values1.csv");
        String line;
        try (BufferedReader br =
                     new BufferedReader(new FileReader(myFile))) {
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

