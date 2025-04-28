package com.insurance.statefarm_insurance.repository;

import com.insurance.statefarm_insurance.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
