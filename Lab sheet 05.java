Q1. Handling ArithmeticException
Program:
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter two numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Result = " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }
}


Output:
Enter two numbers: 10 0
Cannot divide by zero.


Q2. Handling ArrayIndexOutOfBoundsException
Program:
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter index (0-4): ");
            int i = sc.nextInt();
            System.out.println("Element = " + a[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index.");
        }
    }
}


Output:
Enter index (0-4): 7
Invalid array index.


Q3. Handling NumberFormatException
Program:
class Main {
    public static void main(String[] args) {
        String s = "12abc";

        try {
            int n = Integer.parseInt(s);
            System.out.println("Number = " + n);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }
    }
}


Output:
Invalid number format.


Q4. Multiple Catch Blocks
Program:
class Main {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int arr[] = {1, 2, 3, 4, 5};

        try {
            System.out.println(a / b);
            System.out.println(arr[7]);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }
    }
}


Output:
Division by zero.


Q5. Using finally
Program:
class Main {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } finally {
            System.out.println("Program execution completed.");
        }
    }
}


Output:
Cannot divide by zero.
Program execution completed.


Q6. Using throw
Program:
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        try {
            if (marks < 0 || marks > 100)
                throw new IllegalArgumentException("Invalid marks");
            System.out.println("Marks = " + marks);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}


Output:
Enter marks: 120
Invalid marks


Q7. Using throws
Program:
class Main {
    static void checkAge(int age) throws Exception {
        if (age < 18)
            throw new Exception("Not eligible");
        System.out.println("Eligible");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


Output:
Not eligible


Q8. Nested try-catch
Program:
class Main {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;

            try {
                int arr[] = {1, 2, 3};
                System.out.println(arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index.");
            }

            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero.");
        }
    }
}


Output:
Invalid array index.
Division by zero.


Q9. Exception Propagation
Program:
class Main {
    static void method3() {
        int a = 10 / 0;
    }

    static void method2() {
        method3();
    }

    static void method1() {
        method2();
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in main.");
        }
    }
}


Output:
Exception handled in main.


Q10. User-Defined Exception
Program:
import java.util.Scanner;

class InvalidMarksException extends Exception {
    InvalidMarksException(String msg) {
        super(msg);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100)
                throw new InvalidMarksException("Invalid marks!");

            System.out.println("Valid marks.");
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
    }
}


Output:
Enter marks: 120
Invalid marks!


Part B — Real-World / Application-Based Questions
Q11. Bank Withdrawal System
Program:
import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter balance: ");
            double balance = Double.parseDouble(sc.nextLine());

            System.out.print("Enter withdrawal amount: ");
            double amount = Double.parseDouble(sc.nextLine());

            if (amount < 0)
                throw new IllegalArgumentException("Negative amount!");

            if (amount > balance)
                throw new InsufficientBalanceException("Insufficient balance!");

            System.out.println("Remaining balance: " +
                               (balance - amount));

        } catch (NumberFormatException e) {
            System.out.println("Enter a valid number.");
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Bank transaction completed.");
        }
    }
}


Output:
Enter balance: 5000
Enter withdrawal amount: 6000
Insufficient balance!
Bank transaction completed.


Q12. Hospital Patient Age Validation
Program:
import java.util.Scanner;

class InvalidPatientAgeException extends Exception {
    InvalidPatientAgeException(String msg) {
        super(msg);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter patient name: ");
            String name = sc.nextLine();

            System.out.print("Enter age: ");
            int age = Integer.parseInt(sc.nextLine());

            if (age < 0 || age > 120)
                throw new InvalidPatientAgeException("Invalid age!");

            System.out.println("Patient registered: " + name);
        } catch (NumberFormatException e) {
            System.out.println("Age must be numeric.");
        } catch (InvalidPatientAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}


Output:
Enter patient name: Rahul
Enter age: 150
Invalid age!


Q13. Pharmaceutical Drug Dosage Validation
Program:
import java.util.Scanner;

class InvalidDosageException extends Exception {
    InvalidDosageException(String msg) {
        super(msg);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Patient name: ");
            String patient = sc.nextLine();

            System.out.print("Drug name: ");
            String drug = sc.nextLine();

            System.out.print("Dosage in mg: ");
            int dose = Integer.parseInt(sc.nextLine());

            if (dose <= 0 || dose > 1000)
                throw new InvalidDosageException("Invalid dosage!");

            System.out.println("Dosage validated for " + patient);
        } catch (NumberFormatException e) {
            System.out.println("Enter a numeric dosage.");
        } catch (InvalidDosageException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Dosage validation completed.");
        }
    }
}


Output:
Patient name: Rahul
Drug name: Medicine
Dosage in mg: 1500
Invalid dosage!
Dosage validation completed.


Q14. Online Examination System
Program:
import java.util.Scanner;

class InvalidExamMarksException extends Exception {
    InvalidExamMarksException(String msg) {
        super(msg);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter marks: ");
            int marks = Integer.parseInt(sc.nextLine());

            if (marks < 0 || marks > 100)
                throw new InvalidExamMarksException("Invalid marks!");

            if (marks >= 40)
                System.out.println("PASS");
            else
                System.out.println("FAIL");

        } catch (NumberFormatException e) {
            System.out.println("Enter numeric marks.");
        } catch (InvalidExamMarksException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Exam evaluation completed.");
        }
    }
}


Output:
Enter marks: 75
PASS
Exam evaluation completed.


Q15. Pharmacy Inventory System
Program:
import java.util.Scanner;

class InvalidQuantityException extends Exception {
    InvalidQuantityException(String msg) {
        super(msg);
    }
}

class InsufficientMedicineStockException extends Exception {
    InsufficientMedicineStockException(String msg) {
        super(msg);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Medicine name: ");
            String name = sc.nextLine();

            System.out.print("Available quantity: ");
            int available = Integer.parseInt(sc.nextLine());

            System.out.print("Required quantity: ");
            int required = Integer.parseInt(sc.nextLine());

            if (available < 0 || required < 0)
                throw new InvalidQuantityException(
                    "Quantity cannot be negative!");

            if (required > available)
                throw new InsufficientMedicineStockException(
                    "Insufficient medicine stock!");

            System.out.println("Medicine issued: " + name);

        } catch (NumberFormatException e) {
            System.out.println("Enter valid numeric quantities.");
        } catch (InvalidQuantityException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientMedicineStockException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Inventory transaction completed.");
        }
    }
}


Output:
Medicine name: Paracetamol
Available quantity: 10
Required quantity: 15
Insufficient medicine stock!
Inventory transaction completed.