package exceptdemo;

public class Person {
    
    public static Person findPersonByName(String personName) throws MyCustomException{
        String emptyString = "";
        if(emptyString.equals(personName)){
            throw new MyCustomException("Name cannot be blank");
        }
        return new Person();
    }

    @Override
    public String toString() {
        return "Person{}";
    }
}
