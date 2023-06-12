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
        human1.name="Alina";
        human1.age=25;
        human1.sex="male";
        human1.father.name="Pavel";
        human1.mother.age=56;
        human1.mother.sex="female";
        /*Human human2 = new Human();
        human2.mother = new Human();
        human2.father = new Human();
        human2.name="Misha";
        human2.sex="male";
        human2.age=34;
        //human2.mother.name="Nastya";
        //human2.father.name="Sasha";*/

        Human human3 = new Human();
        human3.mother = new Human();
        human3.father = new Human();
        human3.name = "Nastya";
        human3.sex="female";
        human3.age=3;
        human3.father.name = "Misha";
        human3.mother.name = "Alina";

        System.out.println(human1);
        System.out.println(human3);
    }
    public class Basket {
        Basket[] buy_goods = new Basket[5];

    }
    public class Category {
        String name;
        Goods[] goods = new Goods[10];
        Category category1 = new Category();
        Category category2 = new Category();
    }
    public class Goods {
        String name;
        int cost,rating;

    }
    public class User {
        String login,password;
        Basket basket = new Basket();
        User user = new User();
    }
    //Task2 2
    public class Person {
        /*
            переменные fullName, age;
            методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
            Добавьте два конструктора  - Person() и Person(fullName, age).
            Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).
        */
        String fullName;
        int age;

        public Person(){}
        public Person(String fullName,int age){
            this.fullName=fullName;
            this.age=age;
        }

        public void talk(){
            System.out.println(this.fullName  + " говорит");
        }
        public void move(){
            System.out.println(this.fullName + " двигается");
        }
        Person person1 = new Person();
        Person person2 = new Person("Иванов Иван",25);
    }
}