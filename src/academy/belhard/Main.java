package academy.belhard;

import academy.belhard.entity.Person;
import academy.belhard.entity.User;

public class Main {

    public static void main(String[] args) {
        Person person1=new Person("Matt", "Damon");
        Person person2=new Person("George", "Clooney");
        User person3=new User("Tom","Hardy","tomhardy@tut.by","150977");
        User person4=new User("Brad","Pitt","bradpitt@tut.by","181263");

        System.out.println(person1.getFullName());
        System.out.println(person2.getFullName());

        System.out.println(person3.getFullInfo());
        System.out.println(person4.getFullInfo());

        System.out.println(person3.isPasswordCorrect("555555"));
        System.out.println(person4.isPasswordCorrect("181263"));

    }
}
