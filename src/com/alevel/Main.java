package com.alevel;

import com.alevel.constants.Gender;
import com.alevel.constants.Major;
import com.alevel.constants.Subject;
import com.alevel.models.CollegeStudent;
import com.alevel.models.Student;
import com.alevel.models.Teacher;

public class Main {

    public static void main(String[] args) {
        // TODO: check for min and max values everywhere
        // TODO: check age validation for all `Person` child classes' objects, same for other use cases

        Teacher teacher1 = new Teacher("Julien", 35, Gender.MALE, 10000.0, Subject.CHEMISTRY);
        System.out.println(teacher1);

        teacher1.addSubject(Subject.COMPUTER_SCIENCE);
        teacher1.addSubject(Subject.BIOLOGY);
        teacher1.addSubject(Subject.ENGLISH);
        teacher1.addSubject(Subject.SPANISH);
        // Isn't added as the length of the list would exceed max allowed value
        teacher1.addSubject(Subject.FRENCH);
        System.out.println("Updated v.1 subjects list: ");
        for (Subject subject: teacher1.getSubject()) {
            if (subject != null) {
                System.out.println(subject);
            }
        }
        teacher1.removeSubject(Subject.SPANISH);
        // Trying to remove a subject which isn't present in the list: ensure we don't get an exception
        teacher1.removeSubject(Subject.OTHER);
        teacher1.addSubject(Subject.OTHER);
        // Ensure OTHER is in the list and SPANISH is not
        System.out.println("Updated v.2 subjects list: ");
        for (Subject subject: teacher1.getSubject()) {
            if (subject != null) {
                System.out.println(subject);
            }
        }
        System.out.println("-----------");

        // FIXME: wrong `age`
        // Teacher teacher2 = new Teacher("Maria", 105, Gender.FEMALE, 20000.0, Subject.ENGLISH);

        // FIXME: wrong number of subjects (exceeds max value)
        /*
        Teacher teacher3 = new Teacher(
                "Leon",
                56,
                Gender.MALE,
                30000.0,
                Subject.ENGLISH,
                Subject.CHEMISTRY,
                Subject.SPANISH,
                Subject.BIOLOGY,
                Subject.COMPUTER_SCIENCE,
                Subject.FRENCH
        );
        */

        // FIXME: wrong `gpa` and `idNumber`
        // Student student1 = new Student("Ola", 20, Gender.FEMALE, "HS9", 99.5);

        Student student2 = new Student("Ola", 19, Gender.FEMALE, "HS95129", 5);
        System.out.println(student2);
        student2.setGpa(4.5);
        // FIXME: wrong `gpa`
        // student2.setGpa(45);
        System.out.println("-----------");

        // FIXME: wrong `year`
        /*
        CollegeStudent collegeStudent1 = new CollegeStudent(
                "Mila",
                22,
                Gender.FEMALE,
                "HW123",
                3,
                11,
                Major.ELECTRICAL_ENGINEERING);
        */

        CollegeStudent collegeStudent2 = new CollegeStudent(
                "Marylin",
                23,
                Gender.MALE,
                "HW124",
                4,
                1,
                Major.COMMUNICATIONS);
        System.out.println(collegeStudent2);
        // FIXME: wrong `year`
        // collegeStudent2.setYear(6);
        collegeStudent2.setYear(2);
        System.out.println("-----------");


    }
}
