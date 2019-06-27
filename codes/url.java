import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * @author Patrick Szalewicz <info@fachinformatiker.app>
 */

public class url {

    public static void main(String[] args) throws IOException {
        String fachi = "https://www.hs-bremen.de/internet/de/hsb/struktur/mitarbeiter/hmosemann/";
        URL url = new URL(fachi);

        // open the url stream, wrap it an a few "readers"
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

        // write the output to stdout
        String line;
        while ((line = reader.readLine()) != null)
        {
            System.out.println(line);
        }

        // close our reader
        reader.close();
    }
}