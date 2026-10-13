Q1. Student class with instance and class variables

class Student {
    String name;
    int age;
    static int count = 0;

    Student(String n, int a) {
        name = n;
        age = a;
        count++;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        String n = "Abhishek";
        int a = 20;
        Student s = new Student(n, a);
        s.display();
        System.out.println("Count: " + count);
    }
}



Output
Abhishek 20
Count: 1


Q2. Rectangle area using local variables

class Rectangle {
    int length = 10, breadth = 5;
    static String shapeName = "Rectangle";

    void area() {
        int result = length * breadth;
        System.out.println(shapeName + " Area: " + result);
    }

    public static void main(String[] args) {
        new Rectangle().area();
    }
}



Output
Rectangle Area: 50


Q3. Circle area and circumference

class Circle {
    double radius = 5;
    static final double PI = 3.14;

    void display() {
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }

    public static void main(String[] args) {
        new Circle().display();
    }
}



Output
Area: 78.5
Circumference: 31.400000000000002


Q4. Employee details

class Employee {
    int empId = 101;
    double salary = 25000;
    static String companyName = "ABC Ltd";

    void display() {
        int id = empId;
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Company: " + companyName);
    }

    public static void main(String[] args) {
        new Employee().display();
    }
}



Output
ID: 101
Salary: 25000.0
Company: ABC Ltd


Q5. Book details

class Book {
    String title = "Java Basics", author = "James";
    double price = 350;
    static String publisher = "Tech Books";

    void display() {
        String t = title;
        System.out.println(t + " " + author);
        System.out.println("Price: " + price);
        System.out.println("Publisher: " + publisher);
    }

    public static void main(String[] args) {
        new Book().display();
    }
}



Output
Java Basics James
Price: 350.0
Publisher: Tech Books


Q6. Car details

class Car {
    String brand = "Honda";
    double mileage = 18.5;
    static int wheels = 4;

    void display() {
        String b = brand;
        System.out.println("Brand: " + b);
        System.out.println("Mileage: " + mileage);
        System.out.println("Wheels: " + wheels);
    }

    public static void main(String[] args) {
        new Car().display();
    }
}



Output
Brand: Honda
Mileage: 18.5
Wheels: 4


Q7. Bank account and deposit method

class BankAccount {
    int accountNumber = 12345;
    double balance = 1000;
    static String bankName = "SBI";

    void deposit(double amount) {
        double newBalance = balance + amount;
        balance = newBalance;
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        System.out.println("Account: " + b.accountNumber);
        b.deposit(500);
    }
}



Output
Account: 12345
Balance: 1500.0


Q8. Pen details

class Pen {
    String color = "Blue", type = "Ballpoint";
    static String manufacturer = "Cello";

    void display() {
        String c = color;
        System.out.println("Color: " + c);
        System.out.println("Type: " + type);
        System.out.println("Manufacturer: " + manufacturer);
    }

    public static void main(String[] args) {
        new Pen().display();
    }
}



Output
Color: Blue
Type: Ballpoint
Manufacturer: Cello


Q9. Laptop details

class Laptop {
    String brand = "HP";
    int RAM = 8;
    static String os = "Windows";

    void display() {
        int r = RAM;
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + r + " GB");
        System.out.println("OS: " + os);
    }

    public static void main(String[] args) {
        new Laptop().display();
    }
}



Output
Brand: HP
RAM: 8 GB
OS: Windows


Q10. Movie details

class Movie {
    String name = "Dangal", genre = "Drama";
    double rating = 8.5;
    static String industry = "Bollywood";

    void display() {
        String n = name;
        System.out.println("Name: " + n);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
        System.out.println("Industry: " + industry);
    }

    public static void main(String[] args) {
        new Movie().display();
    }
}



Output
Name: Dangal
Genre: Drama
Rating: 8.5
Industry: Bollywood



Intermediate Level (Q11–Q20)
Q11. Calculator with operation counter

class Calculator {
    static int operationsCount = 0;

    int add(int a, int b) {
        operationsCount++;
        return a + b;
    }

    int subtract(int a, int b) {
        operationsCount++;
        return a - b;
    }

    int multiply(int a, int b) {
        operationsCount++;
        return a * b;
    }

    int divide(int a, int b) {
        operationsCount++;
        return a / b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(10, 5));
        System.out.println(c.subtract(10, 5));
        System.out.println(c.multiply(10, 5));
        System.out.println(c.divide(10, 5));
        System.out.println("Operations: " + operationsCount);
    }
}



Output
15
5
50
2
Operations: 4


