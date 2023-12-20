package gc.bootboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


/**
 * /articles	GET	게시판 페이지
 * /articles/{article-id}	GET	게시글 페이지
 * /articles/search	GET	게시판 검색 전용 페이지
 * /articles/search-hashtag	GET	게시판 해시태그 검색 전용 페이지
 */

@Controller
@RequestMapping("/articles")
public class ArticleController {

    @GetMapping
    public String articles(ModelMap map) {
        map.addAttribute("articles", List.of());
        return "articles/index";
    }

}
