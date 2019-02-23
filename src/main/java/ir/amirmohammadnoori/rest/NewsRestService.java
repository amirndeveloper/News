package ir.amirmohammadnoori.rest;

import com.google.gson.Gson;
import ir.amirmohammadnoori.model.News;
import ir.amirmohammadnoori.model.NewsDaoImp;
import javassist.bytecode.SignatureAttribute;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/news")
public class NewsRestService {

    Gson gson = new Gson();

    private NewsDaoImp newsDaoImp = new NewsDaoImp();

    @GET
    @Path("/getNews/{param}")
    public synchronized Response readNewsById(@PathParam("param") String id) {
        String output = "Jersey say : ";
        return Response.status(200).entity(output).build();
    }

    @POST
    @Consumes("application/x-www-form-urlencoded")
    @Produces(MediaType.TEXT_PLAIN)
    public  Response createNews(String s) {
        System.out.println("salam");
//        System.out.println("salam");
//        News news = gson.fromJson(json,News.class);
//        boolean result = newsDaoImp.create(news);
        String re;
//        if (result)
//            re = "news successfully added to database";
//        else
//            re=("unsuccessful to add news to database");
        return Response.status(200).entity("asdf").build();
    }

    @GET
    @Path("/getAllNews")
    public synchronized Response getAllNews() {
        List<String> resultsList = new ArrayList<String>();
        return Response.status(200).entity(gson.toJson(resultsList)).build();
    }

    @GET
    @Path("/getAllNews/{param}")
    public synchronized Response deleteNews(@PathParam("param") String id) {
        List<String> resultsList = new ArrayList<String>();
        return Response.status(200).entity(gson.toJson(resultsList)).build();
    }
}
