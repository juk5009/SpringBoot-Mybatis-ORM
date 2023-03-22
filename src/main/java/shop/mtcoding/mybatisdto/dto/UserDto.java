package shop.mtcoding.mybatisdto.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class UserDto {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private Timestamp createdAt;
}
