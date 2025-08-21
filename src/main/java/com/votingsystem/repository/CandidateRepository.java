package com.votingsystem.repository;

import com.votingsystem.model.Candidate;
import java.util.ArrayList;
import java.util.List;

public class CandidateRepository {
    private List<Candidate> candidates = new ArrayList<>();

    public List<Candidate> findAll() {
        return candidates;
    }

    public void save(Candidate candidate) {
        candidates.add(candidate);
    }
}
