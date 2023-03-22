package shop.mtcoding.mybatisdto.model.board;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter @Setter
public class Board {
    private Integer id;
    private String title;
    private String content;
    private int userId;
    private Timestamp createdAt;
}
