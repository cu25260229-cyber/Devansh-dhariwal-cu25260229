1. Display name, age, and college name

public class Main {
    public static void main(String[] args) {
        String name = "Abhishek Rathi";
        int age = 20;
        String college = "COER University";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + college);
    }
}



Output
Name: Abhishek Rathi
Age: 20
College: COER University


2. Arithmetic operations on two integers

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
    }
}



Output
Input: 10 3
Addition: 13
Subtraction: 7
Multiplication: 30
Division: 3
Modulus: 1


3. Check even or odd

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}



Output
Input: 7
Odd


4. Demonstrate relational operators

public class Main {
    public static void main(String[] args) {
        int a = 10, b = 5;

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a >= b);
        System.out.println(a <= b);
    }
}



Output
true
false
false
true
true
false


5. Explicit type casting from float to integer

public class Main {
    public static void main(String[] args) {
        float n = 25.75f;
        int x = (int) n;

        System.out.println("Original: " + n);
        System.out.println("Integer: " + x);
    }
}



Output
Original: 25.75
Integer: 25


6. Print ASCII value of a character

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        System.out.println("ASCII value: " + (int) ch);
    }
}



Output
Input: A
ASCII value: 65


7. Divisible by both 3 and 5

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 3 == 0 && n % 5 == 0)
            System.out.println("Divisible by both");
        else
            System.out.println("Not divisible by both");
    }
}



Output
Input: 15
Divisible by both


8. Check vowel or consonant

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = Character.toLowerCase(sc.next().charAt(0));

        if ("aeiou".indexOf(ch) != -1)
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }
}



Output
Input: e
Vowel


9. Total, percentage, and pass/fail
Passing criteria: at least 40% in each subject.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int total = a + b + c;
        double per = total / 3.0;

        System.out.println("Total: " + total);
        System.out.println("Percentage: " + per);

        if (a >= 40 && b >= 40 && c >= 40)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}



Output
Input: 70 80 60
Total: 210
Percentage: 70.0
Pass


10. Greatest of two numbers

public class Main {
    public static void main(String[] args) {
        int a = 25, b = 40;

        if (a > b)
            System.out.println(a + " is greatest");
        else if (b > a)
            System.out.println(b + " is greatest");
        else
            System.out.println("Both are equal");
    }
}



Output
40 is greatest



11. Largest of three numbers using nested if-else

public class Main {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;

        if (a > b) {
            if (a > c)
                System.out.println(a);
            else
                System.out.println(c);
        } else {
            if (b > c)
                System.out.println(b);
            else
                System.out.println(c);
        }
    }
}



Output
25


12. Check leap year

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 400 == 0 ||
            (year % 4 == 0 && year % 100 != 0))
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }
}



Output
Input: 2024
Leap Year


13. Positive, negative, or zero

public class Main {
    public static void main(String[] args) {
        int n = -5;

        if (n > 0)
            System.out.println("Positive");
        else if (n < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }
}



Output
Negative


14. Character classification

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (Character.isDigit(ch))
            System.out.println("Digit");
        else if (Character.isUpperCase(ch))
            System.out.println("Uppercase");
        else if (Character.isLowerCase(ch))
            System.out.println("Lowercase");
        else
            System.out.println("Special Character");
    }
}



Output
Input: A
Uppercase


15. Check Armstrong number (three digits)

public class Main {
    public static void main(String[] args) {
        int n = 153, t = n, sum = 0;

        while (t > 0) {
            int d = t % 10;
            sum += d * d * d;
            t /= 10;
        }

        if (sum == n)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong");
    }
}



Output
Armstrong Number


16. Calculate tax using income slabs
This uses the listed slabs as a single rate applied to the entire salary.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble(), tax;

        if (salary <= 250000)
            tax = 0;
        else if (salary <= 500000)
            tax = salary * 0.05;
        else if (salary <= 1000000)
            tax = salary * 0.20;
        else
            tax = salary * 0.30;

        System.out.println("Tax: " + tax);
    }
}



Output
Input: 400000
Tax: 20000.0


17. Check palindrome integer

