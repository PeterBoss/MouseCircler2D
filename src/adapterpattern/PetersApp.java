package adapterpattern;

import app2dapi.Device;
import app2dapi.graphics.Canvas;

/**
 *
 * @author PeterBoss
 */
public interface PetersApp {
    public void init(Device device);
    public void draw(Canvas canvas);
}
