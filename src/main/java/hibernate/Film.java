package hibernate;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Film {

    @Id
    private int film_id;
    private int language_id;
    private int original_language_id;

    @OneToMany(mappedBy = "film")
    private Set<Inventory> inventories;

    @ManyToOne
    @JoinColumn(name = "language_id", insertable = false, updatable = false)
    private Language language;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Category> category;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Actor> actor;


    public Film(int film_id, int language_id, int original_language_id) {
        this.film_id = film_id;
        this.language_id = language_id;
        this.original_language_id = original_language_id;
    }

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public int getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(int language_id) {
        this.language_id = language_id;
    }

    public int getOriginal_language_id() {
        return original_language_id;
    }

    public void setOriginal_language_id(int original_language_id) {
        this.original_language_id = original_language_id;
    }

    public Set<Inventory> getInventories() {
        return inventories;
    }

    public void setInventories(Set<Inventory> inventories) {
        this.inventories = inventories;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Set<Category> getCategory() {
        return category;
    }

    public void setCategory(Set<Category> category) {
        this.category = category;
    }

    public Set<Actor> getActor() {
        return actor;
    }

    public void setActor(Set<Actor> actor) {
        this.actor = actor;
    }
}
