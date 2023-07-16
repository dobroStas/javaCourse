package java_projects;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.io.FileNotFoundException;

public class homework2 {
    public static void main(String[] args) throws SecurityException, IOException {
        // String pathProject2 = System.getProperty("user.dir");
        // showType(pathProject2);
        // addListToFile(pathProject2);
        int [] arr = {3,5,8,1,6,9};
        puzir(arr);

    
    

    }

    // Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида
    

    static String[] showType(String dirPath){
        File currentDir = new File(dirPath);
        String [] currentDir2 = currentDir.list();
        for (String file : currentDir2) {
            String s = file.substring(file.lastIndexOf('.')+1);
            
            System.out.printf("Тип "+ file +" " + s + "\n");
        }
        return currentDir2;
    }

   // Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

    

    static void puzir(int[] arr) throws SecurityException, IOException{
        Logger logger = Logger.getLogger(SomeClass.class.getName());
        FileHandler fh = new FileHandler("homeWork2(log).txt");
        
        logger.addHandler(fh);

        SimpleFormatter simple = new SimpleFormatter();
        fh.setFormatter(simple);
        int temp;
        
            for (int i = 0; i<arr.length - 1; i++){
                try {
                    if(arr[i] > arr[i + 1]){
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
                } catch (Exception e) {
                    logger.warning(e.getMessage());
                }
            System.out.println(arr.toString());
            }           
        
    }
    
}
        


