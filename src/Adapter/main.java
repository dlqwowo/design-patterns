package Adapter;

/**
 * @Description
 * @Author PowerQun
 * @Date 8/10/2023
 */
public class main {

    public static void main(String[] args) {
        Person person = new Person(new PersonAdapter(new NewFunction()));
        person.eat();
    }
}
