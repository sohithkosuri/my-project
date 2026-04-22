package Loan_service.service;

import Loan_service.model.LoanApplication;
import Loan_service.repository.LoanApplicationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoanApplicationService {

    private final LoanApplicationRepository repository;

    public LoanApplicationService(LoanApplicationRepository repository) {
        this.repository = repository;
    }

    public LoanApplication createLoanApplication(LoanApplication loanApplication) {
        loanApplication.setStatus("PENDING");
        return repository.save(loanApplication);
    }

    public List<LoanApplication> getAllLoanApplications() {
        return repository.findAll();
    }

    public Optional<LoanApplication> getLoanApplicationById(Long id) {
        return repository.findById(id);
    }

    public LoanApplication updateLoanStatus(Long id, String status) {
        LoanApplication loanApplication = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Loan not found"));

        loanApplication.setStatus(status);
        return repository.save(loanApplication);
    }
}
