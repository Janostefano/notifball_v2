package com.notifball.notifball.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.notifball.notifball.domain.team.Team;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamsDto {
    private final List<TeamDto> teams;

    @JsonCreator
    public TeamsDto(@JsonProperty("teams") List<TeamDto> teams) {
        this.teams = teams;
    }

    public List<TeamDto> getTeams() {
        return teams;
    }

    static public class TeamDto {
        private final int id;
        private final String name;
        private final String shortName;
        private final String tla;
        private final String crestUrl;
        private final String address;
        private final String phone;
        private final String website;
        private final String email;
        private final int founded;
        private final String venue;
        private final String clubColors;
        private final String lastUpdated;


        @JsonCreator
        public TeamDto(
                @JsonProperty("id") int id,
                @JsonProperty("name") String name,
                @JsonProperty("shortName") String shortName,
                @JsonProperty("tla") String tla,
                @JsonProperty("crestUrl") String crestUrl,
                @JsonProperty("address") String address,
                @JsonProperty("phone") String phone,
                @JsonProperty("website") String website,
                @JsonProperty("email") String email,
                @JsonProperty("founded") int founded,
                @JsonProperty("venue") String venue,
                @JsonProperty("clubColors") String clubColors,
                @JsonProperty("lastUpdated") String lastUpdated) {
            this.id = id;
            this.name = name;
            this.shortName = shortName;
            this.tla = tla;
            this.crestUrl = crestUrl;
            this.address = address;
            this.phone = phone;
            this.website = website;
            this.email = email;
            this.founded = founded;
            this.venue = venue;
            this.clubColors = clubColors;
            this.lastUpdated = lastUpdated;
        }

        int getId() {
            return id;
        }

        String getName() {
            return name;
        }

        int getFounded() {
            return founded;
        }

        String getAddress() {
            return address;
        }

        String getClubColors() {
            return clubColors;
        }

        String getCrestUrl() {
            return crestUrl;
        }

        String getEmail() {
            return email;
        }

        String getLastUpdated() {
            return lastUpdated;
        }

        String getPhone() {
            return phone;
        }

        String getShortName() {
            return shortName;
        }

        String getTla() {
            return tla;
        }

        String getVenue() {
            return venue;
        }

        String getWebsite() {
            return website;
        }

        public Team toDomain() {
            return new Team(
                    String.valueOf(getId()),
                    getName(),
                    getShortName(),
                    getCrestUrl(),
                    getTla(),
                    getAddress(),
                    getPhone(),
                    getWebsite(),
                    getEmail(),
                    getVenue(),
                    getFounded()
            );
        }
    }
}
