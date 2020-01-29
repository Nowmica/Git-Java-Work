package com.taskmanagement.repository;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.taskmanagement.model.Todo;

public interface TodoRepository extends JpaRepository<Todo,Long>
{
	List<Todo> findByUserName(String user);
	
}



