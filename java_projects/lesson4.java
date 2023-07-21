package java_projects;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class lesson4 {
    public static void main(String[] args) {
        // timeComparing();
        // ex2();
        ex3();
    }

    // замерьте время за которое в ArrayList добавится 1млн элементов
    // замерьте время за которое в Linkedlist добавится 1млн элементов
    // сравните
    static void timeComparing() {
        ArrayList<Integer> al = new ArrayList<>();
        LinkedList<Integer> ll = new LinkedList<>();

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            al.add(5);
        }
        System.out.println(System.currentTimeMillis() - start1);

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            ll.add(5);
        }
        System.out.println(System.currentTimeMillis() - start2);

    }

    // необходимо реализовать небольшое консольное приложение, функционал которого
    // должен подразумевать три пункта
    // 1. Приложение будет получать от пользователя на вход строку вида text~num
    // 2. необходимо сделать split() с разделителем "~"
    // 3. сохранить то что левее "~" в связанный список на позицию num
    // если то что введено соответствует print~num, то это слово не добавляем это
    // слово в связанный список,
    // а ищем по позиции Num содержимое связанного списка , выводим его и удаляем из
    // нашего связанного списка
    static void ex2() {
        LinkedList<String> myList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        String data = "end";

        while (true) {
            System.out.printf("Input text~num, 0 <= num <= %d\n", myList.size());
            data = sc.nextLine();
            if (data.equals("end")){
                sc.close();
                return;}
            changingList(myList, data);
            System.out.println(myList);
        }
        
    }

    static void changingList(LinkedList<String> myList, String data) {
        try {
            int index = Integer.parseInt(data.split("~")[1]);
            String text = data.split("~")[0];
            if (text.equals("print")) {
                System.out.println(myList.get(index));
                myList.remove(index);
            } else
                myList.add(index, text);
        } catch (Exception e) {
            System.out.println("U have to input a correct number!");
        }
    }

    // реализовать консольное приложение которое принимает от пользователя строки(по
    // принципу очереди)
    // если вводит print, то последняя это первая, а первая это последняя
    // если вводит revert то удаляем пердыдущую введенную
    static void ex3() {
        Deque<String> myList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        String data = "end";

        while (true) {
            System.out.println("Input something or print or revert or end: ");
            data = sc.nextLine();
            if (data.equals("end")){
                sc.close();
                return;}
            changingList(myList, data);
            System.out.println(myList);
        }
        
    }

    private static void changingList(Deque<String> myList, String data) {
        if (data.equals("print")) {
            for (String item : myList) {
                System.out.println(item);
            }
        } else if (data.equals("revert")){
            myList.pollFirst();
        } else {
            myList.addFirst(data);
        }
    

    }
}
