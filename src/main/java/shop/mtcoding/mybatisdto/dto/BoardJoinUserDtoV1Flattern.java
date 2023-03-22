package shop.mtcoding.mybatisdto.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter @Setter @ToString
public class BoardJoinUserDtoV1Flattern {
    private Integer id;
    private String title;
    private String content;
    private Timestamp createdAt;
    private Integer userId;
    private String userUsername;
    private String userPassword;
    private String userEmail;
    private Timestamp userCreatedAt;
}
