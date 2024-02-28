package com.ks.mspring8.repository;

import com.ks.mspring8.entity.UserEdu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserEduRepository extends JpaRepository<UserEdu, Integer>, JpaSpecificationExecutor<UserEdu> {

}