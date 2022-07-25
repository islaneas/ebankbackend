package com.example.ebankbackend.repositories;

import com.example.ebankbackend.entities.AccountOperation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankOperationRepository extends JpaRepository<AccountOperation,Long> {
}
