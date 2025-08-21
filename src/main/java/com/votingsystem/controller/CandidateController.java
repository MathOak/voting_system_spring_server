package com.votingsystem.controller;

import com.votingsystem.model.Candidate;
import com.votingsystem.service.CandidateService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/candidates")
public class CandidateController {
    private CandidateService candidateService = new CandidateService();

    @GetMapping
    public List<Candidate> getAllCandidates() {
        return candidateService.getAllCandidates();
    }

    @PostMapping
    public void addCandidate(@RequestBody Candidate candidate) {
        candidateService.addCandidate(candidate);
    }
}
