import java.net.HttpURLConnection;
import java.net.URL;
import java.io.OutputStream;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class FraudDetector {
    private static final String API_URL = "http://127.0.0.1:5000/predict";

    public void processClaimsConcurrently(List<Claim> claims) {
        ExecutorService executor = Executors.newFixedThreadPool(4);

        for (Claim claim : claims) {
            executor.submit(() -> {
                try {
                    boolean isFraud = checkFraud(claim);
                    System.out.println("Claim: " + claim.getClaimId() + ", Fraudulent: " + isFraud);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }
        executor.shutdown();
    }

    private boolean checkFraud(Claim claim) throws Exception {
        URL url = new URL(API_URL);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setDoOutput(true);

        String jsonInput = "{\"claimAmount\": " + claim.getAmount() + "}";
        try (OutputStream os = conn.getOutputStream()) {
            os.write(jsonInput.getBytes());
            os.flush();
        }

        int responseCode = conn.getResponseCode();
        return responseCode == 200; // Placeholder for actual fraud detection logic.
    }
}
