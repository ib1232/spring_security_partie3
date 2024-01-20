package com.example.spring_security_part3;

import com.example.spring_security_part3.dto.LoginRequestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class controller {
    @GetMapping("/hello")
    public ResponseEntity<String> get(){
        return ResponseEntity.ok("Hello from the other side");
    }
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequestDTO request) {
        UsernamePasswordAuthenticationToken token = new
        UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword());
        authenticationManager.authenticate(token);
    }
}
