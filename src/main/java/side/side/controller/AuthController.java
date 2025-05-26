package side.side.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import side.side.dto.AuthRequest;

public class AuthController {

    @PostMapping
    public ResponseEntity<String> Login(@RequestBody AuthRequest request){
        String n = request.getUsername();
        String p = request.getPassword();
        return ResponseEntity.ok("User registered successfully" + String.format("n: %s, p: %s.", n, p));
    }
}
