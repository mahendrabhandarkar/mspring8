package com.ks.mspring8.repository;

import com.ks.mspring8.entity.UserSearch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserSearchRepository extends JpaRepository<UserSearch, Integer>, JpaSpecificationExecutor<UserSearch> {

}