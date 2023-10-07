package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает клиента банка
 * @author Alex
 * @version 1.0
 */public class User {
    /**
     * Данные паспорта клиента
     */
     private String passport;
    /**
     * Наименование клиента
     */
    private String username;

    /**
     * Метод создает клиента
     * @param passport паспорт
     * @param username наименование клиента
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод возвращает данные паспорта
     * @return данные паспорта
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод устанавливает данные паспорта
     * @param passport данные паспорта
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод возвращает наименование клиента
     * @return наименование клиента
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод устанавливает наименование клиента
     * @param username наименование клиента
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Метод сравнивает клиента с другим клиентом
     * @param o другой клиент
     * @return совпадают паспортные данные клиентов или нет
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Метод возвращает hashcode
     * @return hashcode по паспортным данным клиента
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}