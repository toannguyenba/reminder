package com.learning.reminder.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.reminder.entities.Task;
import com.learning.reminder.services.TaskService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class TaskController {

	@Autowired
	private TaskService taskService;
	
	@GetMapping("/tasks")
	public List<Task> getAllTask() {
		List<Task> tasks = taskService.getAllTask();
		return tasks;
	}
	
	
}