Q12. Calculate average marks

class StudentMarks {
    int marks1 = 80, marks2 = 70, marks3 = 90;
    static String universityName = "COER University";

    void display() {
        double average = (marks1 + marks2 + marks3) / 3.0;
        System.out.println(universityName);
        System.out.println("Average: " + average);
    }

    public static void main(String[] args) {
        new StudentMarks().display();
    }
}



Output
COER University
Average: 80.0


Q13. Convert Celsius to Fahrenheit and Kelvin

class Temperature {
    double celsius = 25;
    static String scale = "Celsius";

    void convert() {
        double f = celsius * 9 / 5 + 32;
        double k = celsius + 273.15;
        System.out.println("Scale: " + scale);
        System.out.println("Fahrenheit: " + f);
        System.out.println("Kelvin: " + k);
    }

    public static void main(String[] args) {
        new Temperature().convert();
    }
}



Output
Scale: Celsius
Fahrenheit: 77.0
Kelvin: 298.15


Q14. Check voting eligibility

class Person {
    String name = "Rahul";
    int age = 20;
    static String country = "India";

    void check() {
        boolean eligible = age >= 18;
        System.out.println(name + " " + country);
        System.out.println(eligible ? "Eligible" : "Not Eligible");
    }

    public static void main(String[] args) {
        new Person().check();
    }
}



Output
Rahul India
Eligible


Q15. Calculate simple interest

class SimpleInterest {
    double principal = 10000, rate = 5, time = 2;
    static String bank = "SBI";

    void calculate() {
        double interest = principal * rate * time / 100;
        System.out.println("Bank: " + bank);
        System.out.println("Interest: " + interest);
    }

    public static void main(String[] args) {
        new SimpleInterest().calculate();
    }
}



Output
Bank: SBI
Interest: 1000.0


Q16. Check triangle validity and type

class Triangle {
    int a = 5, b = 5, c = 5;
    static String type = "Scalene/Isosceles/Equilateral";

    void check() {
        boolean valid = a+b>c && a+c>b && b+c>a;
        if (!valid)
            System.out.println("Invalid Triangle");
        else if (a == b && b == c)
            System.out.println("Equilateral");
        else if (a == b || b == c || a == c)
            System.out.println("Isosceles");
        else
            System.out.println("Scalene");
    }

    public static void main(String[] args) {
        new Triangle().check();
    }
}



Output
Equilateral


Q17. Assign grade using marks

class StudentGrade {
    String name = "Aman";
    int marks = 85;
    static int passingMarks = 40;

    void display() {
        String grade;
        if (marks < passingMarks) grade = "Fail";
        else if (marks >= 90) grade = "A+";
        else if (marks >= 80) grade = "A";
        else if (marks >= 60) grade = "B";
        else grade = "C";

        System.out.println(name + ": " + grade);
    }

    public static void main(String[] args) {
        new StudentGrade().display();
    }
}



Output
Aman: A


Q18. Calculate electricity bill
Assumption: ₹5 per unit plus the fixed charge.

class ElectricBill {
    int units = 100;
    static double fixedCharge = 50;

    void calculate() {
        double total = units * 5 + fixedCharge;
        System.out.println("Total Bill: " + total);
    }

    public static void main(String[] args) {
        new ElectricBill().calculate();
    }
}



Output
Total Bill: 550.0


Q19. Calculate product price after discount

class Product {
    int id = 101;
    String name = "Keyboard";
    double price = 1000;
    static double discountRate = 10;

    void calculate() {
        double finalPrice = price - price * discountRate / 100;
        System.out.println(name + " " + id);
        System.out.println("Final Price: " + finalPrice);
    }

    public static void main(String[] args) {
        new Product().calculate();
    }
}



Output
Keyboard 101
Final Price: 900.0


Q20. Withdraw money without exceeding balance

class BankAccount {
    double balance = 5000;
    static String bankCode = "SBI01";

    void withdraw(double amount) {
        double remaining = balance - amount;

        if (amount > 0 && remaining >= 0) {
            balance = remaining;
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.withdraw(2000);
    }
}



Output
Balance: 3000.0



Advanced Level (Q21–Q30)
Q21. Check palindrome with counter

class Palindrome {
    static int countChecks = 0;

    void check(int n) {
        countChecks++;
        int original = n, rev = 0;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        System.out.println(original == rev ? "Palindrome" : "Not Palindrome");
        System.out.println("Checks: " + countChecks);
    }

