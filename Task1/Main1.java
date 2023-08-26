package Task1;

public class Main1 {
    public static void main(String[] args) {
        // Создание объекта кошки
        Cat Abyssinian = new Owner("Murka", 3, "Ivanov");

        // Использование геттеров и сеттеров
        System.out.println("Мяу! Меня зовут " + Abyssinian.getName());
        System.out.println("Мне " + Abyssinian.getAge() +" года (лет)");
        System.out.println("Мой владелец - " + Abyssinian.getOwner());
  
    }
}
