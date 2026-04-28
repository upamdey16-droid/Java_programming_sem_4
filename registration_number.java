import java.util.*;

interface Department {
    String deptName = "CSE";
    String deptHead = "Dr. Sharma";

    void printDept();
}

class Hostel {
    String hostelName;
    String hostelLocation;
    int numberOfRooms;

    void getHostel(Scanner sc) {
        System.out.print("Hostel Name: ");
        sc.nextLine(); // clear buffer
        hostelName = sc.nextLine();
        System.out.print("Location: ");
        hostelLocation = sc.nextLine();
        System.out.print("Rooms: ");
        numberOfRooms = sc.nextInt();
    }

    void printHostel() {
        System.out.println("Hostel: " + hostelName + ", " + hostelLocation + ", Rooms: " + numberOfRooms);
    }
}

class Student extends Hostel implements Department {
    String studentName;
    int regdNo;
    String electiveSubject;
    double avgMarks;

    void getData(Scanner sc) {
        System.out.print("Name: ");
        sc.nextLine(); // clear buffer
        studentName = sc.nextLine();

        System.out.print("Reg No: ");
        regdNo = sc.nextInt();

        sc.nextLine(); // clear buffer
        System.out.print("Subject: ");
        electiveSubject = sc.nextLine();

        System.out.print("Marks: ");
        avgMarks = sc.nextDouble();

        getHostel(sc);
    }

    void printData() {
        System.out.println("\nStudent Details:");
        System.out.println(studentName + " | " + regdNo + " | " + electiveSubject + " | " + avgMarks);
        printHostel();
        printDept();
    }

    public void printDept() {
        System.out.println("Dept: " + deptName + " | Head: " + deptHead);
    }
}

public class registration_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[100]; // fixed size array
        int count = 0;

        while (true) {
            System.out.println("\n1. Admit\n2. Migrate\n3. Display\n4. Exit");
            int ch = sc.nextInt();

            if (ch == 1) {
                if (count < students.length) {
                    students[count] = new Student();
                    students[count].getData(sc);
                    count++;
                } else {
                    System.out.println("Storage Full!");
                }
            }

            else if (ch == 2) {
                System.out.print("Enter Reg No: ");
                int r = sc.nextInt();
                boolean found = false;

                for (int i = 0; i < count; i++) {
                    if (students[i].regdNo == r) {
                        System.out.println("Student Migrated!");

                        // shift elements left
                        for (int j = i; j < count - 1; j++) {
                            students[j] = students[j + 1];
                        }
                        students[count - 1] = null;
                        count--;
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student not found!");
                }
            }

            else if (ch == 3) {
                if (count == 0) {
                    System.out.println("No records!");
                } else {
                    for (int i = 0; i < count; i++) {
                        students[i].printData();
                    }
                }
            }

            else {
                System.out.println("Exiting...");
                break;
            }
        }
    }
}