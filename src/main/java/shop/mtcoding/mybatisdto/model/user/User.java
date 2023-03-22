package shop.mtcoding.mybatisdto.model.user;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter @Setter
public class User {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private Timestamp createdAt;
}
