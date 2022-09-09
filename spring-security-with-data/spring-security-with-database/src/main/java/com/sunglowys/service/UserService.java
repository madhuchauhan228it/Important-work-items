package com.sunglowys.service;

import com.sunglowys.domain.User;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User save(User user);

    User update(User user);

    List<User> findAll(Pageable pageable);

    Optional<User> findOne(Long id);

    void delete(Long id);
}
