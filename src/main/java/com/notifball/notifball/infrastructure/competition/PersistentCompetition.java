package com.notifball.notifball.infrastructure.competition;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

@Table(value = "competitions")
public class PersistentCompetition {
    @Id
    private final String id;

    @Column(value = "external_id")
    private final String externalId;
    private final String name;
    private final String code;
    private final String level;
    private final String country;

    @Column(value = "start_date")
    private final LocalDate startDate;

    @Column(value = "end_date")
    private final LocalDate endDate;

    @Column(value = "current_matchday")
    private final String currentMatchday;

    @Column(value = "season_counter")
    private final int seasonCounter;

    public PersistentCompetition(String id,
                                 String externalId,
                                 String name,
                                 String code,
                                 int seasonCounter,
                                 String level,
                                 String country,
                                 LocalDate startDate,
                                 LocalDate endDate,
                                 String currentMatchday) {
        this.id = id;
        this.externalId = externalId;
        this.name = name;
        this.code = code;
        this.seasonCounter = seasonCounter;
        this.level = level;
        this.country = country;
        this.startDate = startDate;
        this.endDate = endDate;
        this.currentMatchday = currentMatchday;
    }
}
