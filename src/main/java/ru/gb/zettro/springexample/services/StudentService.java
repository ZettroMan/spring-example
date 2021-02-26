package ru.gb.zettro.springexample.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.zettro.springexample.entities.Student;
import ru.gb.zettro.springexample.repositories.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class StudentService {

    private StudentRepository studentRepository;

    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public void saveOrUpdate(Student student) {
        studentRepository.save(student);
    }

    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }

}
