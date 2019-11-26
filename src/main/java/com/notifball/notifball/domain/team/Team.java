package com.notifball.notifball.domain.team;


public class Team {
    private final String externalId;
    private final String name;
    private final String shortName;
    private final String logoUrl;
    private final String tla;
    private final String address;
    private final String phone;
    private final String website;
    private final String email;
    private final String venue;
    private final int founded;


    public Team(String externalId,
                String name,
                String shortName,
                String logoUrl,
                String tla,
                String address,
                String phone,
                String website,
                String email,
                String venue,
                int founded) {
        this.externalId = externalId;
        this.name = name;
        this.shortName = shortName;
        this.logoUrl = logoUrl;
        this.tla = tla;
        this.address = address;
        this.phone = phone;
        this.website = website;
        this.email = email;
        this.venue = venue;
        this.founded = founded;
    }

    public String getWebsite() {
        return website;
    }

    public String getVenue() {
        return venue;
    }

    public String getTla() {
        return tla;
    }

    public String getShortName() {
        return shortName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public int getFounded() {
        return founded;
    }

    public String getName() {
        return name;
    }

    public String getExternalId() {
        return externalId;
    }

    public String getLogoUrl() {
        return logoUrl;
    }
}
