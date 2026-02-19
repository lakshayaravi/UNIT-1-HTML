import java.util.Scanner;

public class StudentInfoManager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students");
        int n = sc.nextInt();
        sc.nextLine();

        Student s[] = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details of student " + (i + 1));
            System.out.println("Format: name,email,phone,rollNo,dept,year,city,state");

            String input = sc.nextLine();
            String arr[] = input.split(",");

            s[i] = new Student(
                    arr[0], arr[1], arr[2], arr[3],
                    arr[4], arr[5], arr[6], arr[7]
            );
        }

        System.out.println("\nStudent Details");

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.println("Name: " + s[i].name);
            System.out.println("Email: " + s[i].email);
            System.out.println("Phone: " + s[i].phone);
            System.out.println("Roll No: " + s[i].rollNo);
            System.out.println("Department: " + s[i].dept);
            System.out.println("Year: " + s[i].year);
            System.out.println("City: " + s[i].city);
            System.out.println("State: " + s[i].state);
        }

        sc.close();
    }
}