package io.jojoExperiments.springbootquickstart.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

import io.jojoExperiments.springbootquickstart.entity.Topics;


public interface TopicRepository extends JpaRepository<Topics, String> { 
	
	//public List<Topics> findAll();
	
	
	//public Optional<Topics> findById(String id);
	
	// @Query("select * from Topics t where t.id = ?1")
	// public List<Topics> getTopicById(String id);
    
}
