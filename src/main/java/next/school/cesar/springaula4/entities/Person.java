package next.school.cesar.springaula4.entities;

public class Person {
    private String name;
    private int age;
    private int id;

    
    public Person(int id, String name, int age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
}
