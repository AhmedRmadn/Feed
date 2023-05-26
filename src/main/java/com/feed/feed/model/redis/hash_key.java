package com.feed.feed.model.redis;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class hash_key implements Serializable {
    String hash_key;
}
