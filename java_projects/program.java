package java_projects;
import java.util.Scanner;


public class program {
    public static void main(String[] args) {
        // System.out.println("'hello wowrld'"); //sysout 
        // // >java program.java
        // float f = 123.45f;
        // double d = 123.45;
        // System.out.println(f);
        // System.out.println(d);



        // short age = 10;
        // int salary = 123456;
        // System.out.println(age);   //10
        // System.out.println(salary);//123456

        // char ch = '1';
        // System.out.println(Character.isDigit(ch));   //true
        // ch = 'a';
       
        // System.out.println(Character.isDigit(ch));  //false
        // System.out.println(ch);  //a
        //  ch = 123;
        // System.out.println(ch);  //{

        // int a = 13;
        // double b = a;
        // System.out.println(b);  //13

        // boolean k = true && false;
        // System.out.println(k); //false
        // boolean l = true ^ false;
        // System.out.println(l);//true
        // boolean m = true ^ true;
        // System.out.println(m); //false

        // String s = "Hello World";
        // System.out.println(s);//Hello world

        // System.out.println(getType(s));//string


        // var v = 123;
        // System.out.println(v);

        // System.out.println(getType(v));//Integer

        // int i = 123_403_343;
        // System.out.println(i);//123403343
        // System.out.println(Integer.MAX_VALUE);//2147483647

        // Операции Java
        // ● Присваивание: =
        // ● Арифметические: *, /, +, -, %, ++, --
        // ● Операции сравнения: <, >, ==, !=, >=, <=
        // ● Логические операции: ||, &&, ^, !
        // ● Побитовые операции <<, >>, &, |, ^

        // int a = 5;
        // int b = 2;
        // // (5)101
        // // (2)010
        // System.out.println(a | b);
        // // (7)111
        // System.out.println(a & b);
        // // (0)000
        // System.out.println(a ^ b);
        // // (7)

        // boolean a = true;
        // boolean b = true;
        // System.out.println(a & b); //true

        // String s = "qwer"; //4(len), index(0 ... 3)
        // boolean b = s.length() >= 5 && s.charAt(4) == '1';
        // System.out.println(b); //false
        // 
        // String s = "qwwe1"; //5(len), index(0 ... 4)
        // boolean b = s.length() >= 5 && s.charAt(4) == '1';
        // System.out.println(b); //true
        

        // =====массивы=======
        // int [] arr = new int[10];
        // System.out.println(arr.length); //10
        // System.out.println(arr[3]);// 0
        // arr[3] = 13;
        // System.out.println(arr[3]);//13


        // arr = new int[]{1, 2, 3, 4, 5};
        // System.out.println(arr.length); //5


        // int[] arr[] = new int[3][5];
        // for(int []line : arr){
        //     for( int item : line) {
        //         System.out.printf("%d", item);
        //     }
        //     System.out.println();

        // int[][] arr = new int[3][5];
        //  for (int i = 0; i < arr.length; i++) {
        //      for (int j = 0; j < arr[i].length; j++) {
        //             System.out.printf("%d ", arr[i][j]);
        //     }
        //      System.out.println();

        // ===ЯВНОЕ И НЕЯВНОЕ ПРЕОБРАЗОВАНИЕ

        // int i = 123; double d = i;
        // System.out.println(i); // 123
        // System.out.println(d); // 123.0
        // d = 3.1415; i = (int)d;
        // System.out.println(d); // 3.1415
        // System.out.println(i); // 3
        // d = 3.9415; i = (int)d;
        // System.out.println(d); // 3.9415
        // System.out.println(i); // 3
        // byte b = Byte.parseByte("123");
        // System.out.println(b); // 123
        // b = Byte.parseByte("1234");
        // System.out.println(b); // NumberFormatException: Value out of range


        //====ВВОД ДАННЫХ===
        // import java.util.Scanner;
        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("name: ");
        // String name = iScanner.nextLine();
        // System.out.printf("Привет, %s!", name);
        // iScanner.close(); 

        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("int a: ");
        // int x = iScanner.nextInt();
        // System.out.printf("double a: ");
        // double y = iScanner.nextDouble();
        // System.out.printf("%d + %f = %f", x, y, x + y);
        // iScanner.close();

        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("int a: ");
        // boolean flag = iScanner.hasNextInt();
        // System.out.println(flag);
        // int i = iScanner.nextInt();
        // System.out.println(i);
        // iScanner.close();

        // int a = 1, b = 2;
        // int c = a + b;
        // String res = a + " + " + b + " = " + c;
        // System.out.println(res);

        // "/n" - перехож на новую строку

        // int a = 1, b = 2;
        // int c = a + b;
        // String res = String.format("%d + %d = %d \n", a, b, c);
        // System.out.printf("%d + %d = %d \n", a, b, c);
        // System.out.println(res);

//         %d: целочисленных значений
        // %x: для вывода шестнадцатеричных чисел
        // %f: для вывода чисел с плавающей точкой
        // %e: для вывода чисел в экспоненциальной форме,
        // например, 3.1415e+01
        // %c: для вывода одиночного символа
        // %s: для вывода строковых значений



        // float pi = 3.1415f;
        // System.out.printf("%f\n", pi); // 3,141500
        // System.out.printf("%.2f\n", pi); // 3,14
        // System.out.printf("%.3f\n", pi); // 3,141
        // System.out.printf("%e\n", pi); // 3,141500e+00
        // System.out.printf("%.2e\n", pi); // 3,14e+00
        // System.out.printf("%.3e\n", pi); // 3,141e+00



        // static void sayHi() {
        // System.out.println("hi!");
        // }
        // static int sum(int a, int b) {
        // return a+b;
        // }
        // static double factor(int n) {
        // if(n==1)return 1;
        // return n * factor(n-1);
        // }
        // public static void main(String[] args) {
        // sayHi(); // hi!
        // System.out.println(sum(1, 3)); // 4
        // System.out.println(factor(5)); // 120.0

        // int a = 1;
        // int b = 2;
        // int c;
        // if (a > b) {
        // c = a;
        // } else {
        // c = b;
        // }
        // System.out.println(c);

        //  int a = 1;
        //  int b = 2;
        //  int c = 0;
        //  if (a > b) c = a;
        //  if (b > a) c = b;
        //  System.out.println(c);

        // int a = 1;
        // int b = 2;
        // int min = a < b ? a : b;
        // System.out.println(min);


        // ===Оператор выбора===
        // importjava.util.Scanner;
        // public class Program {
        //  public static void main(String[] args) {
        //  int mounth = value;
        //  String text = "";
        //  switch (mounth) {
        //  case 1:
        //  text = "Autumn";
        //  break;
        // ...
        //  default:
        //  text = "mistake";
        //  break;
        //  }
        //  System.out.println(text);
        //  iScanner.close();


        








        

    }
    static String getType(Object o) {
        return o.getClass().getSimpleName() ;

    }
}
