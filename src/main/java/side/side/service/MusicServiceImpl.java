package side.side.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import side.side.dao.MusicDao;

@Service
public class MusicServiceImpl implements MusicService {

    @Autowired
    MusicDao musicDao;

    public void UploadMusic(MultipartFile file){
        try {
        musicDao.Upload(file, "test name");
        } catch (Exception ignored){

        }
        System.out.println("Upload Success!");
    }
}
