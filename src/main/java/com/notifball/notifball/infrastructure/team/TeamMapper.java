package com.notifball.notifball.infrastructure.team;

import com.notifball.notifball.api.TeamsDto;
import com.notifball.notifball.domain.team.Team;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TeamMapper {
    public List<Team> toDomain(TeamsDto dto) {
        return dto.getTeams().stream().map(TeamsDto.TeamDto::toDomain).collect(Collectors.toList());
    }

    public List<PersistentTeam> toPersistent(List<Team> teams) {
        return teams.stream().map(PersistentTeam::of).collect(Collectors.toList());
    }
}
