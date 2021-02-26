package ru.gb.zettro.springexample.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gb.zettro.springexample.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
