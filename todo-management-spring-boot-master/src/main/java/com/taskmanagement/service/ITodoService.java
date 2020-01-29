package com.taskmanagement.service;

import java.util.Date;

import java.util.List;
import java.util.Optional;

import com.taskmanagement.model.Todo;

public interface ITodoService {

	List<Todo> getTodosByUser(String user);

	Optional<Todo> getTodoById(long id);

	void updateTodo(Todo todo);

	void addTodo(String title,String name, String desc, Date targetDate, String assignedTo,String status);
	void deleteTodo(long id);
	
	void saveTodo(Todo todo);

}