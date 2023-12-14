import java.util.*;

class Student {
    public String name;
    public int rollNumber;
    public int age;
    public int marks;


    public Student(String name, int rollNumber, int age, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.marks = marks;
    }

    public void viewStudent() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}

public class StudentDatabase{

    public static void main(String[] args) {

        try{
            
        Scanner sc = new Scanner(System.in);

    HashMap<Integer, Student> database = new HashMap<Integer, Student>(); 
        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Calculate Average Marks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

        switch (choice) {
            case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter roll number: ");
                    int rollNumber = sc.nextInt();

                    System.out.print("Enter age: ");
                    int age = sc.nextInt();

                    System.out.print("Enter marks: ");
                    int marks = sc.nextInt();

                    Student std = new Student(name, rollNumber, age, marks);
                    database.put(rollNumber, std);

                    System.out.println("Student added successfully!");
                    break;

            case 2:
                    System.out.println("List of Students");
                    for (Student i : database.values()) {
                        i.viewStudent(); 
                    }
                    break;
            case 3:
                   System.out.println("");
                   
                }
            }
} 

}