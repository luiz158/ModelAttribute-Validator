package models;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.stereotype.Component;

@Component
public class Personne {

	private String nom, prenom;
	
	public Personne() {}
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public String getNom() { return nom; }
	public void setNom(String nom) { this.nom = nom; }
	public String getPrenom() { return prenom; }
	public void setPrenom(String prenom) { this.prenom = prenom; }

	@Override
	public String toString() {
		return new ToStringBuilder(this).append(nom).append(prenom).toString();
	}
	
}