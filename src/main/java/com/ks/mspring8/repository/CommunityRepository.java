package com.ks.mspring8.repository;

import com.ks.mspring8.entity.Community;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CommunityRepository extends JpaRepository<Community, Integer>, JpaSpecificationExecutor<Community> {

}