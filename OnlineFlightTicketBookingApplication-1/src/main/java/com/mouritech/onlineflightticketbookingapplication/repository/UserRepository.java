package com.mouritech.onlineflightticketbookingapplication.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.onlineflightticketbookingapplication.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
//	Optional<User> findByUsernameAndEmail(String username, String email);
	List<User> findByUserId(Long userId);

	

	


}
