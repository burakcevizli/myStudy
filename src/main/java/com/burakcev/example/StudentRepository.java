package com.burakcev.example;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findAllByFirstnameContaining(String firstname);
}
