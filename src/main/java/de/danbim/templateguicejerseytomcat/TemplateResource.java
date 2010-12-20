/*
 * ----------------------------------------------------------------------------
 * "THE BEER-WARE LICENSE" (Revision 42):
 * <daniel@bimschas.com> wrote this file. As long as you retain this notice you
 * can do whatever you want with this stuff. If we meet some day, and you think
 * this stuff is worth it, you can buy me a beer in return Daniel Bimschas
 * ----------------------------------------------------------------------------
 */
package de.danbim.templateguicejerseytomcat;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class TemplateResource {

    @GET
    @Produces("text/plain")
    @Path("/hello")
    public String getHello() {
        return "Hello World";
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Path("/{param}")
    public TemplateMessage getTemplateMessage(@PathParam("param") String param) {
        return new TemplateMessage(param);
    }

}
