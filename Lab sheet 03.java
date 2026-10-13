Q1. Input and display 5 integers using a 1-D array

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];

        for (int i = 0; i < 5; i++)
            a[i] = sc.nextInt();

        for (int n : a)
            System.out.print(n + " ");
    }
}



Output
Input: 10 20 30 40 50
10 20 30 40 50


Q2. Display 10 integers in reverse order

public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 9; i >= 0; i--)
            System.out.print(a[i] + " ");
    }
}



Output
10 9 8 7 6 5 4 3 2 1


Q3. Sum of all array elements

public class Main {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        int sum = 0;

        for (int n : a)
            sum += n;

        System.out.println("Sum: " + sum);
    }
}



Output
Sum: 150


Q4. Find maximum element in an array

public class Main {
    public static void main(String[] args) {
        int[] a = {12,45,23,67,10};
        int max = a[0];

        for (int n : a)
            if (n > max) max = n;

        System.out.println("Maximum: " + max);
    }
}



Output
Maximum: 67


Q5. Count even and odd numbers

public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int even = 0, odd = 0;

        for (int n : a) {
            if (n % 2 == 0) even++;
            else odd++;
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}



Output
Even: 3
Odd: 3


Q6. Copy elements from one array to another

public class Main {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++)
            b[i] = a[i];

        for (int n : b)
            System.out.print(n + " ");
    }
}



Output
10 20 30 40 50



Part B – 2-D Arrays (Q7–Q13)
Q7. Input and display a 3 × 3 matrix

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                a[i][j] = sc.nextInt();

        for (int[] row : a) {
            for (int n : row)
                System.out.print(n + " ");
            System.out.println();
        }
    }
}



Output
Input: 1 2 3 4 5 6 7 8 9
1 2 3
4 5 6
7 8 9


Q8. Sum of all matrix elements

public class Main {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int sum = 0;

        for (int[] row : a)
            for (int n : row)
                sum += n;

        System.out.println("Sum: " + sum);
    }
}



Output
Sum: 45


Q9. Sum of each row

public class Main {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};

        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int n : a[i])
                sum += n;
            System.out.println("Row " + (i+1) + ": " + sum);
        }
    }
}



Output
Row 1: 6
Row 2: 15
Row 3: 24


Q10. Sum of each column

public class Main {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};

        for (int j = 0; j < 3; j++) {
            int sum = 0;
            for (int i = 0; i < 3; i++)
                sum += a[i][j];
            System.out.println("Column " + (j+1) + ": " + sum);
        }
    }
}



Output
Column 1: 12
Column 2: 15
Column 3: 18


Q11. Transpose a matrix

public class Main {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(a[j][i] + " ");
            System.out.println();
        }
    }
}



Output
1 4 7
2 5 8
3 6 9


Q12. Add two matrices

public class Main {
    public static void main(String[] args) {
        int[][] a = {{1,2},{3,4}};
        int[][] b = {{5,6},{7,8}};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print((a[i][j] + b[i][j]) + " ");
            System.out.println();
        }
    }
}



Output
6 8
10 12


Q13. Multiply two 3 × 3 matrices

public class Main {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] b = {{1,0,0},{0,1,0},{0,0,1}};
        int[][] c = new int[3][3];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                for (int k = 0; k < 3; k++)
                    c[i][j] += a[i][k] * b[k][j];

        for (int[] row : c) {
            for (int n : row)
                System.out.print(n + " ");
            System.out.println();
        }
    }
}



Output
1 2 3
4 5 6
7 8 9



Part C – 3-D Arrays (Q14–Q18)
Q14. Input and display a 2 × 2 × 2 array

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] a = new int[2][2][2];

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    a[i][j][k] = sc.nextInt();

        for (int[][] x : a)
            for (int[] y : x) {
                for (int n : y)
                    System.out.print(n + " ");
                System.out.println();
            }
    }
}



Output
Input: 1 2 3 4 5 6 7 8
1 2
3 4
5 6
7 8


Q15. Sum of all 3-D array elements

public class Main {
    public static void main(String[] args) {
        int[][][] a = {{{1,2},{3,4}},{{5,6},{7,8}}};
        int sum = 0;

        for (int[][] x : a)
            for (int[] y : x)
                for (int n : y)
                    sum += n;

        System.out.println("Sum: " + sum);
    }
}



Output
Sum: 36


Q16. Count positive and negative numbers

public class Main {
    public static void main(String[] args) {
        int[][][] a = {{{1,-2},{3,-4}},{{5,-6},{0,8}}};
        int pos = 0, neg = 0;

        for (int[][] x : a)
            for (int[] y : x)
                for (int n : y) {
                    if (n > 0) pos++;
                    else if (n < 0) neg++;
                }

        System.out.println("Positive: " + pos);
        System.out.println("Negative: " + neg);
    }
}



Output
Positive: 4
Negative: 3


Q17. Maximum element in a 3-D array

public class Main {
    public static void main(String[] args) {
        int[][][] a = {{{10,20},{30,40}},{{50,60},{70,80}}};
        int max = a[0][0][0];

        for (int[][] x : a)
            for (int[] y : x)
                for (int n : y)
                    if (n > max) max = n;

        System.out.println("Maximum: " + max);
    }
}



