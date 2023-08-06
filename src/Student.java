public class Student implements Comparable<Student> {
    private final String name;
    private final String idNum;
    private int grade;

    public Student(String name, String idNum, int grade) throws IllegalArgumentException {
        if (name == null || idNum == null || grade < 0 || grade > 100)
            throw new IllegalArgumentException();
        this.grade = grade;
        this.name = name;
        this.idNum = idNum;
    }

    public String getName() {
        return name;
    }

    public String getIdNum() {
        return idNum;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) throws IllegalArgumentException {
        if (grade < 0 || grade > 100)
            throw new IllegalArgumentException();
        this.grade = grade;
    }

    @Override
    public int compareTo(Student other) {
        return this.grade - other.grade;
    }

    @Override
    public String toString() {
        return String.format("%-15s | %-10s | %3d", name, idNum, grade);
    }
}