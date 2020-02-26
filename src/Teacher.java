/**
 * Created by h205p4 on 2/20/20.
 */
public class Teacher extends Person{

    private Section[] sections = new Section[10];
    private String subject;
    private int sectionCount = 0;


    public Teacher(String name, String subject) {

        super(name);
        this.subject = subject;

    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Section[] getSections() {
        return sections;
    }

    public void addSections(Section newSection) {

        sections[sectionCount] = newSection;
        sectionCount++;

    }

    public String toString() {

        return getName() + " teaches " + subject + " (" + getSections() + ")";

    }
}
