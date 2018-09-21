package hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Text {

    @Id
    private int film_id;

    public Text(int film_id) {
        this.film_id = film_id;
    }

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }
}
