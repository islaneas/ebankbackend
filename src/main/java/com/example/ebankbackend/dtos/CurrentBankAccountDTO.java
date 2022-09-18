package com.example.ebankbackend.dtos;

import com.example.ebankbackend.enums.AccountStatuts;
import lombok.Data;

import java.util.Date;

@Data
public class CurrentBankAccountDTO extends BankAccountDTO{
    private String id;
    private double balance;
    private Date createdAt;
    private AccountStatuts status;
    private CustomerDTO customerDTO;
    private double overDraft;
}
