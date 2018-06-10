package adapterpattern;

import app2dapi.Device;
import app2dapi.geometry.G2D;
import app2dapi.graphics.Canvas;
import app2dapi.graphics.ColorFactory;
import app2dapi.input.mouse.MouseListener;
import app2dapi.input.mouse.MouseMovedEvent;
import app2dapi.input.mouse.MousePressedEvent;
import app2dapi.input.mouse.MouseReleasedEvent;
import app2dapi.input.mouse.MouseWheelEvent;

/**
 *
 * @author PeterBoss
 */
public class PetersAppImpl implements PetersApp, MouseListener {

    private G2D g2d;
    private ColorFactory cf;
    private G2D.Point2D mousePos;

    @Override
    public void init(Device device) {
        g2d = device.getGeometry2D();
        cf = device.getScreen().getColorFactory();
        mousePos = g2d.origo();
        device.getMouse().addMouseListener(this);

    }

    @Override
    public void draw(Canvas canvas) {
        canvas.clear(cf.getWhite());
        canvas.setColor(cf.getBlack());
        
        double size = mousePos.x();
        int segments = (int) mousePos.y() / 10;
        
        if (segments < 3) {
            segments = 3;
        }
        
        canvas.drawOutlinedPolygon(g2d.createCircle(g2d.origo(), size, segments));
    }

    @Override
    public void onMouseMoved(MouseMovedEvent e) {
        mousePos = g2d.newPoint2D(e.getX(), e.getY());
    }

    @Override
    public void onMousePressed(MousePressedEvent e) {
    }

    @Override
    public void onMouseReleased(MouseReleasedEvent e) {
    }

    @Override
    public void onMouseWheel(MouseWheelEvent e) {
    }

}
