package java_projects;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class lesson2 {
    public static void main(String[] args) throws SecurityException, IOException {
        // System.out.println(longStrBuild(6, 'a', 'b'));
        // System.out.println(strCompress( "aaaabbbcdd"));
        // System.out.println(isPolindrom("abcba"));
        // System.out.println(longStrCreator("ya", 10));
        // String pathProject1 = System.getProperty("user.dir");
        // String pathFile1 = pathProject.concat("\\Seminar2-1.txt");
        // addToFile(pathFile1, longStrCreator("Word!", 10));

        String pathProject2 = System.getProperty("user.dir");
        String pathFile2 = pathProject2.concat("\\java_projects\\Seminar2-2.txt");
        addListToFile(pathFile2, showCurrentFiles(pathProject2));


    }

    static String longStrBuild(int n, char c1, char c2){
        // дано четное число N(>0) и символы с1 и с2.
        // Написать метод, который вернет строку длинны N, которая состоит из чередующихся символов с1 и с2, начиная с с1.
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            newStr.append(c1);
            newStr.append(c2);
        }

        return newStr.toString();
    }

    static String strCompress(String str){
        // Напишите метод котрый сжимает строку
        // Пример: aaaabbbcdd, результат: a4b3c1d2
        StringBuilder newStr = new StringBuilder();
        char symbol = str.charAt(0);
        newStr.append(symbol);
        int count = 0;

        for (char letter : str.toCharArray()) {
            if (letter == symbol) count++;
            else{
                if(count != 1) newStr.append(count);
                newStr.append(letter);
                symbol = letter;
                count = 1;
            }
        }
        if(count != 1) newStr.append(count);

        return newStr.toString();


    }

  
    static boolean isPolindrom(String str){
        StringBuilder res = new StringBuilder(" ");
        for (int i = str.length() - 1; i >= 0; i--) {
            res.append(res.toString());
        }
        return str.equals(res.toString());
    }

//   напишите метод который составит строку, состоящий из  iters повторений слова word и метод,
// который запишет эту строку в простой текстовый файл, обработайте исключения  
  
    static String longStrCreator(String word, int iter){
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < iter; i++) {
            str.append(word + " ");
        }
        return str.toString() + "\n";
    }

    static void addToFile(String filePath, String text){
        try {
            File myFile = new File(filePath);
            FileWriter writer = new FileWriter(myFile, true);
            
            writer.write(text);
            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

// Напишите метод, который вернет содержимое текущей папки в виде массива строк.
// Напишите метод который заполнит массив возвращенный предыдущим методом в файл.
// Обработайте ошибки с помощью try-catch конструкции.
// В случае возникновения исключения, оно должно записаться в log-файл

    static String[] showCurrentFiles(String dirPath){
        File currenntDir = new File(dirPath);
        return currenntDir.list();
    }

    static void addListToFile(String filePath, String[] list) throws SecurityException, IOException{
        Logger logger = Logger.getLogger(lesson2.class.getName());
        FileHandler fh = new FileHandler("Seminar2-2(log).txt");
        
        logger.addHandler(fh);

        SimpleFormatter simple = new SimpleFormatter();
        fh.setFormatter(simple);
        try {
            File myFile = new File(filePath);
            FileWriter writer = new FileWriter(myFile);

            for (String string : list) {
                writer.write(string + "\n");
            }
            writer.close();

        } catch (Exception e) {
            logger.warning(e.getMessage());
        }
    }


}
