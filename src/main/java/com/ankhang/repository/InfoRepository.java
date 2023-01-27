package com.ankhang.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.ankhang.entities.Info;

@Repository
public interface InfoRepository extends CrudRepository<Info, Long> {
	@Query("Select e from Info e where e.infoId = ?1")
	Info findInfoById(Long id);
}
