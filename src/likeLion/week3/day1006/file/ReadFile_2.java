package likeLion.week3.day1006.file;

import java.io.File;
import java.io.FileNotFoundException;

public class ReadFile_2 {
    public static void main(String[] args) throws FileNotFoundException {
        // 현재 디렉토리 파일 목록 출력하기

        // FileReader(./파일명 작성)
        // ./ 은 디렉토리
        // 파일이 없을 경우 오류 발생하지 않게 하도록 메인 메소드에 throws alt+enter해줘야됨.
//        FileReader fileReader = new FileReader("./a_file.txt");

        // 현재 디렉토리의 첫번째 파일(dir)명
        File dir = new File("./");
        File files[] = dir.listFiles();
        // files[] 배열의 0번째 파일명 출력
        System.out.println(files[0]);

        // file 배열 전체 출력
        for(File file : files) {
            System.out.println(file);
        }
    }

}
