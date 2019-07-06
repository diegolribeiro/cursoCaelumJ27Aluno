package br.com.alura.forum.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.output.TopicBriefOutputDto;
import br.com.alura.forum.model.Category;
import br.com.alura.forum.model.Course;
import br.com.alura.forum.model.User;
import br.com.alura.forum.model.topic.domain.Topic;

@RestController
public class TopicController {
	
	@GetMapping("/api/topics")
	public List<TopicBriefOutputDto> listTopics(){
		Category subCategory = new Category("Java", new Category("Programação"));
		Course course = new Course("Java e JSF", subCategory);
		Topic topic = new Topic("Problemas com JSF", 
				"Erro ao fazer a conversão da data",
				new User("Fulano","fulano@gmail.com","123456"),course);
		
		List<Topic> topics = List.of(topic,topic,topic);
		return TopicBriefOutputDto.listFromTopics(topics);
	}

}
