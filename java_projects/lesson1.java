package java_projects;
import java.util.Scanner;//считывает инфу, например с консоли
import java.io.StreamCorruptedException;
import java.time.LocalDateTime; // для 1.2

public class lesson1 {
    public static void main(String[] args) {
        // helloUser();
        // helloBYtime();
        // quantOfSame();
        // arrStr();
        // removeStr();
        
    }

    static void helloUser(){                //отдельный метод
        // 1.1 Написать программу, которая запросит пользователя ввести "Имя" в консоли.
        //  Получит введенную строку и выведет в консоль сообщение "Привет, "Имя!""
        Scanner sc = new Scanner(System.in);
        System.out.println("Input U name: ");
        String name = sc.nextLine();
        System.out.printf("Hello, %s!", name);
        sc.close();
    }

    static void helloBYtime(){
        // 1.2 Поприветствовать пользователя с текущим временем суток.

        Scanner sc = new Scanner(System.in);
        int hour= LocalDateTime.now().getHour();
        System.out.println("Input U name: ");
        String name = sc.nextLine();
        String dayTime = "";

        if (hour >= 4 && hour < 11) 
            dayTime = "morning";
        else if (hour >= 11 && hour < 17) 
            dayTime = "day";
        else if (hour >= 17 && hour < 23) dayTime = "evening";
        else dayTime = "night";

        System.out.printf("Good %s, %s!", dayTime, name);
        sc.close();
    }
    
    static void quantOfSame(){
        // вывести массив двоичных чисел, например [1,1,0,1.1,1].
        // вывести максимальное число подряд идущих 1.
        int [] array = new int [] {1,1,0,1,1,1,0,0,1,1,1,1};
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 1) count++;
            else if(count > maxCount) {
                maxCount = count;
                count = 0;
            } 
        else count = 0;           
        }
        if(count > maxCount) maxCount = count; 
        System.out.println(maxCount);

    }

    static void arrStr(){
        // заданн массив, например, nums = [1,7,3,6,5,6]
        // Написать программу, которая найдет индекс i для этого массива такой,\
        // что сумма элементов с индексами < i равна сумме элементов с индексами > i.
        int [] nums = new int[]{1,3,5,3,2};
        for (int i = 1; i < nums.length - 1; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++) 
                leftSum += nums[j];
            
            for (int j2 = i + 1; j2 < nums.length; j2++) 
                rightSum += nums[j2];

            if(leftSum == rightSum) {
                System.out.println(i);
            return;
            }
        }
        System.out.println(-1);

    }

    static void removeStr(){
        // во вразе "Добро пожаловать на курс по java" переставить слова в обратном порядке
        Scanner sc = new Scanner(System.in);
        System.out.println("Input U phrase: ");
        String phrase = sc.nextLine();
        String [] words = phrase.split(" ");
        String [] res = new String[words.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = words[words.length - 1 - i];
        }
        for (String word : res) {
            System.out.print(word + " ");
        }     
        sc.close();
    }



}
            





