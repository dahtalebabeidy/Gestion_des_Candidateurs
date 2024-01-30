package model;

public class Submission {
    private String aoId;
    private String nom;
    private String adresse;
    private String tel;
    private double montant;
    private String dateSoumission;
    private String nomProjet;
    private String client;
    private double montantReference;
    private String dateRealisation;
    private String proposal;

    public Submission(String aoId, String nom, String adresse, String tel,
                      double montant, String dateSoumission, String nomProjet, String client,
                      double montantReference, String dateRealisation, String proposal) {
        this.aoId = aoId;
        this.nom = nom;
        this.adresse = adresse;
        this.tel = tel;
        this.montant = montant;
        this.dateSoumission = dateSoumission;
        this.nomProjet = nomProjet;
        this.client = client;
        this.montantReference = montantReference;
        this.dateRealisation = dateRealisation;
        this.proposal = proposal;
    }

	public String getAoId() {
		return aoId;
	}

	public void setAoId(String aoId) {
		this.aoId = aoId;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public String getDateSoumission() {
		return dateSoumission;
	}

	public void setDateSoumission(String dateSoumission) {
		this.dateSoumission = dateSoumission;
	}

	public String getNomProjet() {
		return nomProjet;
	}

	public void setNomProjet(String nomProjet) {
		this.nomProjet = nomProjet;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public double getMontantReference() {
		return montantReference;
	}

	public void setMontantReference(double montantReference) {
		this.montantReference = montantReference;
	}

	public String getDateRealisation() {
		return dateRealisation;
	}

	public void setDateRealisation(String dateRealisation) {
		this.dateRealisation = dateRealisation;
	}

	public String getProposal() {
		return proposal;
	}

	public void setProposal(String proposal) {
		this.proposal = proposal;
	}

    
}

