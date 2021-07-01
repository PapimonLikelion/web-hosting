package webhosting.webhosting.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HostingDao {
    private final JdbcTemplate jdbcTemplate;

    public HostingDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void saveFile(String userId, String filePath, String fileType) {
        String sql = "INSERT INTO USERFILE (user_id, file_path, file_type) values (?, ?, ?)";
        jdbcTemplate.update(sql, userId, filePath, fileType);
    }

    public String getHtmlFilePath(String userId) {
        String sql = "SELECT file_path FROM USERFILE where user_id = (?) and file_type = (?)";
        return jdbcTemplate.queryForObject(sql, String.class, userId, "html");
    }
}
