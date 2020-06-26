package io.vepo.writing.mda;

import javax.mvc.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("hello")
public class HelloController {

    @GET
    @Controller
    public String view() {
        return "hello.jsp";
    }

}