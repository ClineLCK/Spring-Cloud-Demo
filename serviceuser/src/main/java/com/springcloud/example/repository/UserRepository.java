package com.springcloud.example.repository;

import com.springcloud.example.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Cline Chen on 2017/5/14.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}