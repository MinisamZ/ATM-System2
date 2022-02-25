package com.example.ATM.System.service;

import com.example.ATM.System.repository.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {
    private final BankAccountRepository bankAccountRepository;

    @Autowired
    public BankService(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }
}
