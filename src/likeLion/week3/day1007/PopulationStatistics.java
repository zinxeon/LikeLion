package likeLion.week3.day1007;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PopulationStatistics {

    /* 내코드,,,,
    // 한줄씩 불러오기 메소드 생성
    public void readByLine(String filename) {
        FileReader fileReader = new BufferedReader(
                new FileReader("d:\\file.txt");
        );
        String str;
        while((str = reader.readLine()))

    }


    public static void main(String[] args) throws IOException {
        String address = "C:\\Users\\zinxe\\Downloads";
        // FileReader fileReader = new FileReader("파일위치");
        FileReader fileReader = new FileReader(address);

        // char c = fileReader.read();
        // fileReader.read(); 는 int를 반환 하기 때문에 형변환
//        char c = (char)fileReader.read();
//        System.out.println(c);
//        char c2 = (char)fileReader.read();
//        System.out.println(c2);

        // 수업로그의 참고자료 링크 참조하기

        // 파일을 읽지 않는다.
        // 한 바이트씩 읽기
        String fileContents = "";
        while (fileContents.length() < 1_000_000) {
            char c = (char)fileReader.read();
            fileContents += c;
            // 확인하고 싶을 때 출력해보기
            // System.out.println(fileContents);
        }
        System.out.println(fileContents);
        // 1byte 읽기 끝

        // 1줄씩 읽는 기능 - 메소드 추가

    }


     */

    // 나영님 코드,,,,
    //코드 메소드로 분리
    public void readByChar(String filename) throws IOException{
        FileReader fileReader = new FileReader(filename);
        // 파일을 읽지 않는다.

        /* 한 바이트씩 읽기 */
        // 파일 내용 문자열로 초기화
        String fileContents="";
        // 반복문으로 파일내용의 길이 돌려 문자(한개) 출력하기
        while (fileContents.length() <1_000_000){
            char c = (char)fileReader.read();
            fileContents += c;
            System.out.println(fileContents);
        }
        System.out.println(fileContents);
    }

    public void readByLine(String filename) throws IOException{
        BufferedReader reader = new BufferedReader(
                new FileReader(filename)
        );
        String str;
        while ((str = reader.readLine()) != null) {
            System.out.println(str);
        }
        reader.close();

    }

    public void readByLine2(String filename){
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(filename), StandardCharsets.UTF_8)){

            String line;
            while ((line = br.readLine()) != null);{
                System.out.println(line);
            }
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }

    public String fromToString(PopulationMove populationMove) {
        return populationMove.getFromSido() + "," + populationMove.getToSido() + "\n";
    }

    public static void main(String[] args) throws IOException {
        String address = "C:\\Users\\zinxe\\OneDrive\\바탕 화면\\멋사자료\\2021_인구관련연간자료_20220927_66125.csv";

        PopulationStatistics populationStatistics = new PopulationStatistics();
        populationStatistics.readByLine(address);

        List<String> strings = new ArrayList<>();


    }

}
