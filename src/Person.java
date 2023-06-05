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
