package com.ks.mspring8.repository;

import com.ks.mspring8.entity.PartnerEdu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PartnerEduRepository extends JpaRepository<PartnerEdu, Integer>, JpaSpecificationExecutor<PartnerEdu> {

}