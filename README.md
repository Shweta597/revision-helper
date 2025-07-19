# revision-helper

📚 Revision Helper – Chrome Extension + Spring Boot Backend
Revision Helper is a productivity tool designed to help users bookmark and schedule revision of important articles or resources they encounter online. Whether you're studying for exams or learning a new topic, this extension ensures you revisit saved links on scheduled dates to reinforce your learning.

✨ Features
🧠 Save any article/resource link with a custom revision date

🔁 Backend scheduler triggers daily to send notifications/reminders

🔗 Link your Chrome Extension to store revision data in a central DB

📦 REST API built with Spring Boot + PostgreSQL

📅 Configurable scheduling using @Scheduled cron expressions

🔧 Tech Stack
Layer	Technology
Frontend	Chrome Extension (HTML, JS)
Backend	Spring Boot (Java)
Database	PostgreSQL
Build Tool	Maven
API Type	REST API
Deployment	Localhost / Cloud-ready

🚀 How to Run Locally
✅ Prerequisites
Java 17+

Maven

PostgreSQL installed and a DB created (e.g., revision_helper)

Node.js (optional, if enhancing extension)

🔧 1. Clone the Repository

git clone https://github.com/Shweta597/revision-helper.git
cd revision-helper


🛠️ 2. Backend Setup (Spring Boot)

✅ Configure DB in application.properties (not pushed to Git):
spring.datasource.url=jdbc:postgresql://localhost:5432/revision_helper
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

✅ Run the App
cd backend
mvn clean install
mvn spring-boot:run
Backend will be available at: http://localhost:8080

🌐 3. Frontend (Chrome Extension)
✅ Load Extension in Chrome:
Go to chrome://extensions/

Enable Developer Mode

Click Load Unpacked

Select the chrome-extension/ folder

You can now click the extension icon and save links with revision dates.

🕒 Cron Job Scheduler (Backend)
The backend has a cron job that runs daily to check if any saved link's revision date is today.

To schedule it for 8 PM daily, use:

java
Copy
Edit
@Scheduled(cron = "0 0 20 * * *") // runs at 8 PM
🛡️ Security Best Practices
Ensure the following are not tracked in Git:

application.properties

Local secrets or API keys

Add to .gitignore:
backend/src/main/resources/application.properties

📬 Contribution
Feel free to fork this repo and raise a PR! For major changes, please open an issue first.

👩‍💻 Author
Shweta Shaw
