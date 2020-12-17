package school;

import student.Student;

public class School{
    private String sName;
    private String address;
    private Student students [];

    public School(String sn, String ad, int scount){
        this.sName = sn;
        this.address = ad;
        this.students = new Student[scount];
    }

    public void setName(String name){
        this.sName = name;
    }

    public String getName(){
        return this.sName;
    }

    public void setAddress(String addr){
        this.address = addr;
    }

    public String getAddress(){
        return this.address;
    }

    public void addStudent(String name, int age, double gpa){
        for(int i =0; i< students.length; i++){
            if(i == students.length-1 && students[i] != null){
                System.out.println("Students full");
                break;
            }
            if(students[i] == null){
                students[i] = new Student(name, age, gpa);
                break;
            }
        }
    }

    public void display(){
        System.out.println("School Name: " + this.sName + "\nAddress: " + this.address + "\nStudent Details: ");
        for(Student s : students){
            if(s != null){
                s.display();
            }
            System.out.println("");
        }
        if(students[0] != null)
            System.out.println("Average GPA: " + students[0].calAverage(students));
    }

}