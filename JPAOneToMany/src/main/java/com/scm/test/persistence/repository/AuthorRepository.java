package com.scm.test.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scm.test.persistence.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

}
