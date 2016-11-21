package cs545.proj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cs545.proj.domain.Account;

public interface AccountRepository extends JpaRepository<Account, String>{

}
