package com.rga.internet.store.repositories;

import com.rga.internet.store.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends CrudRepository<User, Long> {
    Optional<User> findOneByPhone(String phone);
    boolean existsByPhone(String phone);
}