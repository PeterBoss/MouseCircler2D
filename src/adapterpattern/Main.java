package adapterpattern;

import app2dapi.App2D;
import app2dapi.Platform;
import app2dpcimpl.PCPlatformImpl;

/**
 *
 * @author PeterBoss
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Platform p = new PCPlatformImpl();

        App2D b = new PetersAdapter(new PetersAppImpl());
        p.runApplication(b);
    }

}
