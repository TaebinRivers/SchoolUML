/**
 * Created by h205p4 on 2/20/20.
 */
public class Section {

    private Teacher teacher;
    private Student[] students = new Student[50];
    private String name;
    private int currentSize=0;

    public Section(String name) {

        this.name = name;

    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void addStudent(Student newStudent) {

        students[currentSize] = newStudent;
        currentSize ++;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String studentList() {

        String list = "";

        for(int i = 0; i < currentSize-1; i++) {

            list += students[i].getName();

        }
        return list;

    }
    public String toString() {

        return name + " is taught by " + teacher + " and has " + currentSize + " students. : " + studentList();

    }
}
