package adapterpattern;

import app2dapi.App2D;
import app2dapi.Device;
import app2dapi.graphics.Canvas;

/**
 *
 * @author PeterBoss
 */
public class PetersAdapter implements App2D {
    
    private PetersApp app;

    public PetersAdapter(PetersApp app) {
        this.app = app;
    }
    
    @Override
    public boolean showMouseCursor() {
        return false;
    }

    @Override
    public boolean initialize(Device device) {
        app.init(device);
        return true;
    }

    @Override
    public boolean update(double time) {
        return true;
    }

    @Override
    public void draw(Canvas canvas) {
        app.draw(canvas);
    }

    @Override
    public void destroy() {
        
    }

}
