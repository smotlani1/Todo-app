package com.example.Todoapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {
    private final TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }
    // Create or update a todo
    public Todo saveOrUpdateTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    // Retrieve all todos
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    // Retrieve a todo by id
    public Optional<Todo> getTodoById(Long id) {
        return todoRepository.findById(id);
    }

    // Delete a todo by id
    public void deleteTodoById(Long id) {
        todoRepository.deleteById(id);
    }
}
