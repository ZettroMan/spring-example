package ru.gb.zettro.springexample.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class MainController {

    @GetMapping("/")
    public String homePage() {
        return "Home page";
    }

    @GetMapping("/authenticated")
    public String securedPage(Principal principal) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        return "Page for authenticated users. Current user name is " + principal.getName() +
                ". Authorities: " + authentication.getAuthorities();
    }

    @GetMapping("/authenticated/common")
    public String commonPage() {
        return "Common authenticated users page";
    }

    @GetMapping("/authenticated/for_teachers")
    public String teachersPage() {
        return "Page for teachers";
    }

    @GetMapping("/authenticated/for_rectors")
    public String rectorsPage() {
        return "Page for rectors";
    }

    @GetMapping("/authenticated/for_students")
    public String studentsPage() {
        return "Page for students";
    }

    @GetMapping("/authenticated/for_entrants")
    public String abiturientsPage() {
        return "Page for entrants";
    }

    @GetMapping("/authenticated/for_admins")
    public String developersPage() {
        return "Page for admins";
    }

}


