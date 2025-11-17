import java.util.Scanner;

public class Task {
 public static void main(String[] args) {
      student ishuv = new student();
      System.out.println(ishuv.tostring());
 }
}

public class task8 {
    public static void main(String[] args) {
        System.out.println((double)7%3);
    }
}


publu class task10 {
    public static void main(String[] args) {
        double celcious = 37.0;

        double fahrenheit = (celcious * 9/5) + 32;
        System.out.println(fahrenheit);
    }
}

public class sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }
}
public class student{
    
        int marks = 85;
        int name = "John Doe";

        public string tostring() {
            return "name: " + name + ", marks: " + marks;
        }
        
        public student() {
            System.out.println(name + " is studying.");
        }
    }