Output
Maximum: 80


Q18. Search for an element in a 3-D array

public class Main {
    public static void main(String[] args) {
        int[][][] a = {{{1,2},{3,4}},{{5,6},{7,8}}};
        int key = 6;
        boolean found = false;

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    if (a[i][j][k] == key) {
                        System.out.println("Position: "
                                + i + "," + j + "," + k);
                        found = true;
                    }

        if (!found) System.out.println("Not Found");
    }
}



Output
Position: 1,0,1



Part D – Jagged Arrays (Q19–Q20)
Q19. Create and display a jagged array

public class Main {
    public static void main(String[] args) {
        int[][] a = {{1,2},{3,4,5},{6,7,8,9}};

        for (int[] row : a) {
            for (int n : row)
                System.out.print(n + " ");
            System.out.println();
        }
    }
}



Output
1 2
3 4 5
6 7 8 9


Q20. Store marks for students with different subjects

public class Main {
    public static void main(String[] args) {
        int[][] marks = {{80,75},{90,85,70},{60,65,70,75}};

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Student " + (i+1) + ": ");
            for (int m : marks[i])
                System.out.print(m + " ");
            System.out.println();
        }
    }
}



Output
Student 1: 80 75
Student 2: 90 85 70
Student 3: 60 65 70 75



Part E – Additional Questions (Q21–Q30)
Q21. Rotate an array to the left by one position

public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int first = a[0];

        for (int i = 0; i < a.length-1; i++)
            a[i] = a[i+1];
        a[a.length-1] = first;

        for (int n : a)
            System.out.print(n + " ");
    }
}



Output
2 3 4 5 1


Q22. Count how many times each element appears

public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,2,3,1,2};
        boolean[] visited = new boolean[a.length];

        for (int i = 0; i < a.length; i++) {
            if (visited[i]) continue;
            int count = 1;

            for (int j = i+1; j < a.length; j++)
                if (a[i] == a[j]) {
                    count++;
                    visited[j] = true;
                }

            System.out.println(a[i] + ": " + count);
        }
    }
}



Output
1: 2
2: 3
3: 1


Q23. Find the second largest element

public class Main {
    public static void main(String[] args) {
        int[] a = {10,40,20,30,40};
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int n : a) {
            if (n > max) {
                second = max;
                max = n;
            } else if (n < max && n > second)
                second = n;
        }

        System.out.println("Second Largest: " + second);
    }
}



Output
Second Largest: 30


Q24. Remove duplicate elements without collections

public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,2,3,1,4};
        int[] b = new int[a.length];
        int size = 0;

        for (int n : a) {
            boolean found = false;
            for (int i = 0; i < size; i++)
                if (b[i] == n) found = true;

            if (!found) b[size++] = n;
        }

        for (int i = 0; i < size; i++)
            System.out.print(b[i] + " ");
    }
}



Output
1 2 3 4


Q25. Sum of main and secondary diagonals

public class Main {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int main = 0, secondary = 0, n = a.length;

        for (int i = 0; i < n; i++) {
            main += a[i][i];
            secondary += a[i][n-1-i];
        }

        System.out.println("Main: " + main);
        System.out.println("Secondary: " + secondary);
    }
}



Output
Main: 15
Secondary: 15


Q26. Display upper and lower triangular parts

public class Main {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int n = a.length;

        System.out.println("Upper:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(j >= i ? a[i][j] + " " : "0 ");
            System.out.println();
        }

        System.out.println("Lower:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(j <= i ? a[i][j] + " " : "0 ");
            System.out.println();
        }
    }
}



Output
Upper:
1 2 3
0 5 6
0 0 9
Lower:
1 0 0
4 5 0
7 8 9


Q27. Print boundary elements of a matrix

public class Main {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int n = a.length, m = a[0].length;

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (i == 0 || j == 0 || i == n-1 || j == m-1)
                    System.out.print(a[i][j] + " ");
    }
}



Output
1 2 3 4 6 7 8 9


Q28. Search an element in a 2-D array

public class Main {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int key = 5;
        boolean found = false;

        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                if (a[i][j] == key) {
                    System.out.println("Row: " + i);
                    System.out.println("Column: " + j);
                    found = true;
                }

        if (!found) System.out.println("Not Found");
    }
}



Output
Row: 1
Column: 1


Q29. Sort each row of a jagged array

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] a = {{5,2,4},{9,3},{8,1,6,2}};

        for (int[] row : a) {
            Arrays.sort(row);
            System.out.println(Arrays.toString(row));
        }
    }
}



Output
[2, 4, 5]
[3, 9]
[1, 2, 6, 8]


Q30. Check whether a matrix is sparse
A sparse matrix has more zero elements than non-zero elements.

public class Main {
    public static void main(String[] args) {
        int[][] a = {{0,0,3},{0,0,0},{4,0,0}};
        int zero = 0, nonzero = 0;

        for (int[] row : a)
            for (int n : row)
                if (n == 0) zero++;
                else nonzero++;

        if (zero > nonzero)
            System.out.println("Sparse Matrix");
        else
            System.out.println("Not a Sparse Matrix");
    }
}



Output
Sparse Matrix