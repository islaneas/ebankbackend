package com.example.ebankbackend.services;

import com.example.ebankbackend.entities.BankAccount;
import com.example.ebankbackend.entities.CurrentAccount;
import com.example.ebankbackend.entities.Customer;
import com.example.ebankbackend.entities.SavingAccount;
import com.example.ebankbackend.exception.BalanceNotSufficientException;
import com.example.ebankbackend.exception.BankAccountNotFindException;

import java.util.List;

public interface BankAccountService {
    Customer saveCustomer(Customer customer);
    CurrentAccount saveCurrentBankAccount(double initialBalance, double overDraft, Long customerId);
    SavingAccount saveSavingBankAccount(double initialBalance, double interestRate, Long customerId);
    List<Customer> listCustomers();
    BankAccount getBankAccount(String accountID) throws BankAccountNotFindException;
    void debit(String accountId,double amount, String description) throws BalanceNotSufficientException, BankAccountNotFindException;
    void credit(String accountId,double amount, String description) throws BankAccountNotFindException;
    void transfer(String accountIdSource, String accountIdDestination, double amount) throws BalanceNotSufficientException, BankAccountNotFindException;
}
