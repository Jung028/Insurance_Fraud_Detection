# Mini Insurance Management System  

This project is a complete implementation of a **Mini Insurance Management System** that combines backend development, machine learning, database management, and concurrent programming. The system manages insurance claims and user profiles while detecting potential fraud in claims using a logistic regression model.

---

## **Features**
### **1. Java Backend**
- Implements object-oriented programming (OOP) principles for clean and modular code.
- Handles business logic for managing insurance claims and user profiles.
- Utilizes Java's **ExecutorService** for concurrent processing to handle multiple tasks efficiently.

### **2. Python Model**
- A REST API built using **Flask** integrates a logistic regression model for fraud detection.
- The fraud detection model analyzes claim data and predicts potential fraudulent claims.

### **3. Database**
- **PostgreSQL** is used to manage:
  - Insurance claim data.
  - User profiles, including policyholders and administrators.
- Ensures data integrity and supports complex queries for report generation and claim validation.

### **4. Concurrent Programming**
- The system leverages **Java ExecutorService** for parallel processing, ensuring faster task execution and better resource utilization.
- Tasks include claim validation, fraud prediction API calls, and data synchronization with the database.

---

## **Technologies Used**
- **Java**: Backend development with OOP and concurrent programming.
- **Python (Flask)**: REST API for the logistic regression model.
- **PostgreSQL**: Database for storing and managing application data.
- **Logistic Regression Model**: Predicts fraudulent claims based on provided features.

---

## **Setup Instructions**

### **1. Prerequisites**
- Java Development Kit (JDK) installed.
- Python 3.x installed with `Flask` and `scikit-learn` libraries.
- PostgreSQL database installed and configured.

### **2. Clone the Repository**
```bash
git clone https://github.com/Jung028/Insurance_Fraud_Detection.git
cd Insurance_Fraud_Detection
```

### **3. Set Up the Java Backend**
- Import the Java project into your preferred IDE (e.g., IntelliJ IDEA, Eclipse).
- Configure the PostgreSQL database connection in the application.properties file.
- Run the backend application.


### **4. Set Up the Python Flask API** 
Navigate to the python_api folder:
```bash
cd python_api
```
Install required Python libraries:
```bash
pip install -r requirements.txt
```
Start the Flask server:
```bash
python app.py
```



### **5. Database Initialization**
- Create a PostgreSQL database (e.g., insurance_management).
- Run the SQL script in database/setup.sql to initialize the schema and insert sample data.


### **6. Test the Application**
- Use the backend application to create claims, manage profiles, and trigger fraud detection.
- Test fraud detection by sending claim data to the REST API.

### **Usage**
1. Claim Management: Submit and process insurance claims.
2. User Profiles: Manage policyholder and administrator accounts.
3. Fraud Detection: Analyze claims using the logistic regression model to detect fraud.

### **Future Improvements**
1. Add a user-friendly frontend (e.g., React or Angular) for better user interaction.
2. Enhance the fraud detection model with advanced algorithms like Random Forest or Gradient Boosting.
3. Implement role-based access control for administrators and policyholders.
4. Add Docker support for easier deployment.

### **Contributors**
Jung028: Project design and development.

### **License**
This project is licensed under the MIT License.

Feel free to explore, use, and modify the project!



This markdown will format correctly on GitHub. Simply paste it into the `README.md` file in your repository!
