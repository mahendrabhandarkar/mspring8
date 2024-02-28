package com.ks.mspring8.repository;

import com.ks.mspring8.entity.CiSessions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CiSessionsRepository extends JpaRepository<CiSessions, String>, JpaSpecificationExecutor<CiSessions> {

}