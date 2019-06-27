import java.io.IOException;
import java.net.Socket;

import static java.lang.System.out;

/**
 * @author Patrick Szalewicz <info@fachinformatiker.app>
 */
public class socketinfo {

    public static void main(String[] args) throws IOException {
        Socket s = new Socket( "www.die-partei.de", 80 );
        out.println( s.getKeepAlive() );           // false
        out.println( s.getLocalAddress() );        // /195.37.111.215
        out.println( s.getLocalPort() );           // 56339
        out.println( s.getLocalSocketAddress() );  // /195.37.111.215:56339
        out.println( s.getOOBInline() );           // false
        out.println( s.getPort() );                // 80
        out.println( s.getRemoteSocketAddress() ); // www.die-partei.de/85.13.155.63:80
        out.println( s.getReuseAddress() );        // false
        out.println( s.getReceiveBufferSize() );   // 65536
        out.println( s.getSendBufferSize() );      // 65536
        out.println( s.getSoLinger() );            // –1
        out.println( s.getTcpNoDelay() );          // false
        out.println( s.getTrafficClass() );        // 0
    }
}
