package com.example.ebankbackend;

import com.example.ebankbackend.entities.*;
import com.example.ebankbackend.enums.AccountStatuts;
import com.example.ebankbackend.enums.OperationType;
import com.example.ebankbackend.repositories.BankAccountRepository;
import com.example.ebankbackend.repositories.BankOperationRepository;
import com.example.ebankbackend.repositories.CustomerRepository;
import com.example.ebankbackend.services.BankService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.annotation.Transient;

import java.util.Date;
import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class EbankbackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(EbankbackendApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(BankService bankService) {
        return args -> {
Stream.of("Nassima","Meriem","Jad").forEach(name->{
    Customer customer=new Customer();
    customer.setName(name);
    customer.setEmail(name+"gmail.com");
    
});
        };
    }
    /*1er partie
   @Bean
    CommandLineRunner commandLineRunner(BankService bankService){
        return args -> {
            bankService.consulter();
        };
    }
  //  @Bean
    CommandLineRunner star(CustomerRepository customerRepository,
                           BankAccountRepository bankAccountRepository,
                           BankOperationRepository accountOperationRepository) {
        return arg -> {
            Stream.of("Asmae", "Youssef", "Zineb").forEach(name -> {
                Customer customer = new Customer();
                customer.setName(name);
                customer.setEmail(name + "@gmail.com");
                 customerRepository.save(customer);

            });
            customerRepository.findAll().forEach(cust->{
                CurrentAccount currentAccount= new CurrentAccount();
                currentAccount.setId(UUID.randomUUID().toString());
                currentAccount.setBalance(Math.random()*90000);
                currentAccount.setCreateAt(new Date());
                currentAccount.setStatus(AccountStatuts.CREATED);
                currentAccount.setCustomer(cust);
                currentAccount.setOverDraft(5800);
                bankAccountRepository.save(currentAccount);

                SavingAccount savingAccount= new SavingAccount();
                savingAccount.setId(UUID.randomUUID().toString());
                savingAccount.setBalance(Math.random()*90000);
                savingAccount.setCreateAt(new Date());
                savingAccount.setStatus(AccountStatuts.CREATED);
                savingAccount.setCustomer(cust);
                savingAccount.setInterestRate(5.5);
                bankAccountRepository.save(savingAccount);
            });
            bankAccountRepository.findAll().forEach(acc->{
                for (int i =0;i<10;i++) {
                    AccountOperation accountOperation = new AccountOperation();
                    accountOperation.setOperationDate(new Date());
                    accountOperation.setAmount(Math.random() * 12000);
                    accountOperation.setType(Math.random() > 0.5 ? OperationType.DEBIT : OperationType.CREDIT);
                    accountOperation.setBankAccount(acc);
                    accountOperationRepository.save(accountOperation);
                }


            });
        };
    }
*/
}
