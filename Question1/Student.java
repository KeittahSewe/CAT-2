public class Student {
    private String name;
    private int grade;

    
    public Student(String name, int grade) {
        this.name = name;
        setGrade(grade);  
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for grade with validation
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            this.grade = 0;  
        }
    }

    // Show student info
    public void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Grade: " + grade);
    }

    // Testing a valid grade
    public static void main(String[] args) {
        Student student1 = new Student("Oyunga", 85);
        student1.displayStudent();

        // Testing an invalid grade
        Student student2 = new Student("Wanjiku", 110);
        student2.displayStudent();
    }
}
