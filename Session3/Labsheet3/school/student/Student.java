package student;

public class Student{
    private String name;
    private int age;
    private double gpa;

    public Student(String n, int a, double g){
        this.name = n;
        this.age = a;
        this.gpa = g;
    }

    public void setName(String nme){
        this.name = nme;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int ag){
        this.age = ag;
    }

    public int getAge(){
        return this.age;
    }

    public void setGPA(double gp){
        this.gpa = gp;
    }
    
    public double getGPA(){
        return this.gpa;
    }

    public double calAverage(Student s []){
        double avg = 0.0;
       
        for (Student stu : s){
            if(stu != null)
            avg += stu.getGPA();
        }
        return avg/s.length;
       
    }

    public void display(){
        System.out.println("Name: " + this.name + "\nAge: " + this.age + "\ngpa: " + this.gpa);
    }

}