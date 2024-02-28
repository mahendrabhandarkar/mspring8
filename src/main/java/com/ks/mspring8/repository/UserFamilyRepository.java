package com.ks.mspring8.repository;

import com.ks.mspring8.entity.UserFamily;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserFamilyRepository extends JpaRepository<UserFamily, Integer>, JpaSpecificationExecutor<UserFamily> {

}