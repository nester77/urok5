package academy.belhard;

import entity.Person;
import entity.User;

public class Main {

    public static void main(String[] args) {
        Person person1=new Person("Matt", "Damon");
        Person person2=new Person("George", "Clooney");
        User person3=new User("Tom","Hardy","tomhardy@tuut.by","150977");
        User person4=new User("Brad","Pitt","bradpitt@tuut.by","181263");

        System.out.println(person1.getFullName());
        System.out.println(person2.getFullName());

        System.out.println(person3.getFullInfo());
        System.out.println(person4.getFullInfo());





    }
}



//   1 Создайте новый проект, загрузите в него файл .gitignore (не пользуйтесь автоматической генерацией файла
//    .gitignore, который предлагает github - он недостаточный, делайте, как показывал преподаватель на занятиях)
//    и сделайте коммит
//       2 Создайте корневой пэкедж (если он был сгенерирован автоматически, то переименуйте его в academy.belhard),
//        перенесите в него класс Main (класс, в котором находится метод main)
//      3 Внутри этого пэкеджа создайте пэкедж под названием entity (щелчок ПКМ по корневому пэкеджу -> New -> Packege)
//        Внутри пэкеджа entity создайте класс Person
//      4  Создайте 2 поля класса Person с названиями firstName и lastName типа String и модификаторами доступа protected
//       5 Создайте в классе Person конструктор с 2-мя аргументами (для обоих полей класса) и модификатором доступа public
//      6  Создайте в классе Person метод под названием getFullName с типом возвращаемого значения String и модификатором
// доступа public. Этот метод должен склеивать имя и фамилию через пробел и возвращать это значение
//      7  Создайте класс User (внутри пэкеджа entity), который будет являться дочерним классом по отношению к
//        классу Person
//      8  В классе User создайте 2 поля email и password типа String и с модификаторами доступа типа private
//      9  В классе User создайте конструктор, который принимает 2 поля класса Person и 2 поля класса User - всего 4 аргумента
// (используйте вызов конструктора родительского класса с помощью ключевого слова super)
//     10  В классе User создайте метод getFullInfo с модификатором доступа public и возвращаемым значением
//        типа String, который конкатенирует всю информацию о пользователе (кроме пароля) - смотри пример вывода
//     11  В классе User создайте метод isPasswordCorrect с модификатором доступа public и возвращаемым значением
//        типа boolean. Этот метод должен принимать 1 аргумент типа String и возвращать true, если строка-аргумент
//        соответствует паролю пользователя, и false в обратном случае (для проверки строк на равенство используйте
//        метод equals класса String, а НЕ “==” !!!)
//
//
//        Пример работы метода getFullInfo (для перевода строки используйте спецсимвол - “\n”):
//        Имя: Tom Hardy
//        E-mail: tom.hardy@mail.ru

//
//
//
//
//
//
//