package com.votingsystem.modules.candidate.repository;

import com.votingsystem.modules.candidate.model.Candidate;
import com.votingsystem.modules.candidate.interfaces.CrudInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CandidateRepository implements CrudInterface<Candidate> {
    private List<Candidate> candidates = new ArrayList<>();

    @Override
    public List<Candidate> findAll() {
        return candidates;
    }

    @Override
    public Candidate findById(UUID id) {
        return candidates.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void save(Candidate candidate) {
        candidates.add(candidate);
    }

    @Override
    public void update(UUID id, Candidate candidate) {
        for (int i = 0; i < candidates.size(); i++) {
            if (candidates.get(i).getId().equals(id)) {
                candidates.set(i, candidate);
                return;
            }
        }
    }

    @Override
    public void delete(UUID id) {
        candidates.removeIf(c -> c.getId().equals(id));
    }
}
