package com.feed.feed.repository;



import com.feed.feed.model.UserSubscriptions;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;


@EnableCassandraRepositories("com.feed.feed.repository")
public interface UserSubscriptionsRepository extends CassandraRepository<UserSubscriptions, Integer> {
}
