package ARRAYS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class StudentMarks

{

    public

    static

    void

    main(String[] args)

    {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", "Math", 85));
        students.add(new Student("Alice", "Science", 90));
        students.add(new Student("Alice", "English", 75));
        students.add(new Student("Alice", "Math", 88));
        students.add(new Student("Alice", "Science", 95));

        Map<String, Integer> overallMarks = new HashMap<>();
        for (Student student : students) {
            String studentName = student.getName();
            int marks = student.getMarks();

            if (!overallMarks.containsKey(studentName)) {
                overallMarks.put(studentName, 0);
            }

            overallMarks.put(studentName, overallMarks.get(studentName) + marks);
        }

        System.out.println("Student Name\tOverall Marks");
        for (Map.Entry<String, Integer> entry : overallMarks.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }
}

class Student {
    private String name;
    private String subject;
    private int marks;

    public

    Student(String name, String subject, int marks)

    {
        this.name = name;
        this.subject = subject;
        this.marks = marks;
    }

    public String getName()

    {
        return name;
    }

    public String getSubject()

    {
        return subject;
    }

    public

    int

    getMarks() {
        return marks;
    }
}