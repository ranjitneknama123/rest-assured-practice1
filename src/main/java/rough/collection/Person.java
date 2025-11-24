package rough.collection;

public class Person {
    private int id;
    private int age;
    private String name;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return "id= "+id+" name= "+name+" age= "+age;
    }

}
