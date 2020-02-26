/**
 * Created by h205p4 on 2/20/20.
 */
public class School {
    private String name;
    private Section[] sections = new Section[200];
    private int sectionCount;

    public School(String name) {

        this.name = name;

        sectionCount = 0;



    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Section[] getSections() {
        return sections;
    }

    public void addSections(Section newSections) {

        sections[sectionCount] = newSections;
        sectionCount ++;

    }

    public String toString() {

        return "The school named " + name + " has " + sectionCount + " section(s).";

    }
}
