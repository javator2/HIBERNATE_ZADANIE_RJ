package hibernate;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {

    @Id
    private int category_id;

    @ManyToMany(mappedBy = "category")
     Set<Film> film;

    public Category(int category_id) {
        this.category_id =category_id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public Set<Film> getFilm() {
        return film;
    }

    public void setFilm(Set<Film> film) {
        this.film = film;
    }
}
