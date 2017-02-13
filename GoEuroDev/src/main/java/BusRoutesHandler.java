import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BusRoutesHandler extends AbstractHandler {
    public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        BusRoutesData busRoutesData = new BusRoutesData();

        Integer departure = Integer.parseInt(request.getParameter("dep_sid"));
        Integer arrival = Integer.parseInt(request.getParameter("arr_sid"));
        boolean isDirect = busRoutesData.fetchBusRoutes(departure, arrival);

        response.setContentType("application/json");
        response.setStatus(200);
        baseRequest.setHandled(true);
        response.getWriter().println("{\"dep_sid\":"+departure+",\n" +
                "    \"arr_sid\": "+arrival+",\n" +
                "    \"direct_bus_route\": "+isDirect+"\n" +
                "}");

    }
}
