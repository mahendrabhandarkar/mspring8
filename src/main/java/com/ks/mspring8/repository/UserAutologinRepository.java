package com.ks.mspring8.repository;

import com.ks.mspring8.entity.UserAutologin;
import com.ks.mspring8.entity.ids.UserAutologinId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAutologinRepository extends JpaRepository<UserAutologin, UserAutologinId>, JpaSpecificationExecutor<UserAutologin> {

}