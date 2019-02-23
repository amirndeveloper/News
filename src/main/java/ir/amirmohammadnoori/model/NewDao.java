package ir.amirmohammadnoori.model;

public interface NewDao {

    public boolean create(News news);
    public boolean update(News news0);
    public boolean delete(News news);
    public News get(long newsID);
}
