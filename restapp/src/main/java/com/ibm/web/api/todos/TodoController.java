package com.ibm.web.api.todos;

import com.ibm.web.api.todos.entity.Todo;
import com.ibm.web.api.todos.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping
    public List<Todo> findAll() {
        return todoService.findAll();
    }
}
