-- Here, you can execute any CQL commands, e.g.

CREATE KEYSPACE newsFeed_keyspace  
  WITH replication = {'class': 'SimpleStrategy', 'replication_factor': 3}
  AND durable_writes = true;

CREATE TABLE newsFeed_keyspace.user_category (
  userId int PRIMARY KEY,
  categoryCount map<int, int>
);


