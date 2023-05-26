package com.feed.feed.dbo.response;


import com.feed.feed.model.redis.category_data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
@RequiredArgsConstructor
public class CategoryResponse implements Response{
    private String categoryId;
    private category_data posts;
}
