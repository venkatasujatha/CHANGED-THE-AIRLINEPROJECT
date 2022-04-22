package com.user.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.user.model.Passenger;
import com.user.model.Ticket;
import com.user.response.ResponseEntity;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> 
{
	@Modifying
	@Transactional
	@Query(value = "select * from passenger order by age", nativeQuery = true)
	public List<Passenger> findByage();
	
	@Modifying
	@Transactional
	@Query(value = "select * from passenger where t_id=? order by age", nativeQuery = true)
	public List<Passenger> searchByTicSort();
	
	
	public List<Passenger> findBytId(int tId);
	@Query(value = "select * from passenger  where t_id=?",nativeQuery = true)
	public List<Passenger> findAllBytId(int tId);
	
	

}
