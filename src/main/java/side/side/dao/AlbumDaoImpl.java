package side.side.dao;

import org.springframework.stereotype.Service;
import side.side.dto.AlbumDto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class AlbumDaoImpl implements AlbumDao {

    private static final List<AlbumDto> albums = new ArrayList<>();
    static {
        albums.add(new AlbumDto(1, "Album A", "Artist X", 2020));
        albums.add(new AlbumDto(2, "Album B", "Artist Y", 2019));
        albums.add(new AlbumDto(3, "Album C", "Artist X", 2021));
    }

    @Override
    public List<AlbumDto> albums(String name, String sortBy) {
        // Implementation logic to fetch albums from the database
        // This is a placeholder implementation
        return albums.stream()
                .filter(a -> name == null || a.getName().toLowerCase().contains(name.toLowerCase()))
                .sorted(getComparator(sortBy))
                .collect(Collectors.toList());
    }

    private Comparator<AlbumDto> getComparator(String sortBy) {
        if ("year".equalsIgnoreCase(sortBy)) {
            return Comparator.comparingInt(AlbumDto::getYear);
        } else if ("name".equalsIgnoreCase(sortBy)) {
            return Comparator.comparing(AlbumDto::getName);
        }
        return Comparator.comparingInt(AlbumDto::getId);
    }
}
