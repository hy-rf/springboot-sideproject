package side.side.service;

import side.side.dto.AlbumDto;
import java.util.List;

public interface AlbumService {
    List<AlbumDto> getAlbums(String name, String sortBy);
}