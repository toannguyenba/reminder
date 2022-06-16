package com.learning.reminder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.reminder.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {

}
