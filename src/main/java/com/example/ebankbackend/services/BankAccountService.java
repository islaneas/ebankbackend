package com.example.ebankbackend.services;

import com.example.ebankbackend.dtos.*;
import com.example.ebankbackend.entities.BankAccount;
import com.example.ebankbackend.entities.CurrentAccount;
import com.example.ebankbackend.entities.Customer;
import com.example.ebankbackend.entities.SavingAccount;
import com.example.ebankbackend.exception.BalanceNotSufficientException;
import com.example.ebankbackend.exception.BankAccountNotFindException;
import com.example.ebankbackend.exception.CustomerNotFoundException;

import java.util.List;

public interface BankAccountService {
    CustomerDTO saveCustomer(CustomerDTO customerDTO);

   // CustomerDTO updateCustomer(Customer customer);

    //void deleteCustomer(Long customerId);

    //Customer saveCustomer(Customer customer);
    //CurrentAccount saveCurrentBankAccount(double initialBalance, double overDraft, Long customerId);
    //SavingAccount saveSavingBankAccount(double initialBalance, double interestRate, Long customerId);
   // List<Customer> listCustomers();
   CurrentBankAccountDTO saveCurrentBankAccount(double initialBalance, double overDraft, Long customerId) throws CustomerNotFoundException;
    SavingBankAccountDTO saveSavingBankAccount(double initialBalance, double interestRate, Long customerId) throws CustomerNotFoundException;
    List<CustomerDTO> listCustomers();

    BankAccountDTO getBankAccount(String accountID) throws BankAccountNotFindException;
    void debit(String accountId,double amount, String description) throws BalanceNotSufficientException, BankAccountNotFindException;
    void credit(String accountId,double amount, String description) throws BankAccountNotFindException;
    void transfer(String accountIdSource, String accountIdDestination, double amount) throws BalanceNotSufficientException, BankAccountNotFindException;

    //List<BankAccount> bankAccountList();
    List<BankAccountDTO> bankAccountList();

    CustomerDTO getCustomer(Long customerId) throws CustomerNotFoundException;
    CustomerDTO updateCustomer(CustomerDTO customerDTO);

    void deleteCustomer(Long customerId);
    List<AccountOperationDTO> accountHistory(String accountId);
    AccountHistoryDTO getAccountHistory(String accountId, int page, int size) throws BankAccountNotFindException;

    List<CustomerDTO> searchCustomers(String keyword);
}
