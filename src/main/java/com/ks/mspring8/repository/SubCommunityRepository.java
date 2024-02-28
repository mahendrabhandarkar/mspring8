package com.ks.mspring8.repository;

import com.ks.mspring8.entity.SubCommunity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SubCommunityRepository extends JpaRepository<SubCommunity, Integer>, JpaSpecificationExecutor<SubCommunity> {

}