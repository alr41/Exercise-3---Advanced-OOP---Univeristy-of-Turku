class MortgageLoan {
    private double principal;
    private int loanTerm; 

    public MortgageLoan(double principal, int loanTerm) {
        // Conditions to make sure the data is valid
        if (principal <= 0) {
            throw new IllegalArgumentException("Principal must be positive.");
        }
        if (loanTerm <= 0 || loanTerm > 300) {
            throw new IllegalArgumentException("Loan term must be between 1 and 300");
        }

        // Objects are created only if the conditons are passed
        this.principal = principal;
        this.loanTerm = loanTerm;
    }

    public double monthlyInstallment() {
        // Formula: monthly_installment = principal / loan_term + principal / 240
        return principal / loanTerm + principal /240.0;
    }

    // Get methods
    public double getPrincipal() {
        return principal;
    }

    public int getLoanTerm() {
        return loanTerm;
    }
}