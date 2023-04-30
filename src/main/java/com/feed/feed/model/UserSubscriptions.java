package com.feed.feed.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.List;

@Table(value = "user_subscriptions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserSubscriptions {
    @PrimaryKey
    private int userId;

    private List<Integer> topicsId;

    private List<String> topicsName;
}
