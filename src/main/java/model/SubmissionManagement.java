package model;

import java.util.ArrayList;
import java.util.List;

public class SubmissionManagement {
	private static List<Submission> submissionList = new ArrayList<>();

    public static void addSubmission(Submission submission) {
        submissionList.add(submission);
    }

    public static List<Submission> getAllSubmissions() {
        return new ArrayList<>(submissionList);
    }
    
    public static Submission findSubmission(String aoId, String submitterName) {
        for (Submission submission : submissionList) {
            if (submission.getAoId().equals(aoId) && submission.getNom().equals(submitterName)) {
                return submission;
            }
        }
        return null;
    }
    
    public static List<Submission> getSubmissionsByUser(String username) {
        List<Submission> userSubmissions = new ArrayList<>();
        for (Submission submission : submissionList) {
            // Assuming User class has a getUsername method
            if (submission.getNom().equals(username)) {
                userSubmissions.add(submission);
            }
        }
        return userSubmissions;
    }
}
