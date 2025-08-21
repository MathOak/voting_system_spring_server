package com.votingsystem.service;

import com.votingsystem.model.Candidate;
import com.votingsystem.repository.CandidateRepository;
import java.util.List;

public class CandidateService {
    private CandidateRepository candidateRepository = new CandidateRepository();

    public List<Candidate> getAllCandidates() {
        return candidateRepository.findAll();
    }

    public void addCandidate(Candidate candidate) {
        candidateRepository.save(candidate);
    }
}
