package com.learning.reminder.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.reminder.entities.Task;
import com.learning.reminder.repositories.TaskRepository;
import com.learning.reminder.services.TaskService;

@Service
public class TaskServiceImpl implements TaskService {
	
	@Autowired
	private TaskRepository taskRepo;

	@Override
	public List<Task> getAllTask() {
		List<Task> tasks = taskRepo.findAll();
		return tasks;
	}
	
}
