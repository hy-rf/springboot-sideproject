package side.side.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class AlbumController {

    /**
     * Get album by id
     * @return
     */
    @GetMapping("/album/{id}")
    public ResponseEntity<String> Album(@PathVariable int id){
        return new ResponseEntity<>("", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * Get sorted and filtered albums
     * @return
     */
    @GetMapping("/album")
    public ResponseEntity<String> Albums(@RequestParam(required = false) String name){
        return new ResponseEntity<>("", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * Create new album
     * @return
     */
    @PostMapping("/album")
    public ResponseEntity<String> CreateAlbum(){
        return new ResponseEntity<>("", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * Update album by id
     * @return
     */
    @PutMapping("/album/{id}")
    public ResponseEntity<String> UpdateAlbum(@PathVariable int id){
        return new ResponseEntity<>("", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * Delete album by id
     * @return
     */
    @DeleteMapping("/album/{id}")
    public ResponseEntity<String> DeleteAlbum(@PathVariable int id){
        return new ResponseEntity<>("", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
