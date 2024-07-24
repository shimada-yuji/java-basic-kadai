package text.section_22;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanner_Test7 {

   public static void main(String[] args) throws FileNotFoundException {
      //Scannerクラスのオブジェクトを生成する
      Scanner scanner = new Scanner(new File("src/text/section_22/file.txt"));
        
      //ファイルの読み込みが続く場合、処理を続ける
      while(scanner.hasNext()) {
         //改行までの入力を受け取る
         String input= scanner.nextLine();
         System.out.println(input);
      }

   }

}
