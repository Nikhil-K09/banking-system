package com.example.banking.service;

import com.example.banking.dto.AccountDto;

import java.util.List;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(long Id);

    AccountDto deposit(long Id, double balance);

    AccountDto withdraw(long Id, double amount);

    List<AccountDto> getAllAccounts();

    void deleteAccount(long Id);
}
