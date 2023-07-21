package java_projects;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class homework2 {
    public static void main(String[] args) throws SecurityException, IOException {
        // String pathProject2 = System.getProperty("user.dir");
        // showType(pathProject2);
        // addListToFile(pathProject2);
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("\\java_projects\\homeWork2.txt");
        Integer[] arr = { 3, 5, 1, 6, 1, 4, 1, 2, 9, 4, 9, 1 };

        // addListToFile(pathFile2, showCurrentFiles(pathProject2));

        bubbleToLogFile(pathFile, arr);

    }

    // Напишите метод, который определит тип (расширение) файлов из текущей папки и
    // выведет в консоль результат вида

    static String[] showType(String dirPath) {
        File currentDir = new File(dirPath);
        String[] currentDir2 = currentDir.list();
        for (String file : currentDir2) {
            String s = file.substring(file.lastIndexOf('.') + 1);

            System.out.printf("Тип " + file + " " + s + "\n");
        }
        return currentDir2;
    }

    // Реализуйте алгоритм сортировки пузырьком числового массива, результат после
    // каждой итерации запишите в лог-файл.

    static Integer[] showIntArray(Integer[] numList) {
        for (Integer integer : numList) {
            System.out.print(integer + " ");
        }

        return numList;
    }

    static String[] showStrArray(String numList) {
        File newNumList = new File(numList);
        return newNumList.list();
    }

    static void bubbleToLogFile(String filePath, Integer[] numList) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(homework2.class.getName());
        FileHandler fh = new FileHandler("java_projects\\homeWork2(log).txt");

        logger.addHandler(fh);

        SimpleFormatter simple = new SimpleFormatter();
        fh.setFormatter(simple);
        try {
            File myFile = new File(filePath);
            FileWriter writer = new FileWriter(myFile);

            for (Integer num : numList) {
                for (int i = 0; i < numList.length - 1; i++) {
                    int temp;
                    if (numList[i] > numList[i + 1]) {
                        temp = numList[i];
                        numList[i] = numList[i + 1];
                        numList[i + 1] = temp;
                    }
                }
                // fh.writer(showIntArray(numList));
                System.out.print(showIntArray(numList) + "\n");

            }
            writer.close();

        } catch (Exception e) {
            logger.info(e.getMessage());
        }
    }

    private static String parseInt(Integer[] list) {
        return null;
    }

}
