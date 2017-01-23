import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandler;

public class Main {

    public static void main (String args []) throws Exception {
        Server server = new Server(8088);

        ContextHandler context = new ContextHandler();
        context.setContextPath("/api");
        context.setHandler(new BusRoutesHandler());
        server.setHandler(context);

        server.start();

        server.join();
    }
}
