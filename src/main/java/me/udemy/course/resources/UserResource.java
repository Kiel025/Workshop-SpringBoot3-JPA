package me.udemy.course.resources;

import me.udemy.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "kiel", "kiel02505@gmail.com", "999999999", "password");
        return ResponseEntity.ok().body(u);
    }
}
