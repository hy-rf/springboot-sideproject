package side.side.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import side.side.dao.MusicDao;

import java.util.Arrays;

@Service
public class MusicServiceImpl implements MusicService {

    @Autowired
    MusicDao musicDao;

    public void UploadMusic(MultipartFile file) {
        int result = 0;
        try {
            result = musicDao.Upload(file, "test name");
        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        System.out.println("Upload Success!" + result);
    }
}
