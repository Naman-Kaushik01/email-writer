package com.email.writer.app;

import org.springframework.stereotype.Service;

@Service
public class EmailGeneratorService {
    public String generateEmailReply(EmailRequest emailRequest) {
        //Build the prompt for the AI model
        String prompt = buildPrompt(emailRequest);
        //craft a request
        //Do request and get response
        // Return response
    }

    private String buildPrompt(EmailRequest emailRequest) {
        StringBuilder prompt = new StringBuilder();
        prompt.append("Generate a professional email reply for the following email content. Please don't generate the subject line ");
        return null;
    }
}
