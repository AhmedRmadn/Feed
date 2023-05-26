package com.feed.feed.commands;


import com.feed.feed.dbo.request.CategoryRequest;
import com.feed.feed.dbo.request.HomePageRequest;
import com.feed.feed.dbo.request.Request;
import com.feed.feed.dbo.response.CategoryResponse;
import com.feed.feed.dbo.response.Response;
import com.feed.feed.model.redis.category_data;
import com.feed.feed.repository.redis.categories_repository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
@Getter
@Setter
@RequiredArgsConstructor
public class CategoryCommand implements Command{
    private final categories_repository CR;

    @Override
    public CategoryResponse execute(Request request) {
        CategoryRequest requestCast = (CategoryRequest) request;
        CategoryResponse response = new CategoryResponse();
        response.setCategoryId(requestCast.getCategoryId());
        Optional<category_data> posts =  CR.findById(requestCast.getCategoryId());
        if(posts.isPresent()){
            response.setPosts(posts.get());
        }
        return response;
    }
}
