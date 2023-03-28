import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        int start = 2;
        int finish = 4;
        String path = "resources/data.txt";
        String outputPath = "resources/resize_data.txt";

        Scanner scanner = new Scanner(System.in);

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath));

        List<String> strings = new ArrayList<>();

        String line = "";
        while (line != null) {
                strings.add(line);
                line = bufferedReader.readLine();
            }
        bufferedReader.close();

        for (int i = 0; i < strings.size(); i++) {
            if (i >= start && i <= finish) {
                System.out.println(strings.get(i));
                bufferedWriter.write(strings.get(i));
                bufferedWriter.newLine();
            }
        }
        bufferedWriter.close();

        for (String s : strings) {
            System.out.println(s);
        }
        }
    }
