package com.bootcamptoprod.config;

import com.embabel.agent.api.models.OpenAiCompatibleModelFactory;
import com.embabel.common.ai.model.Llm;
import com.embabel.common.ai.model.PerTokenPricingModel;
import io.micrometer.observation.ObservationRegistry;
import org.jetbrains.annotations.NotNull;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class ConfigureGoogleGeminiModels extends OpenAiCompatibleModelFactory {

    public ConfigureGoogleGeminiModels(@NotNull ObservationRegistry observationRegistry) {
        super(
                "https://generativelanguage.googleapis.com",
                "{YOUR_GOOGLE_GEMINI_API_KEY}",
                "/v1beta/openai/chat/completions",
                null,
                observationRegistry
        );
    }

    @Bean
    Llm gemini2Flash() {
        return openAiCompatibleLlm(
                "gemini-2.0-flash-exp",
                new PerTokenPricingModel(0, 0),
                "Google Gemini",
                LocalDate.of(2025, 1, 1)
        );
    }
}
