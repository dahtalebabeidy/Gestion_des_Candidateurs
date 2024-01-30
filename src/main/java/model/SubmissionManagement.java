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
}
