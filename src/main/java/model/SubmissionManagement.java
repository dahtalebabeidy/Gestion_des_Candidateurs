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
}
