Q1. Area of triangle using Heron's formula

public class Main {
    public static void main(String[] args) {
        double a = 3, b = 4, c = 5;
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));

        System.out.println("Area: " + area);
    }
}



Output
Area: 6.0


Q2. Calculate compound interest

public class Main {
    public static void main(String[] args) {
        double p = 10000, r = 10, t = 2;
        double amount = p * Math.pow(1 + r/100, t);
        double ci = amount - p;

        System.out.println("Compound Interest: " + ci);
    }
}



Output
Compound Interest: 2100.0


Q3. Distance between two points

public class Main {
    public static void main(String[] args) {
        double x1 = 1, y1 = 2, x2 = 4, y2 = 6;
        double d = Math.sqrt(Math.pow(x2-x1, 2)
                           + Math.pow(y2-y1, 2));

        System.out.println("Distance: " + d);
    }
}



Output
Distance: 5.0


Q4. Prefix and postfix increment for store visitors

public class Main {
    public static void main(String[] args) {
        int visitors = 10;

        System.out.println("Entering: " + (++visitors));
        System.out.println("Leaving: " + (visitors--));
        System.out.println("Remaining: " + visitors);
    }
}



Output
Entering: 11
Leaving: 11
Remaining: 10


Q5. Find negative value using unary operator

public class Main {
    public static void main(String[] args) {
        int n = 25;
        System.out.println("Negative: " + (-n));
    }
}



Output
Negative: -25


Q6. Reduce a number by half using /=

public class Main {
    public static void main(String[] args) {
        double n = 16;
        int steps = 0;

        while (n >= 1) {
            n /= 2;
            steps++;
        }

        System.out.println("Steps: " + steps);
    }
}



Output
Steps: 5


Q7. Total rainfall for seven days using +=

public class Main {
    public static void main(String[] args) {
        int[] rain = {10, 20, 15, 5, 12, 8, 10};
        int total = 0;

        for (int r : rain)
            total += r;

        System.out.println("Total Rainfall: " + total);
    }
}



Output
Total Rainfall: 80


Q8. Check valid triangle using angles

public class Main {
    public static void main(String[] args) {
        int a = 60, b = 60, c = 60;

        if (a > 0 && b > 0 && c > 0 && a+b+c == 180)
            System.out.println("Valid Triangle");
        else
            System.out.println("Invalid Triangle");
    }
}



Output
Valid Triangle


Q9. Compare two strings without built-in compare functions

public class Main {
    public static void main(String[] args) {
        String a = "Apple", b = "Banana";
        int i = 0;

        while (i < a.length() && i < b.length()
               && a.charAt(i) == b.charAt(i))
            i++;

        if (i == a.length() && i == b.length())
            System.out.println("Equal");
        else if (i == a.length())
            System.out.println("First is smaller");
        else if (i == b.length())
            System.out.println("Second is smaller");
        else if (a.charAt(i) < b.charAt(i))
            System.out.println("First is smaller");
        else
            System.out.println("Second is smaller");
    }
}



Output
First is smaller


Q10. Check leap year and given range

public class Main {
    public static void main(String[] args) {
        int year = 2024, start = 2000, end = 2030;

        if ((year % 400 == 0 ||
            (year % 4 == 0 && year % 100 != 0))
            && year >= start && year <= end)
            System.out.println("Leap year within range");
        else
            System.out.println("Condition not satisfied");
    }
}



Output
Leap year within range


Q11. Check student pass using logical operators

