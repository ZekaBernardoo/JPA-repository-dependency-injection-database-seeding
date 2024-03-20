package com.educ.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educ.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
