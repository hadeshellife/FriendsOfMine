package friendsofmine.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Hades on 4/1/17.
 */
@Entity
public class Activite {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(min =1, max = 256)
    private String titre;

    private String descriptif;

    @NotNull
    @ManyToOne
    private Utilisateur responsable;

    public Activite(){}

    public Activite(String t, String d){
        this.titre = t;
        this.descriptif = d;
    }

    public Activite(String t, String d, Utilisateur resp){
        this.titre = t;
        this.descriptif = d;
        this.responsable = resp;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescriptif() {
        return descriptif;
    }

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
