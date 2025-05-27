package side.side.dao;

import java.util.List;
import side.side.dto.AlbumDto;

public interface AlbumDao {
    List<AlbumDto> albums(String name, String sortBy);
}
