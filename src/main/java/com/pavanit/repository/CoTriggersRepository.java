package com.pavanit.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pavanit.entity.CoTriggersEntity;

@Repository
public interface CoTriggersRepository extends JpaRepository<CoTriggersEntity, Serializable> {
	
	public List<CoTriggersEntity> findByTriggerStatus(String triggerStatus);

}