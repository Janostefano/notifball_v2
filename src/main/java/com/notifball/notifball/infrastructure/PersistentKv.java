package com.notifball.notifball.infrastructure;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("kv")
public class PersistentKv {

    @Id
    private String id;
    private final String key;
    private final String value;

    public PersistentKv(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

}
