package shop.mtcoding.mybatisdto.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter @Setter
public class BoardJoinUserDtoV3 {
    private Integer id;
    private String title;
    private String content;
    private UserDto user;
    private Timestamp createdAt;

    @Getter @Setter
    public static class UserDto {
        private Integer id;
        private String username;
        private String password;
        private String email;
        private Timestamp createdAt;
    }
}
