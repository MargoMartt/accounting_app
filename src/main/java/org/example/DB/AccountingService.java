package org.example.DB;

import java.util.ArrayList;

public class AccountingService {
    private AccountingDao accountingDao = new AccountingDao();

    public AccountingService() {
    }

    public AccountingEntity findEmployee(int id) {
        return accountingDao.findById(id);
    }

    public void saveEmployee(AccountingEntity accounting) {
        accountingDao.save(accounting);
    }

    public void deleteEmployee(AccountingEntity accounting) {
        accountingDao.delete(accounting);
    }

    public void updateEmployee(AccountingEntity accounting) {
        accountingDao.update(accounting);
    }

    public ArrayList<AccountingEntity> findAllEmployees() {
        return accountingDao.findAll();
    }
}

