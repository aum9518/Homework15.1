import person.Builder;
import person.Driver;
import person.Person;
import person.Programmer;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        Programmer programmer = new Programmer();
        System.out.println(programmer.getName());
        Programmer.setAge(33);
        System.out.println(Programmer.getAge());
        programmer.working();

        Driver driver = new Driver();
        System.out.println("Name: "+driver.getName());
        Driver.setAge(18);
        System.out.println("Age: "+Driver.getAge());
        driver.working();

        Builder builder = new Builder();
        System.out.println("Name: "+ builder.getName());
        Builder.setAge(25);
        System.out.println("Age: "+Builder.getAge());
        builder.working();



    }

}