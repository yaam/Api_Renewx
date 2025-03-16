package com.renewx.repository;

import com.renewx.model.Roles;
import org.springframework.stereotype.Repository;

@Repository

public interface RolesRepo extends JpaRepository<Roles, Integer> {
    
}
