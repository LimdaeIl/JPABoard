package gc.bootboard.service;

import gc.bootboard.domain.type.SearchType;
import gc.bootboard.dto.ArticleDto;
import gc.bootboard.dto.ArticleUpdateDto;
import gc.bootboard.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    @Transactional(readOnly = true)
    public List<ArticleDto> searchArticles(SearchType searchType, String searchKeyword) {
        return List.of();
    }

    @Transactional(readOnly = true)
    public ArticleDto searchArticles(long l) {
        return null;
    }

    public void saveArticle(ArticleDto dto) {
    }

    public void updateArticle(long articleId, ArticleUpdateDto dto) {

    }

    public void deleteArticle(Long articleId) {
    }
}
