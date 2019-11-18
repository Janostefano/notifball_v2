package com.notifball.notifball.infrastructure;

import org.springframework.data.repository.CrudRepository;

public interface KvRepository extends CrudRepository<PersistentKv, String> {
}
