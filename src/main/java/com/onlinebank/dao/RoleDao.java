package com.onlinebank.dao;

import org.springframework.data.repository.CrudRepository;

import com.onlinebank.domain.security.Role;

public interface RoleDao extends CrudRepository<Role, Integer> {
    
    Role findByName(String name);
}
