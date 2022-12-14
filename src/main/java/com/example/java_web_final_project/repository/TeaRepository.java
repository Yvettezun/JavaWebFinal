package com.example.java_web_final_project.repository;

import com.example.java_web_final_project.entity.Tea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeaRepository extends JpaRepository<Tea, Integer> {
}
