package comparabledemo;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    //is a setter a method
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        if(this.age > person.getAge()){
            return 1; //if this object is > than the object passed return a positive  1
        }else if(this.age < person.getAge()){
            return -1; //if this object is < than the object passed return a negative  -1
        }
        return 0; //if this object is == the object passed return a positive  0
    }

    //sort by person name


}
