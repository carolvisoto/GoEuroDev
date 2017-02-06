import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BusRoutesHandler extends AbstractHandler {
    public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("application/json");
        String departure = request.getParameter("dep_sid");
        String arrivel = request.getParameter("arr_sid");
        response.setStatus(200);
        response.getWriter().println("{\"dep_sid\":"+departure+", \"arr_sid\": "+arrivel+", \"direct_bus_route\": true}");
        baseRequest.setHandled(true);
    }
}
