package com.notifball.notifball.infrastructure.team;

import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<PersistentTeam, String> {
}
