# 🤖 Embabel Shell Demo: Meeting Summarizer Agent

Transform your Spring Boot applications with **intelligent, goal-driven AI agents** using the **Embabel Framework**. This repository demonstrates how to build a complete meeting summarization system that automatically extracts key points and action items from transcripts with sophisticated GOAP-based planning.

📖 **Complete Guide**: For detailed explanations and GOAP algorithm walkthrough, read our comprehensive tutorial.<br>
👉 [**Embabel Framework: Create Goal-Driven AI Agents for the JVM**](https://bootcamptoprod.com/embabel-framework-guide/)

🎥 **Video Tutorial**: Prefer hands-on learning? Watch our step-by-step implementation guide.<br>
👉 YouTube Tutorial - [**Build Goal-Driven Agents with Embabel Framework | Stop Manual AI Orchestration!**](https://youtu.be/kL2x8OeMt8w)

<p align="center">
  <a href="https://youtu.be/kL2x8OeMt8w">
    <img src="https://img.youtube.com/vi/kL2x8OeMt8w/0.jpg" alt="Build Goal-Driven Agents with Embabel Framework | Stop Manual AI Orchestration!" />
  </a>
</p>

<p align="center">
  ▶️ <a href="https://youtu.be/kL2x8OeMt8w">Watch on YouTube</a>
</p>

---

## ✨ What This Project Demonstrates

This application showcases a **complete intelligent agent system** with:

- **Automatic meeting summarization** using AI-powered analysis
- **Key points extraction** highlighting main discussion topics and decisions
- **Action items identification** with responsible persons and deadlines
- **GOAP-based planning** that automatically orchestrates multi-step workflows
- **Shell-based interface** for interactive agent testing and development

---

## 📋 Prerequisites

Before running this application, ensure you have:

- **Java 21** or higher
- **Google Gemini API Key** (free tier available at [Google AI Studio](https://aistudio.google.com/))

---

## 🚀 Quick Start

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/BootcampToProd/embabel-shell-demo-meeting-summarizer-agent.git
cd embabel-shell-demo-meeting-summarizer-agent
```

### 2️⃣ Configure API Key
Provide your Google Gemini API key inside the environment variable
```bash
GOOGLE_GEMINI_API_KEY={YOUR_GOOGLE_GEMINI_API_KEY}
```

### 3️⃣ Build the Project
```bash
mvn clean install
```

### 4️⃣ Run the Application
```bash
mvn spring-boot:run
```

---

## 💡 Usage Examples

Once the application starts, you'll see an interactive shell prompt. Paste your meeting transcript and request a summary:

```bash
starwars> execute "[paste your transcript here]"
```

### 📝 Example Input
```
Hey everyone, quick updates from my side — the Spring Boot migration for the user service is done and all regression tests have passed, only the performance testing is pending, which Priya is handling. I’ve started benchmarking with JMeter and initial numbers look good, around 200ms average response time, but I still need the DevOps team to set up the staging environment for load testing. On the payments side, the gateway integration is mostly done, though we’re still seeing some API timeouts in the sandbox, so I’ll follow up with the vendor today. The audit logging refactor is still pending and I’ll pick it up next sprint. The UI redesign for the dashboard is almost done — around 80% complete — but we’re still waiting for the backend to confirm the new response fields for the analytics endpoint. Let’s try to close all open issues by Friday so we can push the release as planned.
```

### 📊 Example Output
```
{
  "keyPoints" : [ "Spring Boot migration for the user service is complete, performance testing pending (Priya).", "Benchmarking with JMeter shows 200ms average response time; DevOps team needed for staging environment setup for load testing.", "Payment gateway integration is mostly done, but API timeouts are occurring in the sandbox; follow-up with vendor required.", "Audit logging refactor is pending; to be picked up next sprint.", "UI redesign for the dashboard is 80% complete; waiting for backend confirmation on new response fields for analytics endpoint.", "Target: Resolve all open issues by Friday to release as planned." ],
  "actionItems" : [ "Priya to handle performance testing for the user service Spring Boot migration.", "DevOps team to set up the staging environment for load testing.", "Follow up with the vendor about API timeouts in the payments sandbox (today).", "Pick up the audit logging refactor next sprint.", "Backend to confirm the new response fields for the analytics endpoint (by Friday).", "Close all open issues (by Friday)." ]
}
```