package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает банковский счет
 * @author Alex
 * @version 1.0
 */
public class Account {
    /**
     * Реквизит счета
     */
    private String requisite;
    /**
     * Остаток на счете
     */
    private double balance;

    /**
     * Конструктор класса
     * @param requisite реквизит счета
     * @param balance остаток на счете
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метод возвращает реквизит счета
     * @return реквизит счета
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод устанавливает значение реквизита
     * @param requisite реквизит счета
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод возвращает остаток на счете
     * @return остаток
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод устанавливает остаток на счете
     * @param balance новый остаток на счете
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Метод сравнивает счет с другим счетом
     * @param o другой счет
     * @return совпадают реквизиты счетов или нет
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Метод возвращает hashcode
     * @return hashcode по значению реквизита
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
