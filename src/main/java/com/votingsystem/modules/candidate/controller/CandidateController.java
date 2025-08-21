package com.votingsystem.modules.candidate.controller;

import com.votingsystem.modules.candidate.model.Candidate;
import com.votingsystem.modules.candidate.service.CandidateService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/candidates")
public class CandidateController {
    private CandidateService candidateService = new CandidateService();

    @GetMapping
    public List<Candidate> getAllCandidates() {
        return candidateService.getAllCandidates();
    }

    @GetMapping("/{id}")
    public Candidate getCandidateById(@PathVariable UUID id) {
        return candidateService.getCandidateById(id);
    }

    @PostMapping
    public void addCandidate(@RequestBody Candidate candidate) {
        candidateService.addCandidate(candidate);
    }

    @PutMapping("/{id}")
    public void updateCandidate(@PathVariable UUID id, @RequestBody Candidate candidate) {
        candidateService.updateCandidate(id, candidate);
    }

    @DeleteMapping("/{id}")
    public void deleteCandidate(@PathVariable UUID id) {
        candidateService.deleteCandidate(id);
    }
}
