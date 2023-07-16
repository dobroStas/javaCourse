package java_projects;
import java.util.Scanner;//считывает инфу, например с консоли

public class homeWork1 {
    public static void main(String[] args) {
        // z1();
        // z2();
        z3();
        
    }
    static void z1(){
        // Вычислить n-ое треугольного число (сумма чисел от 1 до n)
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = sc.nextInt();
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i;
        }
        System.out.println(res);
    }

    static void z2(){
        // Вывести все простые числа от 1 до 1000
        for (int i = 2; i < 1001; i++) {
            boolean a = true;
            for (int j = 2; j < i; j++){
                if (i % j == 0) a = false;
            }
            if (a) System.out.println(i);

        }
    }

    static void z3(){
        // Реализовать простой калькулятор
        double n;
        double m;
        double znak;
        char op;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number from space: ");
        n = sc.nextDouble();
        m = sc.nextDouble();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        op = sc.next().charAt(0);
        switch(op) {
            case '+': znak = n + m;
                break;
            case '-': znak = n - m;
                break;
            case '*': znak = n * m;
                break;
            case '/': znak = n / m;
                break;
            default:  System.out.printf("Error! Enter correct operator");
                return;
      }
      System.out.print("\nThe result is given as follows:\n");
      System.out.printf(n + " " + op + " " + m + " = " + znak);    

        sc.close();
      
    }
    static String getType(Object o) {
        return o.getClass().getSimpleName() ;

    }


}
