package friendsofmine.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by HadesHellife on 02-Apr-17.
 */
@Entity
public class Inscription {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date dateInscription;

    @NotNull
    @ManyToOne
    private Utilisateur participant;

    @NotNull
    @ManyToOne
    private Activite activite;

    public Inscription(){

    }

    public Inscription(Utilisateur util, Activite act, Date d){
        this.participant = util;
        this.activite = act;
        this.dateInscription = d;
    }

    public Inscription(Utilisateur util, Activite act){
        this.participant = util;
        this.activite = act;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }

    public Utilisateur getParticipant() {
        return participant;
    }

    public void setParticipant(Utilisateur participant) {
        this.participant = participant;
    }

    public Activite getActivite() {
        return activite;
    }

    public void setActivite(Activite activite) {
        this.activite = activite;
    }

    @PrePersist
    public void updateInscriptionDate() {
        if(dateInscription == null)
            setDateInscription(new Date());
    }

}
