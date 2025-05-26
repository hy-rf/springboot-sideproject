package side.side.dao;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;

@Repository
public class MusicDaoImpl implements MusicDao {
    private static final String UPLOAD_DIR = "uploads/";
    public String GetMusic(int id){
        System.out.println("Music Dao called!");
        if(true) return "ok";
        String sql = "SELECT * from Music WHERE id = :id";
        return "success";
    }
    @Override
    public int Upload(MultipartFile file, String filename) throws IOException {
        File uploadDir = new File(UPLOAD_DIR);
        if (!uploadDir.exists() && !uploadDir.mkdirs()) {
            throw new IOException("Could not create upload directory.");
        }

        File destinationFile = new File(uploadDir, filename);

        int chunkCount = 0;

        try (InputStream inputStream = file.getInputStream();
             OutputStream outputStream = new FileOutputStream(destinationFile)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
                chunkCount++;
                System.out.printf("Chunk %d: %d bytes\n", chunkCount, bytesRead);
            }
        }

        return chunkCount;
    }
}
