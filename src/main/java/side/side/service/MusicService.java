package side.side.service;

import org.springframework.web.multipart.MultipartFile;

public interface MusicService {
    public void UploadMusic(MultipartFile file);
}
