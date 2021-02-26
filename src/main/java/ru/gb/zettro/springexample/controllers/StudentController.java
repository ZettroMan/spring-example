package ru.gb.zettro.springexample.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.gb.zettro.springexample.entities.Student;
import ru.gb.zettro.springexample.exceptions.ResourceNotFoundException;
import ru.gb.zettro.springexample.services.StudentService;

@Controller
@RequestMapping("/students")
@AllArgsConstructor
public class StudentController {
    private StudentService studentService;

    @GetMapping
    public String getAllStudents(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "students";
    }

    @GetMapping("/{id}")
    public String getStudentById(Model model, @PathVariable Long id) {
        model.addAttribute("student", studentService.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student with id=" + id + " not found")));
        return "student";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteById(id);
        return "redirect:/students";
    }

    @GetMapping("/add")
    public String deleteStudent(Model model) {
        model.addAttribute("student", new Student());
        return "student";
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute Student student) {
        studentService.saveOrUpdate(student);
        return "redirect:/students";
    }

}
