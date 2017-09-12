package com.onlinebank.service;

import java.security.Principal;

import com.onlinebank.domain.PrimaryAccount;
import com.onlinebank.domain.SavingsAccount;

public interface AccountService {
	
    PrimaryAccount createPrimaryAccount();
    
    SavingsAccount createSavingsAccount();
    
    void deposit(String accountType, double amount, Principal principal);
    
    void withdraw(String accountType, double amount, Principal principal);
    
}
