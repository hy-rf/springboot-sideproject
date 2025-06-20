package side.side.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.util.StringUtils;
import side.side.service.MusicService;

@Controller
public class MusicController {

    @Autowired
    MusicService musicService;

    @GetMapping("/")
    public String Index() {
        return "Music";
    }

	@GetMapping("/upload")
    public String ShowUploadPage() {
        return "MusicUpload";
    }

	@PostMapping("/upload")
	public ResponseEntity<String> uploadMusic(@RequestParam("file") MultipartFile file){
		if (file.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please upload a music file.");
        }
        musicService.UploadMusic(file);
        String originalFilename = StringUtils.cleanPath(Objects.requireNonNull(file.getOriginalFilename()));
        return ResponseEntity.ok("File uploaded successfully! " + originalFilename);
	}
	
}
