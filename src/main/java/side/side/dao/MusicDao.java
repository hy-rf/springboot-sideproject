package side.side.dao;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class MusicDao {
    public String getMusic(int id){
        String sql = "SELECT * from Music WHERE id = :id";
        return "success";
    }
}
