package com.hameem.accounts.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("auditAwareImpl")
public class AuditAwareImpl implements AuditorAware<String> {
// test
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("Hameem Y");
    }
}
