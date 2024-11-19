import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PolicyHolder holder = new PolicyHolder("PH123", "Alice");
        holder.addClaim(new Claim("C001", 1000, holder.getPolicyHolderId()));
        holder.addClaim(new Claim("C002", 5000, holder.getPolicyHolderId()));

        FraudDetector fraudDetector = new FraudDetector();
        fraudDetector.processClaimsConcurrently(holder.getClaims());
    }
}
