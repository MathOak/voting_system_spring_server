package com.votingsystem.modules.candidate.model;

import java.util.UUID;

public class Candidate {
    private UUID id;
    private String name;
    private String party;

    public Candidate() {}

    public Candidate(UUID id, String name, String party) {
        this.id = id;
        this.name = name;
        this.party = party;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }
}
