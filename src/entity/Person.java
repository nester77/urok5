package entity;

public class Person {
    protected String firstName;
    protected String lastName;

    public Person (String firstName, String lastName) {
        this.firstName=firstName;
        this.lastName=lastName;
        }
    public String getFullName () {
        return (firstName+" "+lastName);
    }

}
//     4  Создайте 2 поля класса Person с названиями firstName и lastName типа String и модификаторами доступа protected
//       5 Создайте в классе Person конструктор с 2-мя аргументами (для обоих полей класса) и модификатором доступа public
//      6  Создайте в классе Person метод под названием getFullName с типом возвращаемого значения String и модификатором
// доступа public. Этот метод должен склеивать имя и фамилию через пробел и возвращать это значение
//      7  Создайте класс User (внутри пэкеджа entity), который будет являться дочерним классом по отношению к
//        классу Person