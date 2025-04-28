package com.insurance.statefarm_insurance.repository;

import com.insurance.statefarm_insurance.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
