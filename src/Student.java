/**
 * Created by h205p4 on 2/20/20.
 */
public class Student extends Person{

    private int grade;
    private int sectionCount;
    private Section[] sections = new Section[10];

    public Student(String name, int grade) {

        super(name);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Section[] getSections() {
        return sections;
    }

    public void addSections(Section newSection) {

        sections[sectionCount] = newSection;
        sectionCount++;

    }

    public String sectionList() {
        String list = "";

        for(int i = 0; i < sectionCount-1; i++) {

             list += sections[i].getName() + " (" + sections[i].getTeacher() + ")";

        }
        return list;

    }

    public String toString() {

        return getName() + " is in grade " + grade + " and is enrolled in the following sections: " + sectionList();

    }
}
