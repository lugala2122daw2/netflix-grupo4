package com.netflix.Recommend;

import com.netflix.entity.Title;
import com.netflix.repository.TitleRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Recommend {
    private final TitleRepository titleRepository;

    public Recommend(TitleRepository titleRepository) {this.titleRepository = titleRepository;}

    @GetMapping("/api/recommend/best")
    Object best(@RequestParam(defaultValue =  "10") Integer top) {
        return titleRepository.findTopRating(PageRequest.of(0,top));
    }

    @GetMapping("/api/recommend/category/{id}")
    Object top(@RequestParam(defaultValue =  "10") Integer top, @PathVariable Integer id) {
        return titleRepository.findTopRatingCategory(PageRequest.of(0,top),id);
    }

}
