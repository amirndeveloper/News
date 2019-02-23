package ir.amirmohammadnoori.model;

import ir.amirmohammadnoori.db.SQLService;

import java.util.List;

public class NewsDaoImp implements NewDao{

    private SQLService sqlService;

    public NewsDaoImp() {

        sqlService = new SQLService();
    }

    public synchronized boolean create(News news) {
        return sqlService.create(news);
    }

    public synchronized boolean update(News news) {
        return sqlService.update(news);
    }

    public synchronized boolean delete(News news) {
        return sqlService.delete(news);
    }

    public synchronized News get(long newsID) {

        List result =  sqlService.getObjectsBySpecialColumn(new News(),"id",newsID);
        if (result.isEmpty())
            return null;
        else
            return (News) result.get(0);
    }
}
