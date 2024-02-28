package com.ks.mspring8.repository;

import com.ks.mspring8.entity.UserBackground;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserBackgroundRepository extends JpaRepository<UserBackground, Integer>, JpaSpecificationExecutor<UserBackground> {

}