package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу банка
 * с целью мзучения работы HashMap
 * @author Alex
 * @version 1.0
 */
public class BankService {
    /**
     * Для каждого клиента хранится список его счетов
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет клиента
     * @param user клиент
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод удаляет клиентап
     * @param passport паспортные данныые клиента
     * @return удалось удалить или нет
     */
    public boolean deleteUser(String passport) {
        return users.remove(new User(passport, "")) != null;
    }

    /**
     * Метод добавляет счет клиенту
     * @param passport паспортные данные клиента
     * @param account счет
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null && !getAccounts(user).contains(account)) {
            getAccounts(user).add(account);
        }
    }

    /**
     * Метод ищет клиента по паспорту
     * @param passport данные паспорта
     * @return клиент
     */
    public User findByPassport(String passport) {
        User rsl = null;
        for (User user : users.keySet()) {
            if (passport.equals(user.getPassport())) {
                rsl = user;
                break;
            }
        }
        return rsl;
    }

    /**
     * Метод ищет счет по паспортным данным кликента и реквизиту счета
     * @param passport паспортные данные
     * @param requisite реквизит счета
     * @return счет
     */
    public Account findByRequisite(String passport, String requisite) {
        Account rsl = null;
        User user = findByPassport(passport);
        if (user != null) {
            for (Account account : getAccounts(user)) {
                if (requisite.equals(account.getRequisite())) {
                    rsl = account;
                    break;
                }
            }
        }
        return rsl;
    }

    /**
     * Метод осуществляет перевод средств между счетами
     * если удалось найти счета плательщика и получателя,
     * и на счете плательщика достаточно денег,
     * то остаток на счете плательщика уменьшается на сумму перевода,
     * а остаток на счете получателя увеличивается на сумму перевода
     * @param srcPassport паспорт клиента плательщика
     * @param srcRequisite реквизит счета плательщика
     * @param destPassport паспорт клиента получателя
     * @param destRequisite реквизит счета получателя
     * @param amount сумма перевода
     * @return удалось сделать перевод или нет
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }

    /**
     * Метод возвращает список счетов клиента
     * @param user клиент
     * @return список счетов
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}