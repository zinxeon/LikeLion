package likeLion.week3.day1006.file;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile_1 {
    public static void main(String[] args) throws IOException {
        // 한글자씩 읽기
        FileReader reader = new FileReader("./a_file.txt");
        char c = (char) reader.read();
        System.out.println(c);
    }
}
