package com.pavanit.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pavanit.entity.CoPDFEntity;
import com.pavanit.entity.EligibilityDetailsEntity;

@Repository
public interface EDDetailsRepository extends JpaRepository<EligibilityDetailsEntity, Serializable> {
	
public List<EligibilityDetailsEntity> findByCaseNum(Integer caseNum);

}


