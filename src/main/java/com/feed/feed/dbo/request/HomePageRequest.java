package com.feed.feed.dbo.request;


import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
@RequiredArgsConstructor
public class HomePageRequest extends Request{
    private String userId;
}
