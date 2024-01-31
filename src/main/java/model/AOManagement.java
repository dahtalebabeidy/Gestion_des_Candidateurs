package model;

import java.util.ArrayList;
import java.util.List;

public class AOManagement {
	private static List<AO> aoList = new ArrayList<>();
	
	public static List<AO> getAllAOs() {
        return aoList;
    }
	
	public static void addAO(AO ao) {
        aoList.add(ao);
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
    
    public static AO getAOById(String aoId) {
        for (AO ao : aoList) {
            if (ao.getId().equals(aoId)) {
                return ao;
            }
        }
        return null;
    }
    
    public static void setProposalForAO(String aoId, String proposal) {
        AO ao = getAOById(aoId);
        if (ao != null) {
            ao.setProposal(proposal);
        }
    }

    public static void extendAODeadline(String aoId, String newDeadline) {
        for (AO ao : aoList) {
            if (ao.getId().equals(aoId)) {
                ao.setDeadline(newDeadline);
                return;
            }
        }
    }

    public static void initializeAOData() {
        aoList.add(new AO("AO001", "2024-02-28", "Sample proposal for AO001"));
        aoList.add(new AO("AO002", "2024-03-15", "Sample proposal for AO002"));
    }
}
