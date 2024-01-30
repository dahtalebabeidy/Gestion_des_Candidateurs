package model;

import java.util.ArrayList;
import java.util.List;

public class AOManagement {
	private static List<AO> aoList = new ArrayList<>();
	
	public static List<AO> getAllAOs() {
        return aoList;
    }

    // Method to check if AO with a given ID exists
    public static boolean isAOPresent(String aoId) {
        for (AO ao : aoList) {
            if (ao.getId().equals(aoId)) {
                return true;
            }
        }
        return false;
    }

    // Method to extend AO deadline
    public static void extendAODeadline(String aoId, String newDeadline) {
        for (AO ao : aoList) {
            if (ao.getId().equals(aoId)) {
                // Update the deadline for the matching AO
                ao.setDeadline(newDeadline);
                return;
            }
        }
    }

    // Other methods to add, remove, or retrieve AO data as needed

    // Example method to initialize AO data for testing
    public static void initializeAOData() {
        aoList.add(new AO("AO001", "2024-02-28"));
        aoList.add(new AO("AO002", "2024-03-15"));
        // Add more AO data as needed
    }
}
