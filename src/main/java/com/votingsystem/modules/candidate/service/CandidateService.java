package com.votingsystem.modules.candidate.service;

import com.votingsystem.modules.candidate.model.Candidate;
import com.votingsystem.modules.candidate.repository.CandidateRepository;
import java.util.List;
import java.util.UUID;

public class CandidateService {
    private CandidateRepository candidateRepository = new CandidateRepository();

    public List<Candidate> getAllCandidates() {
        return candidateRepository.findAll();
    }

    public Candidate getCandidateById(UUID id) {
        return candidateRepository.findById(id);
    }

    public void addCandidate(Candidate candidate) {
        candidateRepository.save(candidate);
    }

    public void updateCandidate(UUID id, Candidate candidate) {
        candidateRepository.update(id, candidate);
    }

    public void deleteCandidate(UUID id) {
        candidateRepository.delete(id);
    }
}
