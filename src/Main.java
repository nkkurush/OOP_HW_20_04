public class Main {
    public static void main(String[] args) {
        /*Создать класс Товар, имеющий переменные имя, цена, рейтинг.
        Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
                Создать класс Basket, содержащий массив купленных товаров.
                Создать класс User, содержащий логин, пароль и объект класса Basket. Создать объект класса User.

        2

        Создать класс Person, который содержит:

        переменные fullName, age;
        методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
                Добавьте два конструктора  - Person() и Person(fullName, age).
        Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).


        3



        Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

        Примечание:
        Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.

                Пример вывода:
        Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
        Имя: Катя, пол: женский, возраст: 55
        Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня*/
        Human human1 = new Human();
        human1.mother = new Human();
        human1.father = new Human();
        human1.mother.name="Natasha";
        human1.name="Sasha";
        human1.age=25;
        human1.sex="male";
        human1.father.name="Pavel";

        Human human2 = new Human();
        human2.mother = new Human();
        human2.father = new Human();
        human2.name="Misha";
        human2.sex="male";
        human2.age=34;
        human2.mother.name="Nastya";
        human2.father.name="Sasha";

        Human human3 = new Human();
        human3.mother = new Human();
        human3.father = new Human();
        human3.name = "Nastya";
        human3.sex="female";
        human3.age=35;
        human3.father.name = "Konstantin";
        human3.mother.name = "Aleksandra";

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
    }
}