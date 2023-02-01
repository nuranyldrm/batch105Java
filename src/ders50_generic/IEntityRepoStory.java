package ders50_generic;

public interface IEntityRepoStory <T> {
    void add(T entity);
    void delete(T entity);
    void update(T entity);
}
