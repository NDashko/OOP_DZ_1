package Task1;
// Базовый класс для кошек
class Cat {
    private String name;
    private int age;


    // Конструктор класса Cat
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Геттер для получения имени кошки
    public String getName() {
        return name;
    }

    
    // Геттер для получения возраста кошки
    public int getAge() {
        return age;
    }

    public String getOwner() {
        return null;
    }
}