from flask import Flask, request, jsonify
import pickle
import numpy as np

app = Flask(__name__)

# Load model
with open("fraud_model.pkl", "rb") as f:
    model = pickle.load(f)

@app.route('/predict', methods=['POST'])
def predict():
    data = request.get_json()
    claim_amount = np.array([[data['claimAmount']]])
    prediction = model.predict(claim_amount)
    return jsonify({"fraudulent": bool(prediction[0])})

if __name__ == "__main__":
    app.run(debug=True)
