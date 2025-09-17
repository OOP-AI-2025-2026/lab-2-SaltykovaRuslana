package ua.opnu;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Руслана", 2);
        student.addCourse("Об'єктно-орієнтоване програмування");
        student.addCourse("Організація баз даних та знань");
        student.addCourse("Українська мова");
        System.out.println(student.getName() + " : кількість вивчаємих дисциплін" + student.getCourseCount());
        System.out.println(student.getName() + " : рік навчання" + student.getYear());
        System.out.println(student.getName() + " : заплатив за навчання" + student.getTuition());

    }
}