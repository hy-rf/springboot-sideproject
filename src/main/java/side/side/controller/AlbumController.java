package side.side.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import side.side.dto.AlbumDto;
import side.side.service.AlbumService;

import java.util.List;

@RestController
public class AlbumController {

    @Autowired
    private AlbumService albumService;

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
    public ResponseEntity<List<AlbumDto>> Albums(
            @RequestParam(required = false) String name,
            @RequestParam(required = false, defaultValue = "id") String sortBy) {
        List<AlbumDto> result = albumService.getAlbums(name, sortBy);
        return ResponseEntity.ok(result);
    }

    /**
     * Create new album
     * check login status -> check permission -> verify input -> add album
     * @return
     */
    @PostMapping("/album")
    public ResponseEntity<String> CreateAlbum(){
        return new ResponseEntity<>("", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * Update album by id
     * check login status -> check permission -> check if id exists -> verify input -> update album
     * @return
     */
    @PutMapping("/album/{id}")
    public ResponseEntity<String> UpdateAlbum(@PathVariable int id){
        return new ResponseEntity<>("", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * Delete album by id
     * check login status -> check permission -> check if id exists -> delete album
     * @return
     */
    @DeleteMapping("/album/{id}")
    public ResponseEntity<String> DeleteAlbum(@PathVariable int id){
        return new ResponseEntity<>("", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
