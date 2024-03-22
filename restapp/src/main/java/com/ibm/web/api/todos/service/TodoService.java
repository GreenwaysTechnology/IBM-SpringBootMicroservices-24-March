package com.ibm.web.api.todos.service;

import com.ibm.web.api.todos.entity.Todo;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private List<Todo> todos;

//    @PostConstruct
//    public void init() {
//        todos = List.of(
//                new Todo(1l, 1l, "delectus aut autem", false),
//                new Todo(1l, 2l, "quis ut nam facilis et officia qui", false),
//                new Todo(1l, 3l, "fugiat veniam minus", false),
//                new Todo(1l, 4l, "et porro tempora", true));
//    }

    @Bean
    public CommandLineRunner init() {
        return args -> {
        todos = List.of(
                new Todo(1l, 1l, "delectus aut autem", false),
                new Todo(1l, 2l, "quis ut nam facilis et officia qui", false),
                new Todo(1l, 3l, "fugiat veniam minus", false),
                new Todo(1l, 4l, "et porro tempora", true));
        };
    }

    public List<Todo> findAll() {
        return todos;
    }
}
