package com.learning.mgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.mgmt.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User findByEmailId(String emailId);

	User findByUserName(String userName);

}
