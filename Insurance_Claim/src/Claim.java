public class Claim {
    private String claimId;
    private double claimAmount;
    private String policyHolderId;

    public Claim(String claimId, double claimAmount, String policyHolderId) {
        this.claimId = claimId;
        this.claimAmount = claimAmount;
        this.policyHolderId = policyHolderId;
    }

    public String getClaimId() {
        return claimId;
    }

    public double getClaimAmount() {
        return claimAmount;
    }

    public String getPolicyHolderId() {
        return policyHolderId;
    }

    @Override
    public String toString() {
        return "Claim{" +
               "claimId='" + claimId + '\'' +
               ", claimAmount=" + claimAmount +
               ", policyHolderId='" + policyHolderId + '\'' +
               '}';
    }
}
