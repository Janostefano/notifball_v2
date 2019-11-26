package com.notifball.notifball.infrastructure.team;

import com.notifball.notifball.domain.team.Team;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(value = "teams")
public class PersistentTeam {

    @Id
    private String id;

    @Column(value = "external_id")
    private final String externalId;
    private final String name;
    private final String tla;
    private final String address;
    private final String phone;
    private final String website;
    private final String email;
    private final String venue;
    private final int founded;

    @Column(value = "short_name")
    private final String shortName;
    @Column(value = "logo_url")
    private final String logoUrl;

    public PersistentTeam(
            String externalId,
            String name,
            String tla,
            String address,
            String phone,
            String website,
            String email,
            String venue,
            int founded,
            String shortName,
            String logoUrl) {
        this.externalId = externalId;
        this.name = name;
        this.tla = tla;
        this.address = address;
        this.phone = phone;
        this.website = website;
        this.email = email;
        this.venue = venue;
        this.founded = founded;
        this.shortName = shortName;
        this.logoUrl = logoUrl;
    }

    public static PersistentTeam of(Team team) {
        return new PersistentTeam(
                team.getExternalId(),
                team.getName(),
                team.getTla(),
                team.getAddress(),
                team.getPhone(),
                team.getWebsite(),
                team.getEmail(),
                team.getVenue(),
                team.getFounded(),
                team.getShortName(),
                team.getLogoUrl());
    }
}
