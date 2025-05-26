package side.side.dao;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface MusicDao {
    public String GetMusic(int id);
    public int Upload(MultipartFile file, String filename) throws IOException;
}
