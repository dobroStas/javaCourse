package java_projects;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class lesson3 {
    public static void main(String[] args) {
        // randNum(5, 10);
        // planetsCounter(3);
        createTable(3);
    }


    static void randNum(int size, int maxValue){
        // создать рандомный список и отсортировать его

        ArrayList <Integer> nums = new ArrayList<>(size);
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            nums.add(rand.nextInt(maxValue));
        }
        
        for (Integer num : nums) 
            System.out.print(num + " ");
        System.out.println();
            
        nums.sort(Comparator.naturalOrder());

        Iterator <Integer> iter = nums.iterator();

        while (iter.hasNext()) 
            System.out.print(iter.next() + " ");
    }
        

    static void planetsCounter(int n){

        // из списка планет создать рандомный список планет по заданному размеру списка.
        // вывести исходный список с количеством раз встречающихся планет в рандомном списке
        List<String> listPlanets = List.of("Mercuru", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune");
        List<String> randPlnets = new ArrayList<String>(n);
        int [] counts = new int [listPlanets.size()];

        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            randPlnets.add(listPlanets.get(rand.nextInt(listPlanets.size())));
            System.out.println(randPlnets.get(i) + " ");

        }
        System.out.println();

        for (String planet : randPlnets) {
            counts [listPlanets.indexOf(planet)] ++;
        }

        for (int i = 0; i < counts.length; i++) {
            System.out.printf("%s - %s\n", listPlanets.get(i), counts[i]);
        }
        





    }

    static void createTable(int size){
        // из двумерного списка сформировать новый двумерный список
        List<String> genres = List.of("Фантастика", "Комедия", "Детектив", "Ужасы");
        List<ArrayList<String>> table = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < genres.size(); i++) {
            ArrayList<String> booksOfGeners = new ArrayList<>(size);
            booksOfGeners.add(genres.get(i));
            System.out.printf("Input %d titles of %s genre down here: \n", size, genres.get(i));
            for (int j = 0; j < size; j++) 
                booksOfGeners.add(sc.nextLine());
        table.add(booksOfGeners);
        }
        sc.close();
        for (ArrayList<String> books : table) {
            for (String book : books) {
                System.out.print(book + " ");
            }
            System.out.println();
            
        }
    }






}
