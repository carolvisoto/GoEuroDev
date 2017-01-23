import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BusRoutesHandler extends AbstractHandler {
    public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("application/json");
        response.setStatus(200);
        response.getWriter().println("{\"dep_sid\": 3, \"arr_sid\": 6, \"direct_bus_route\": true}");
        baseRequest.setHandled(true);
    }
}
