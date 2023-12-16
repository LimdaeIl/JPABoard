package gc.bootboard.domain;

import java.time.LocalDateTime;

public class ArticleComment {

    private Long id;
    private String content; // 내용
    private Article article; // 게시글 (ID)
    private String title; // 제목
    private String hashtag; // 해시태그

    private LocalDateTime createdAt; // 생성일자
    private String createdBy; // 생성자
    private LocalDateTime modifiedAt; // 수정일자
    private String modifiedBy; // 수정자
}
