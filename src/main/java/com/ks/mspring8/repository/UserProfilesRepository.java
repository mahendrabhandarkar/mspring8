package com.ks.mspring8.repository;

import com.ks.mspring8.entity.UserProfiles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserProfilesRepository extends JpaRepository<UserProfiles, Integer>, JpaSpecificationExecutor<UserProfiles> {

}