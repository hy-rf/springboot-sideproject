package side.side.dao;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface MusicDao {
    String GetMusic(int id);
    int Upload(MultipartFile file, String filename) throws IOException;
}
