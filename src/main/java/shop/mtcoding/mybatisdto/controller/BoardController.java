package shop.mtcoding.mybatisdto.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import shop.mtcoding.mybatisdto.dto.BoardJoinUserDtoV1;
import shop.mtcoding.mybatisdto.dto.BoardJoinUserDtoV2;
import shop.mtcoding.mybatisdto.dto.BoardJoinUserDtoV3;
import shop.mtcoding.mybatisdto.service.BoardService;

@RequiredArgsConstructor
@RestController
public class BoardController {

    private final BoardService boardService;

    /*
        1. 평평한 DTO로 DB에서 응답받기
        2. 평평한 DTO를 ORM으로 변경하기
     */
    @GetMapping("/board/v1/{id}")
    public ResponseEntity<?> detailV1(@PathVariable Integer id){
        BoardJoinUserDtoV1 ormDto = boardService.게시글상세보기V1(id);
        return ResponseEntity.ok().body(ormDto);
    }

    /*
        1. 외부 ResultMap을 통해 응답 받기
    */
    @GetMapping("/board/v2/{id}")
    public ResponseEntity<?> detailV2(@PathVariable Integer id){
        BoardJoinUserDtoV2 ormDto = boardService.게시글상세보기V2(id);
        return ResponseEntity.ok().body(ormDto);
    }

    /*
        1. 내부 ResultMap을 통해 응답 받기 (최종)
    */
    @GetMapping("/board/v3/{id}")
    public ResponseEntity<?> detailV3(@PathVariable Integer id){
        BoardJoinUserDtoV3 ormDto = boardService.게시글상세보기V3(id);
        return ResponseEntity.ok().body(ormDto);
    }
}
