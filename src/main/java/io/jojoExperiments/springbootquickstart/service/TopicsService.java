package io.jojoExperiments.springbootquickstart.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.jojoExperiments.springbootquickstart.entity.Topics;
import io.jojoExperiments.springbootquickstart.repository.TopicRepository;

@Service
public class TopicsService {

	@Autowired
	TopicRepository topicRepo;
	
	// private List<Topics> allTopics = new ArrayList <> (Arrays.asList(
	// 		new Topics ("13001" , "SpringFramework design" , "Spring"),
	// 		new Topics ("13002" , "JavaScript Basics" , "JS"),
	// 		new Topics ("13003" , "Object Oriented Language - Java" , "Java"),
	// 		new Topics ("13004" , "Database design" , "DB")
	// 		));
	
	public List<Topics> returnAllTopics(){
		
		System.out.println("Return All");
		return topicRepo.findAll();
		
	//return allTopics;
	}
	
	public Optional<Topics> returnSingleTopic(String id) {
	
		System.out.println("by Id");
		return topicRepo.findById(id);
		//return topicRepo.getTopicById(id).get(0);
		//return	allTopics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void insertTopic(Topics topic) {
		topicRepo.save(topic);
		//allTopics.add(topic);
		
	}

	public void alterTopic(String id , Topics topic) {
		topicRepo.save(topic);
		// for (int i=0 ; i < allTopics.size() ; i++ ) {
		// 	Topics t = allTopics.get(i);
		// 	if (t.getId().equals(id)) {
		// 		allTopics.set(i, topic);
		// 		return;
		// 	}
		// }
		
	}

	public void removeTopic(String id) {
		topicRepo.deleteById(id);
		//allTopics.removeIf(t -> t.getId().equals(id));
		
	}
}
