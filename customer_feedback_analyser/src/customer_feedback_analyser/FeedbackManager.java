package customer_feedback_analyser;

import java.util.*;
public class FeedbackManager {
    private List<Feedback> feedbackList = new ArrayList<>();

    // Add feedback exactly as entered
    public void addFeedback(String message) {
        feedbackList.add(new Feedback(message));
        System.out.println("✅ Feedback added successfully.");
    }

    // View all feedback
    public void viewFeedbacks() {
        if (feedbackList.isEmpty()) {
            System.out.println("No feedback available.");
            return;
        }
        for (int i = 0; i < feedbackList.size(); i++) {
            System.out.println((i + 1) + ". " + feedbackList.get(i).getMessage());
        }
    }

    // Clean text (manual use only)
    public String cleanText(String text) {
        return text.trim().replaceAll("[^a-zA-Z0-9@.\\s]", "");
    }

    // Mask email and phone
    public String maskSensitive(String text) {
        String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,6}";
        String phoneRegex = "\\b\\d{10}\\b";

        text = text.replaceAll(emailRegex, "[EMAIL]");
        text = text.replaceAll(phoneRegex, "[PHONE]");
        return text;
    }

    // Count keyword occurrences
    public int countKeyword(String keyword) {
        int count = 0;
        for (Feedback fb : feedbackList) {
            count += fb.getMessage().toLowerCase().split("\\b" + keyword.toLowerCase() + "\\b", -1).length - 1;
        }
        return count;
    }

    // Generate feedback summary
    public void generateSummary() {
        int total = feedbackList.size();
        int max = 0, min = Integer.MAX_VALUE;
        int totalWords = 0;

        for (Feedback fb : feedbackList) {
            int wordCount = fb.getMessage().split("\\s+").length;
            totalWords += wordCount;
            max = Math.max(max, wordCount);
            min = Math.min(min, wordCount);
        }

        double avg = total == 0 ? 0 : (double) totalWords / total;
        System.out.println("📊 Feedback Summary:");
        System.out.println("Total Feedbacks: " + total);
        System.out.println("Average Words: " + avg);
        System.out.println("Max Words: " + (total == 0 ? 0 : max));
        System.out.println("Min Words: " + (total == 0 ? 0 : min));
    }

    // Allow Main class to access list directly
    public List<Feedback> getFeedbackList() {
        return feedbackList;
    }
}
