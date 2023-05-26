package com.feed.feed.dbo.response;

import com.feed.feed.model.redis.topic_data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
@RequiredArgsConstructor
public class TopicResponse implements Response{
    private String topicId;
    private topic_data posts;
}
