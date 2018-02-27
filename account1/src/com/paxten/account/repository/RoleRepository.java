package com.paxten.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paxten.account.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
