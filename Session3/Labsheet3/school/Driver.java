package school;

public class Driver{
    public static void main(String ar[]){
        School sc1 = new School("School ABC", "Colombo Road, Kandy", 5);
        sc1.addStudent("Student 1", 16, 3.2);
        sc1.addStudent("Student 2", 18, 3.8);
        sc1.addStudent("Student 3", 16, 2.7);

        sc1.display();
    }
}