package friendsofmine.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Hades on 4/1/17.
 */
public class Activite {
    @NotNull
    @Size(min =1, max = 256)
    private String titre;

    private String description;

    public Activite(String t, String d){
        this.titre = t;
        this.description = d;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
