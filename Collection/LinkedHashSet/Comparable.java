package Collection.LinkedHashSet;

import java.util.*;
public class Comparable {
    public static void main(String[] args) {
        
        Student s1 = new Student(51, 89,56,8);
        Student s2 = new Student(55, 86,58,4);
        Student s3 = new Student(45, 88,52,5);
        Student s4 = new Student(65, 96,54,3);
        Student s5 = new Student(85, 69,96,8);

        List<Student> list = new ArrayList<>();

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        Collections.sort(list);

        for(Student student : list){
            System.out.println(student.tenth+" "+student.twelth);
        }
    }
}

class Student implements Comparable<Student>{
    int tenth;
    int twelth;
    int ug;
    int saturdayTest;

    Student(int tenth,int twelth , int ug , int saturdayTest){
        
        this.tenth = tenth;
        this.twelth = twelth;
        this.ug = ug;
        this.saturdayTest = saturdayTest;
    }

    public int compareTo(Student s1){
        if(tenth > s1.tenth){
            return 1;
        }else if (tenth == s1.tenth){
            return 0;
        }else{
            return -1;
        }
    }
}
