package br.com.brunovieira.desafiotodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.brunovieira.desafiotodolist.entity.Todo;


public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
