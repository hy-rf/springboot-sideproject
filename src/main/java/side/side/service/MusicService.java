package side.side.service;

import org.springframework.web.multipart.MultipartFile;

public interface MusicService {
    void UploadMusic(MultipartFile file);
}
