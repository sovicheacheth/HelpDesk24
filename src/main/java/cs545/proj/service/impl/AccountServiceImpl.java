package cs545.proj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cs545.proj.domain.Account;
import cs545.proj.repository.AccountRepository;
import cs545.proj.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	AccountRepository accountRepo;

	@Override
	public void saveAccount(Account acc) {
		accountRepo.save(acc);
		
	}

	@Override
	public Account getAccount(String username) {

		 	return accountRepo.findOne(username);
	}


	
	
	

}
