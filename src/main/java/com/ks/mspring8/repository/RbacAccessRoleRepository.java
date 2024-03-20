package com.ks.mspring8.repository;

import com.ks.mspring8.entity.RbacAccessRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface RbacAccessRoleRepository extends JpaRepository<RbacAccessRole, Long>, JpaSpecificationExecutor<RbacAccessRole> {
}
