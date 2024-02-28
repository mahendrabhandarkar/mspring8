package com.ks.mspring8.repository;

import com.ks.mspring8.entity.Height;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface HeightRepository extends JpaRepository<Height, Integer>, JpaSpecificationExecutor<Height> {

}