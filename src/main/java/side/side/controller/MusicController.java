package side.side.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.util.StringUtils;

@Controller
public class MusicController {
	
	@GetMapping("/")
    public String showUploadPage() {
        return "MusicUpload";
    }
	
	@PostMapping("/upload")
	public ResponseEntity<String> uploadMusic(@RequestParam("file") MultipartFile file){
		if (file.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please upload a music file.");
        }
		try {
            String originalFilename = StringUtils.cleanPath(file.getOriginalFilename());
            File uploadDir = new File("uploads/");

            // Create the directory if it does not exist
            if (!uploadDir.exists()) {
                boolean created = uploadDir.mkdirs();
                if (!created) {
                    return new ResponseEntity<>("Could not create upload directory.", HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }

            File destinationFile = new File(uploadDir, originalFilename);

            // Save the file
            try (InputStream inputStream = file.getInputStream();
                 OutputStream outputStream = new FileOutputStream(destinationFile)) {

                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
            }

            return ResponseEntity.ok("File uploaded successfully: " + originalFilename);
        } catch (IOException e) {
            return new ResponseEntity<>("File upload failed: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
	}
	
}
