package com.learning.reminder.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.learning.reminder.entities.Task;

@Service
public interface TaskService {
	public List<Task> getAllTask();
}
