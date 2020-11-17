public class main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барс");
        Dog dog = new Dog("Нільсон");
        Car car = new Car("Ferrary");
        Cat cat2 = new  Cat("Барсик");
        Car car2 = new Car("opel");
        car2.collor("grey");
        car2.carCollor();

        Book book = new Book("Подорож до центру землі");
        Book book2 = new Book("Подорож до центру землі. продовження");


        cat.catSay();
        dog.dogSay();
        car.carCollor();
        book.bookInfo();

    }
}
