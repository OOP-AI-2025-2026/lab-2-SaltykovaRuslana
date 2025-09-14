package ua.opnu;

import java.util.ArrayList;

public class Student {
    private  String name;
    private  int year;
    private ArrayList<String> courses;

    public  Student(String name, int year) {
        this.name = name;
        if (year >= 1 && year <= 4) {
            this.year = year;
        } else {
            this.year = 1;
        }
        this.courses = new ArrayList<>();
    }
    public  void  addCourse(String courseName) {
        if (courseName != null && !courseName.isEmpty()) {
            this.courses.add(courseName);
        }
    }
    public  void dropAll() {
        this.courses.clear();
    }

    public int getCourseCount() {
        return this.courses.size();

    }
    public  String getName() {
        return this.name;
    }
    public double getTuition() {
        return  this.year * 20000.0;
    }
    public int getYear() {
        return this.year;
    }
}
