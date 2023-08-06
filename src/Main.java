import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        SortedGroup<Student> studentSortedGroup = buildGroup();
        System.out.println("===============Add================");
        System.out.println(studentSortedGroup);

        int numOfRemoved=studentSortedGroup.remove(new Student("test", "000", 76));
        System.out.println("==============Remove==============");
        System.out.println("Removed: "+numOfRemoved+" objects");
        System.out.println(studentSortedGroup);

        System.out.println("=================Iterator================");
        Iterator<Student> itr = studentSortedGroup.iterator();
        while (itr.hasNext()) {
            Student student = itr.next();
            System.out.println(student.toString() + (student.getGrade() < 60 ? " Failed" : " Passed"));
        }
        System.out.println();

        SortedGroup<Student> passedStudentSortedGroup = Reduce.reduce(new Student("Passed", "000", 60), studentSortedGroup);
        System.out.println("==============Reduce==============");
        System.out.println(passedStudentSortedGroup);
        System.out.println("=============Original=============");
        System.out.println(studentSortedGroup);
    }

    private static SortedGroup<Student> buildGroup() {
        SortedGroup<Student> studentSortedGroup = new SortedGroup<>();
        studentSortedGroup.add(new Student("Alice", "1", 74));
        studentSortedGroup.add(new Student("Bob", "2", 55));
        studentSortedGroup.add(new Student("Camilla", "3", 35));
        studentSortedGroup.add(new Student("Dan", "4", 98));
        studentSortedGroup.add(new Student("Emma", "5", 100));
        studentSortedGroup.add(new Student("Faith", "6", 84));
        studentSortedGroup.add(new Student("Gabriel", "7", 99));
        studentSortedGroup.add(new Student("Haytham", "8", 99));
        studentSortedGroup.add(new Student("Ilan", "9", 76));
        studentSortedGroup.add(new Student("Julia", "10", 76));

        return studentSortedGroup;
    }
}
