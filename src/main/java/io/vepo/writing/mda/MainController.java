package io.vepo.writing.mda;

import javax.mvc.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
@Controller
public class MainController {

    @GET
    public String view() {
        return "main.xhtml";
    }

}