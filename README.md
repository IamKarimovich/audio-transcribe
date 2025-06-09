# 🎙️ Audio‑Transcribe

**Audio‑Transcribe** is a Spring Boot + Spring AI service that delivers high-quality audio transcription via OpenAI’s Whisper or any compatible Speech‑to‑Text provider. Perfect for converting audio files into accurate text through a clean, easy-to-use REST API.

---

## 🚀 Features

- **📥 REST Upload Endpoint** – POST audio (WAV, MP3, etc.) and receive a transcription JSON payload.
- **🔗 Provider Agnostic** – Out-of-the-box support for OpenAi via Spring AI's abstraction.
- **🟢 UI**- It is possible to add audio using ui in web

---

## 💡 Why This Matters

Transcription forms the basis of many AI-powered applications: meeting summarization, voice-enabled search, podcast metadata extraction, and more. With **Audio‑Transcribe**, you get a robust, reusable foundation for infusing voice into any Spring Boot app—powered by Spring AI and Whisper 📢.

---

## ⚙️ Quick Start

### Prerequisites

- Java 17+  
- Maven 3.8+  
- Spring Boot  
- API key for provider (e.g., OpenAI Whisper, Azure Speech)

### Setup

1. **Clone the repo**  
   ```bash
   git clone https://github.com/IamKarimovich/audio-transcribe.git
   cd audio-transcribe
   ```
2. **Add the OpenAI Whisper starter to pom.xml**
  ```bash
<dependency>
  <groupId>org.springframework.ai</groupId>
  <artifactId>spring-ai-starter-model-openai</artifactId>
  <version>1.0.0-M7</version>
</dependency>
```
3. Configure your API key (e.g.,```application.properties``` in  or environment):
```
spring.ai.models.openai.api-key=${OPENAI_API_KEY}
```

# 🎤 How to Use
POST via REST
```
POST /api/v1/transcribe
Content-Type: multipart/form-data

Form Data:
file = @your-audio-file.wav

```

# 🙌 Credits
Inspired by Spring AI demo that links browser audio capture to Whisper via Spring MVC 


Audio‑Transcribe turns spoken words into actionable text — seamlessly integrated, provider-agnostic, and built for the Spring Boot world. Enjoy building!






