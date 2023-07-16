package java_projects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.Set;


public class homework3 {
    public static void main(String[] args) {
        // randNum(5, 10);
        // planetsCounter(5);
    }


    // пусть дан произвольный список целых чисел.
    // 1. нужно удалить из него четные числа
    // 2. найти мин згачение.
    // 3. найти макс значение.
    // 4. найти среднее значение.


    static void randNum(int size, int maxValue){
        // удалить четные числа

        ArrayList <Integer> nums = new ArrayList<>(size);
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            nums.add(rand.nextInt(maxValue));
        }
        
        for (Integer num : nums) 
            System.out.print(num + " ");
        System.out.println();

        ArrayList <Integer> iter = new ArrayList<>(); 

        for (Integer num : nums)
            if (num % 2 != 0){
                iter.add(num);
        }

        for (Integer num : iter) 
            System.out.print(num + " ");
        System.out.println();

        int min = Collections.min(iter);
        System.out.println(min);
        int max = Collections.max(iter);
        System.out.println(max);
        OptionalDouble ave = iter.stream().mapToInt(Integer :: intValue).average();
        System.out.println(ave);
        
    }



    //  Для списка из задачи про Солнечную систему удалить все повторяющиеся элементы
    static void planetsCounter(int n){
        List<String> listPlanets = List.of("Mercuru", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune");
        List<String> randPlanets = new ArrayList<String>(n);
        int [] counts = new int [listPlanets.size()];

        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            randPlanets.add(listPlanets.get(rand.nextInt(listPlanets.size())));
            System.out.println(randPlanets.get(i) + " ");

        }
        System.out.println();


        HashSet<String> res = new HashSet<>(randPlanets);
     
        ArrayList<String> ress = new ArrayList<>();
        for(String item : res)
            ress.add(item);
        for (int i = 0; i < ress.size(); i++)
            System.out.println(randPlanets.get(i) + " ");
        
    }


   
    


}
