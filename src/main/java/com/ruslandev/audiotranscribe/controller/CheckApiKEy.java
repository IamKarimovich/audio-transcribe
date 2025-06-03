

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;

@Value("${spring.ai.openai.api-key}")
private String apiKey;

@PostConstruct
public void checkApiKEy() {
    System.out.println("Resolved OpenAI API key: " + apiKey); // Be cautious with printing secrets
}

public void main() {

    checkApiKEy();

}
