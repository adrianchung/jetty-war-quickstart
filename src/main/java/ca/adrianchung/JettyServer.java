package ca.adrianchung;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

/**
 * A simple jetty server that runs war files.
 */
public class JettyServer
{
    public static void main(String[] args) throws Exception
    {
        Server server = new Server(8080);

        WebAppContext webapp = new WebAppContext();
        webapp.setContextPath("/");
        webapp.setWar("path/to/war");

        server.setHandler(webapp);

        server.start();
        server.join();
    }
}
