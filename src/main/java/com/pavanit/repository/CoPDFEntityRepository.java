package com.pavanit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pavanit.entity.CoPDFEntity;

@Repository
public interface CoPDFEntityRepository extends JpaRepository<CoPDFEntity, Serializable> {

}
