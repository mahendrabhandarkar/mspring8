package com.ks.mspring8.repository;

import com.ks.mspring8.entity.PartnerBasic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PartnerBasicRepository extends JpaRepository<PartnerBasic, Integer>, JpaSpecificationExecutor<PartnerBasic> {

}