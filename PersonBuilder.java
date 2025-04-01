public class PersonBuilder {
    private String name;
    private String surname;
    private Integer age;
    private String address;

    public PersonBuilder() {}

    public PersonBuilder(String surname, String address, int age) {
        this.surname = surname;
        this.address = address;
        this.age = age;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null || surname == null) {
            throw new IllegalStateException("Необходимо указать имя и фамилию");
        }
        if (age == null) {
            return new Person(name, surname);
        } else {
            return new Person(name, surname, age);
        }
    }
}
