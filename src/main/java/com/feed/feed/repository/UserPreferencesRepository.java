package com.feed.feed.repository;



import com.feed.feed.model.UserPreferences;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface UserPreferencesRepository extends CassandraRepository<UserPreferences, Integer> {
}
