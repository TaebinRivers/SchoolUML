/**
 * Created by h205p4 on 2/20/20.
 */
public class Person {
    private String name;
    private int id;
    static int nextId = 0;


    public Person(String name) {
        this.name = name;
        this.id = nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }


}
