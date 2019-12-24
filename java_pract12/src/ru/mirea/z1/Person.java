package ru.mirea.z1;

public class Person {
    private String name, surname, patronymic;

    public Person(String surname) { this.surname = surname; }

    public Person(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(surname);
        if (name != null && !name.equals(""))
            s.append(" ").append(name);
        if (patronymic != null && !patronymic.equals(""))
            s.append(" ").append(patronymic);
        return s.toString();
    }
}
