import com.google.gson.Gson;
import ir.amirmohammadnoori.model.News;

import java.sql.Timestamp;

public class Tesst {
    public static void main(String[] args) {
        News news = new News();

        news.setCountent("salam");

        news.setTitle("hiii");

        news.setTimestamp(new Timestamp(1));

        Gson gson = new Gson();

        System.out.println(gson.toJson(news));
    }
}
