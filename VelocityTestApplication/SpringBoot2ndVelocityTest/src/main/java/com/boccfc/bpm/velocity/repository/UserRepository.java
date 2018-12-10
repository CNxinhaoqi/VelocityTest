package com.boccfc.bpm.velocity.repository;


import com.boccfc.bpm.velocity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String>{

}
