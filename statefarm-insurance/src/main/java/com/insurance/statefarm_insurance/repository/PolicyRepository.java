package com.insurance.statefarm_insurance.repository;

import com.insurance.statefarm_insurance.entity.Policy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Long> {

}
