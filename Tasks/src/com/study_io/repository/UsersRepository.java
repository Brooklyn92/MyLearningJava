package com.study_io.repository;

import java.util.List;

public interface UsersRepository {
    List<User> findAll();
    void save(User user);
    List<User> findByAge(int age);
    List<User> findAllIsWorker();
}
