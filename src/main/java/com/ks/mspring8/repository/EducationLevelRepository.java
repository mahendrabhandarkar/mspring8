package com.ks.mspring8.repository;

import com.ks.mspring8.entity.EducationLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EducationLevelRepository extends JpaRepository<EducationLevel, Integer>, JpaSpecificationExecutor<EducationLevel> {

}