package com.simplilearn.Authentication.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.simplilearn.Authentication.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

    public Optional<User> findByName(String name);
}