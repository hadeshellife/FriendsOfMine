package friendsofmine.domain;

import org.hibernate.validator.constraints.Email;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

/**
 * Created by Hades on 4/1/17.
 */
@Entity
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(min = 1, max = 256)
    private String nom;

    @NotNull
    @Size(min = 1, max = 256)
    private String prenom;

    private Date dateNaissance;

    @NotNull
    @Email
    private String email;

    @NotNull
    @Pattern(regexp = "^[MF]{1}$")
    private String sexe;

    public Utilisateur(String n, String p, String e, String s, Date d){
        this.nom = n;
        this.prenom = p;
        this.email = e;
        this.sexe = s;
        this.dateNaissance = d;
    }

    public Utilisateur(String n, String p, String e, String s){
        this.nom = n;
        this.prenom =p;
        this.email = e;
        this.sexe = s;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
}
