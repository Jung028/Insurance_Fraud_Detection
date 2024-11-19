import java.util.ArrayList;
import java.util.List;

public class PolicyHolder {
    private String policyHolderId;
    private String name;
    private List<Claim> claims;

    public PolicyHolder(String policyHolderId, String name) {
        this.policyHolderId = policyHolderId;
        this.name = name;
        this.claims = new ArrayList<>();
    }

    public String getPolicyHolderId() {
        return policyHolderId;
    }

    public String getName() {
        return name;
    }

    public List<Claim> getClaims() {
        return claims;
    }

    public void addClaim(Claim claim) {
        this.claims.add(claim);
    }

    @Override
    public String toString() {
        return "PolicyHolder{" +
               "policyHolderId='" + policyHolderId + '\'' +
               ", name='" + name + '\'' +
               ", claims=" + claims +
               '}';
    }
}
