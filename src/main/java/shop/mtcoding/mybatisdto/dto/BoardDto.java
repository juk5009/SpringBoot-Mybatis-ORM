package shop.mtcoding.mybatisdto.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter @Setter
public class BoardDto {
    private Integer id;
    private String title;
    private String content;
    //private UserDto user;
    private Timestamp createdAt;
}
