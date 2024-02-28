package com.ks.mspring8.repository;

import com.ks.mspring8.entity.Userfolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserfolderRepository extends JpaRepository<Userfolder, Integer>, JpaSpecificationExecutor<Userfolder> {

}