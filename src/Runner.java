/**
 * Created by h205p4 on 2/20/20.
 */
public class Runner {

    public static void main(String args[]) {

        School school = new School("Berkeley High");
        Section math = new Section("math");
        Section biology = new Section("Biology");
        Section compsci = new Section("Computer Science");
        Teacher albinson = new Teacher("Albinson", "Computer Science");
        Teacher teacher1 = new Teacher("Teacher1", "Biology");
        Teacher teacher2 = new Teacher("Teacher2", "Math");
        Student me = new Student("Taebin", 11);
        Student friend1 = new Student("Friend1",  11);
        Student friend2 = new Student("Friend2",  11);
        Student friend3 = new Student("Friend3",  11);
        Student friend4 = new Student("Friend4",  11);
        Student friend5 = new Student("Friend5",  11);
        school.addSections(math);
        school.addSections(biology);
        school.addSections(compsci);
        math.setTeacher(teacher2);
        biology.setTeacher(teacher1);
        compsci.setTeacher(albinson);
        albinson.addSections(compsci);
        teacher1.addSections(biology);
        teacher2.addSections(math);
        math.addStudent(me);
        biology.addStudent(me);
        compsci.addStudent(me);
        math.addStudent(friend2);
        math.addStudent(friend3);
        math.addStudent(friend4);
        math.addStudent(friend5);
        math.addStudent(friend1);
        biology.addStudent(friend1);
        biology.addStudent(friend2);
        biology.addStudent(friend3);
        biology.addStudent(friend4);
        biology.addStudent(friend5);
        compsci.addStudent(friend1);
        compsci.addStudent(friend2);
        compsci.addStudent(friend3);
        compsci.addStudent(friend4);
        compsci.addStudent(friend5);
        me.addSections(math);
        me.addSections(biology);
        me.addSections(compsci);
        friend1.addSections(biology);
        friend1.addSections(math);
        friend1.addSections(compsci);
        friend2.addSections(math);
        friend2.addSections(biology);
        friend2.addSections(compsci);
        friend3.addSections(math);
        friend3.addSections(biology);
        friend3.addSections(compsci);
        friend4.addSections(math);
        friend4.addSections(biology);
        friend4.addSections(compsci);
        friend5.addSections(compsci);
        friend5.addSections(math);
        friend5.addSections(biology);
        System.out.println(school.toString());
        System.out.println(biology.toString());
        System.out.println(math.toString());
        System.out.println(compsci.toString());
        System.out.println(teacher1.toString());
        System.out.println(teacher2.toString());
        System.out.println(albinson.toString());
        System.out.println(me.toString());
        System.out.println(friend1.toString());
        System.out.println(friend2.toString());
        System.out.println(friend3.toString());
        System.out.println(friend4.toString());
        System.out.println(friend5.toString());


    }

}
