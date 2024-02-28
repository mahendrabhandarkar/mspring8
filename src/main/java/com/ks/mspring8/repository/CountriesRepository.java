package com.ks.mspring8.repository;

import com.ks.mspring8.entity.Countries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CountriesRepository extends JpaRepository<Countries, Integer>, JpaSpecificationExecutor<Countries> {

}