    public static void main(String[] args) {
        new Palindrome().check(121);
    }
}



Output
Palindrome
Checks: 1


Q22. Check Armstrong number with counter

class Armstrong {
    static int totalChecks = 0;

    void check(int n) {
        totalChecks++;
        int original = n, sum = 0;

        while (n > 0) {
            int d = n % 10;
            sum += d * d * d;
            n /= 10;
        }

        System.out.println(original == sum ? "Armstrong" : "Not Armstrong");
        System.out.println("Checks: " + totalChecks);
    }

    public static void main(String[] args) {
        new Armstrong().check(153);
    }
}



Output
Armstrong
Checks: 1


Q23. Check prime number with counter

class PrimeChecker {
    static int totalPrimeChecks = 0;

    void check(int n) {
        totalPrimeChecks++;
        boolean prime = n > 1;

        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) prime = false;

        System.out.println(prime ? "Prime" : "Not Prime");
        System.out.println("Checks: " + totalPrimeChecks);
    }

    public static void main(String[] args) {
        new PrimeChecker().check(7);
    }
}



Output
Prime
Checks: 1


Q24. Display first N Fibonacci terms

class Fibonacci {
    static int seriesCount = 0;

    void display(int n) {
        seriesCount++;
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println("\nSeries Count: " + seriesCount);
    }

    public static void main(String[] args) {
        new Fibonacci().display(7);
    }
}



Output
0 1 1 2 3 5 8
Series Count: 1


Q25. Calculate factorial with counter

class Factorial {
    static int totalCalls = 0;

    long calculate(int n) {
        totalCalls++;
        long fact = 1;

        for (int i = 1; i <= n; i++)
            fact *= i;

        return fact;
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println("Factorial: " + f.calculate(5));
        System.out.println("Calls: " + totalCalls);
    }
}



Output
Factorial: 120
Calls: 1


Q26. Add and subtract two 2 × 2 matrices

class Matrix {
    static String matrixType = "2x2";

    public static void main(String[] args) {
        int[][] a = {{1,2},{3,4}};
        int[][] b = {{5,6},{7,8}};

        System.out.println("Addition:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print((a[i][j] + b[i][j]) + " ");
            System.out.println();
        }

        System.out.println("Subtraction:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print((a[i][j] - b[i][j]) + " ");
            System.out.println();
        }
    }
}



Output
Addition:
6 8
10 12
Subtraction:
-4 -4
-4 -4


Q27. Reverse a string with counter

class StringReverse {
    static int totalReversals = 0;

    void reverse(String s) {
        totalReversals++;
        String result = "";

        for (int i = s.length()-1; i >= 0; i--)
            result += s.charAt(i);

        System.out.println("Reverse: " + result);
        System.out.println("Reversals: " + totalReversals);
    }

    public static void main(String[] args) {
        new StringReverse().reverse("Java");
    }
}



Output
Reverse: avaJ
Reversals: 1


Q28. Count words in a sentence

class WordCounter {
    static String language = "English";

    void count(String sentence) {
        String s = sentence.trim();
        int words = s.isEmpty() ? 0 : s.split("\\s+").length;

        System.out.println("Language: " + language);
        System.out.println("Words: " + words);
    }

    public static void main(String[] args) {
        new WordCounter().count("Java is easy to learn");
    }
}



Output
Language: English
Words: 5


Q29. Compare salaries of two employees

class Employee {
    String name;
    double salary;
    static String organization = "ABC Ltd";

    Employee(String n, double s) {
        name = n;
        salary = s;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Aman", 30000);
        Employee e2 = new Employee("Rahul", 25000);

        System.out.println("Organization: " + organization);

        if (e1.salary > e2.salary)
            System.out.println(e1.name + " has higher salary");
        else if (e2.salary > e1.salary)
            System.out.println(e2.name + " has higher salary");
        else
            System.out.println("Salaries are equal");
    }
}



Output
Organization: ABC Ltd
Aman has higher salary


Q30. Library issue and return operations

class Library {
    int booksAvailable = 10;
    static String libraryName = "COER Library";

    void issue() {
        if (booksAvailable > 0) {
            booksAvailable--;
            System.out.println("Book Issued");
        } else {
            System.out.println("No Books Available");
        }
    }

    void returnBook() {
        booksAvailable++;
        System.out.println("Book Returned");
    }

    public static void main(String[] args) {
        Library l = new Library();
        System.out.println(libraryName);
        l.issue();
        l.returnBook();
        System.out.println("Available: " + l.booksAvailable);
    }
}



Output
COER Library
Book Issued
Book Returned
Available: 10