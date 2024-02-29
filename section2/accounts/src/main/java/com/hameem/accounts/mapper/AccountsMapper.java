package com.hameem.accounts.mapper;

import com.hameem.accounts.dto.AccountsDto;
import com.hameem.accounts.dto.CustomerDto;
import com.hameem.accounts.entity.Accounts;
import com.hameem.accounts.entity.Customer;

public class AccountsMapper {

    public static AccountsDto mapToAccountsDto(AccountsDto accountsDto, Accounts accounts) {
        accountsDto.setAccountType(accounts.getAccountType());
        accountsDto.setBranchAddress(accounts.getBranchAddress());
        accountsDto.setAccountNumber(accounts.getAccountNumber());
        return accountsDto;
    }

    public static Accounts mapToAccounts(Accounts accounts, AccountsDto accountsDto) {
        accounts.setAccountType(accountsDto.getAccountType());
        accounts.setBranchAddress(accountsDto.getBranchAddress());
        accounts.setAccountNumber(accountsDto.getAccountNumber());
        return accounts;
    }

}
