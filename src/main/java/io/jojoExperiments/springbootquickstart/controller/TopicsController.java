package io.jojoExperiments.springbootquickstart.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.jojoExperiments.springbootquickstart.entity.Topics;
import io.jojoExperiments.springbootquickstart.service.TopicsService;

@RestController
@RequestMapping("topics")
public class TopicsController {

	@Autowired
	private TopicsService topicsService;

	@GetMapping
	public List<Topics> getAllTopics() {
		return topicsService.returnAllTopics();
	}

	@RequestMapping("/{id}")
	public Optional<Topics> getTopic(@PathVariable String id) {
		return topicsService.returnSingleTopic(id);
	}
	
	@RequestMapping (method = RequestMethod.POST , value = "")
	public void addTopic(@RequestBody Topics topic) {
		topicsService.insertTopic(topic);
	}
	
	@RequestMapping (method = RequestMethod.PUT , value = "/{id}")
	public void updateTopic(@PathVariable String id , @RequestBody Topics topic) {
		topicsService.alterTopic(id ,topic);
	}
	
	@RequestMapping (method = RequestMethod.DELETE , value = "/{id}")
	public void deleteTopic(@PathVariable String id ) {
		topicsService.removeTopic(id);
	}
}
