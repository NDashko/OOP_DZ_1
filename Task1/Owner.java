package Task1;
// Подкласс для владельца кошки

class Owner extends Cat {
    String owner;

    // Конструктор класса Owner
    public Owner(String name, int age, String owner) {
        super(name, age);
        this.owner = owner;
    }

    // Геттер для получения владельца кошки
    public String getOwner() {
        return owner;
    }   
}
