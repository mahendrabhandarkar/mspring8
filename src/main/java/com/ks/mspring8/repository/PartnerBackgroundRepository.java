package com.ks.mspring8.repository;

import com.ks.mspring8.entity.PartnerBackground;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PartnerBackgroundRepository extends JpaRepository<PartnerBackground, Integer>, JpaSpecificationExecutor<PartnerBackground> {

}