public class Main {
    public static void main(String[] args) {
        int n = 121, t = n, rev = 0;

        while (t > 0) {
            rev = rev * 10 + t % 10;
            t /= 10;
        }

        if (n == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}



Output
Palindrome


18. Check prime number

public class Main {
    public static void main(String[] args) {
        int n = 7, count = 0;

        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                count++;

        if (n > 1 && count == 2)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}



Output
Prime


19. Perform operation using an operator character

public class Main {
    public static void main(String[] args) {
        int a = 10, b = 5;
        char op = '*';

        if (op == '+')
            System.out.println(a + b);
        else if (op == '-')
            System.out.println(a - b);
        else if (op == '*')
            System.out.println(a * b);
        else if (op == '/' && b != 0)
            System.out.println(a / b);
        else
            System.out.println("Invalid operator");
    }
}



Output
50


20. Marriage eligibility by age and gender

public class Main {
    public static void main(String[] args) {
        int age = 22;
        char gender = 'M';

        if (gender == 'M') {
            if (age >= 21)
                System.out.println("Eligible");
            else
                System.out.println("Not Eligible");
        } else if (gender == 'F') {
            if (age >= 18)
                System.out.println("Eligible");
            else
                System.out.println("Not Eligible");
        } else {
            System.out.println("Invalid Gender");
        }
    }
}



Output
Eligible



21. Check whether three angles form a valid triangle

public class Main {
    public static void main(String[] args) {
        int a = 60, b = 60, c = 60;

        if (a > 0 && b > 0 && c > 0 &&
            a + b + c == 180)
            System.out.println("Valid Triangle");
        else
            System.out.println("Invalid Triangle");
    }
}



Output
Valid Triangle


22. Check whether a rectangle is a square

public class Main {
    public static void main(String[] args) {
        int length = 10, breadth = 10;

        if (length == breadth)
            System.out.println("Square");
        else
            System.out.println("Rectangle");
    }
}



Output
Square


23. Convert Celsius to Fahrenheit

public class Main {
    public static void main(String[] args) {
        double c = 37;
        double f = (double) (c * 9 / 5) + 32;

        System.out.println("Fahrenheit: " + f);
    }
}



Output
Fahrenheit: 98.6


24. Check perfect number

public class Main {
    public static void main(String[] args) {
        int n = 28, sum = 0;

        for (int i = 1; i < n; i++)
            if (n % i == 0)
                sum += i;

        if (n > 0 && sum == n)
            System.out.println("Perfect Number");
        else
            System.out.println("Not Perfect");
    }
}



Output
Perfect Number


25. Perform logical operation using an operator
Here, non-zero integers are treated as true and zero as false.

public class Main {
    public static void main(String[] args) {
        int a = 5, b = 0;
        char op = '&';

        if (op == '&')
            System.out.println(a != 0 && b != 0);
        else if (op == '|')
            System.out.println(a != 0 || b != 0);
        else
            System.out.println("Invalid Operator");
    }
}



Output
false


26. Check whether the first and last digits of a five-digit number are the same

public class Main {
    public static void main(String[] args) {
        int n = 12341;
        int first = n / 10000;
        int last = n % 10;

        if (first == last)
            System.out.println("Same Digits");
        else
            System.out.println("Different Digits");
    }
}



Output
Same Digits


27. Calculate profit or loss

public class Main {
    public static void main(String[] args) {
        int cp = 500, sp = 650;

        if (sp > cp)
            System.out.println("Profit: " + (sp - cp));
        else if (cp > sp)
            System.out.println("Loss: " + (cp - sp));
        else
            System.out.println("No Profit No Loss");
    }
}



Output
Profit: 150


28. Count the number of digits

public class Main {
    public static void main(String[] args) {
        int n = 12345, count = 0;
        n = Math.abs(n);

        if (n == 0)
            count = 1;
        else {
            while (n > 0) {
                count++;
                n /= 10;
            }
        }

        System.out.println("Digits: " + count);
    }
}



Output
Digits: 5


29. Classify height

public class Main {
    public static void main(String[] args) {
        int height = 165;

        if (height < 150)
            System.out.println("Short");
        else if (height <= 170)
            System.out.println("Average");
        else
            System.out.println("Tall");
    }
}



Output
Average


30. Simple calculator using if-else

public class Main {
    public static void main(String[] args) {
        double a = 20, b = 5;
        char op = '/';

        if (op == '+')
            System.out.println(a + b);
        else if (op == '-')
            System.out.println(a - b);
        else if (op == '*')
            System.out.println(a * b);
        else if (op == '/' && b != 0)
            System.out.println(a / b);
        else
            System.out.println("Invalid operation");
    }
}



Output
4.0