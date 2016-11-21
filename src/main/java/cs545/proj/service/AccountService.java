package cs545.proj.service;

import cs545.proj.domain.Account;

public interface AccountService {

	public void saveAccount(Account acc);
	
	public Account getAccount(String username);
}
