package java_projects;

import java.lang.reflect.Array;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
        ex1();
    }

    // даны два Deque, представляющие два целых числа. 
    // цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
    // 1. Умножте два числа и верните произведение в виде связанного списка.
    // 2. Сложите два числа и верните сумму в виде связанного списка. Одно или два числа должны быть отрицательными

    static void ex1() {
        Deque<String> deq1 = new LinkedList<>();
        Deque<String> deq2 = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        String data = "end";

        while (true) {
            System.out.println("Input a namber 1 byctyping one by one: ");
            data = sc.nextLine();
            if (data.equals("end")){
                while (true) {
                System.out.println("Input a namber 2 byctyping one by one: ");
                data = sc.nextLine();
                if (data.equals("end")){
                    sc.close();
                    return;
                }
                changingList(deq2, data);
                System.out.println(deq2);
                }
            }
            changingList(deq1, data);
            System.out.println(deq1);
        }
        prodDeq(deq1, deq2);
    }



    static void prodDeq(Deque<String>deq1, Deque<String>deq2){
        

    }

    private static void changingList(Deque<String> myList, String data) {
        
        // if (data.equals("print")) {
        //     for (String item : myList) {
        //         System.out.println(item);
        //     }
        // } else if (data.equals("revert")){
        //     myList.pollFirst();
        // } else {
            myList.addFirst(data);
        // }
    

    }
}
