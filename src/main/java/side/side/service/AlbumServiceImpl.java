package side.side.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import side.side.dao.AlbumDao;
import side.side.dto.AlbumDto;

import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService {

    @Autowired
    AlbumDao albumDao;

    @Override
    public List<AlbumDto> getAlbums(String name, String sortBy) {
        return albumDao.albums(name, sortBy);
    }
}