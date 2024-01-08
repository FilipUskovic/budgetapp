package com.BugetApp.bugetApp.repositories;

import com.BugetApp.bugetApp.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

            List<Category> findAll();
           // List<Category>findCategoryBy(Integer );


}