public class Main {
    public static void main(String[] args) {
        int theory = 45, practical = 55, overall = 50;

        if ((theory >= 40 && practical >= 50)
                || overall >= 50)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}



Output
Pass


Q12. Smallest of four numbers using ternary operator

public class Main {
    public static void main(String[] args) {
        int a = 12, b = 5, c = 18, d = 9;
        int min = (a < b ? a : b) < (c < d ? c : d)
                ? (a < b ? a : b) : (c < d ? c : d);

        System.out.println("Smallest: " + min);
    }
}



Output
Smallest: 5


Q13. Identify character using ternary operator

public class Main {
    public static void main(String[] args) {
        char ch = 'A';
        String result = "aeiouAEIOU".indexOf(ch) >= 0
                ? "Vowel" : Character.isLetter(ch)
                ? "Consonant" : Character.isDigit(ch)
                ? "Digit" : "Special Symbol";

        System.out.println(result);
    }
}



Output
Vowel


Q14. Swap two integers using XOR

public class Main {
    public static void main(String[] args) {
        int a = 10, b = 20;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}



Output
a = 20
b = 10


Q15. Count set bits using bitwise operators

public class Main {
    public static void main(String[] args) {
        int n = 13, count = 0;

        while (n != 0) {
            count += n & 1;
            n >>>= 1;
        }

        System.out.println("Set bits: " + count);
    }
}



Output
Set bits: 3


Q16. Multiplication and division using shift operators

public class Main {
    public static void main(String[] args) {
        int n = 16;

        System.out.println("Multiply by 4: " + (n << 2));
        System.out.println("Divide by 4: " + (n >> 2));
    }
}



Output
Multiply by 4: 64
Divide by 4: 4


Q17. Rotate bits left by two positions

public class Main {
    public static void main(String[] args) {
        int n = 8;
        int result = Integer.rotateLeft(n, 2);

        System.out.println("Result: " + result);
    }
}



Output
Result: 32


Q18. First 20 Fibonacci terms using for loop

public class Main {
    public static void main(String[] args) {
        int a = 0, b = 1;

        for (int i = 1; i <= 20; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}



Output
0 1 1 2 3 5 8 13 21 34
55 89 144 233 377 610 987 1597 2584 4181


Q19. Armstrong numbers between 1 and 1000

public class Main {
    public static void main(String[] args) {
        for (int n = 1; n <= 1000; n++) {
            int t = n, sum = 0;

            while (t > 0) {
                int d = t % 10;
                sum += d * d * d;
                t /= 10;
            }

            if (sum == n)
                System.out.print(n + " ");
        }
    }
}



Output
1 2 3 4 5 6 7 8 9 153 370 371 407


Q20. Accept password until correct

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;

        do {
            System.out.print("Enter password: ");
            password = sc.nextLine();
        } while (!password.equals("java123"));

        System.out.println("Correct Password");
    }
}



Output
Enter password: abc
Enter password: java123
Correct Password


Q21. Display factors using do-while loop

public class Main {
    public static void main(String[] args) {
        int n = 12, i = 1;

        do {
            if (n % i == 0)
                System.out.print(i + " ");
            i++;
        } while (i <= n);
    }
}



Output
1 2 3 4 6 12


Q22. Reverse digits using while loop

public class Main {
    public static void main(String[] args) {
        int n = 12345, rev = 0;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        System.out.println("Reverse: " + rev);
    }
}



Output
Reverse: 54321


Q23. Check palindrome using while loop

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


Q24. Maximum and minimum using for-each loop

public class Main {
    public static void main(String[] args) {
        int[] a = {12, 5, 30, 8, 20};
        int max = a[0], min = a[0];

        for (int n : a) {
            if (n > max) max = n;
            if (n < min) min = n;
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}



Output
Maximum: 30
Minimum: 5


Q25. Average marks using for-each loop and 2D array

public class Main {
    public static void main(String[] args) {
        int[][] marks = {{80, 70}, {60, 90}};
        int sum = 0, count = 0;

        for (int[] row : marks)
            for (int m : row) {
                sum += m;
                count++;
            }

        System.out.println("Average: " + (sum / (double) count));
    }
}



Output
Average: 75.0


Q26. Weekday or weekend using switch-case

public class Main {
    public static void main(String[] args) {
        int day = 7;

        switch (day) {
            case 1, 7:
                System.out.println("Weekend");
                break;
            case 2, 3, 4, 5, 6:
                System.out.println("Weekday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
}



Output
Weekend


Q27. Grade meaning using switch-case

public class Main {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A': System.out.println("Excellent"); break;
            case 'B': System.out.println("Good"); break;
            case 'C': System.out.println("Average"); break;
            case 'D': System.out.println("Pass"); break;
            case 'E':
            case 'F': System.out.println("Fail"); break;
            default: System.out.println("Invalid Grade");
        }
    }
}



Output
Excellent


Q28. Print 1–50, skipping perfect squares using continue

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            int root = (int) Math.sqrt(i);

            if (root * root == i)
                continue;

            System.out.print(i + " ");
        }
    }
}



Output
2 3 5 6 7 8 10 11 12 13 14 15 17 18 19 20
21 22 23 24 26 27 28 29 30 31 32 33 34 35
37 38 39 40 41 42 43 44 45 46 47 48 50


Q29. Generate random numbers until divisible by 7 and 13

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int n;

        while (true) {
            n = r.nextInt(100) + 1;
            System.out.println(n);

            if (n % 7 == 0 && n % 13 == 0)
                break;
        }

        System.out.println("Found: " + n);
    }
}



Sample output (random output will vary)
15
43
28
91
Found: 91


Q30. Mixed advanced program
Checks power of 4, toggles the third bit, prints a multiplication table while skipping multiples of 6, and stops at a multiple of 48.

public class Main {
    public static void main(String[] args) {
        int n = 16, x = n;

        while (x > 1 && x % 4 == 0)
            x >>= 2;

        boolean power = x == 1;
        System.out.println("Power of 4: " + power);

        int toggled = n ^ (1 << 2);
        System.out.println("Third bit toggled: " + toggled);

        for (int i = 1; i <= 10; i++) {
            int result = n * i;

            if (result % 48 == 0)
                break;
            if (i % 6 == 0)
                continue;

            System.out.println(n + " x " + i + " = " + result);
        }
    }
}



Output
Power of 4: true
Third bit toggled: 20
16 x 1 = 16
16 x 2 = 32