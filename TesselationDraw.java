import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.util.List;
//import org.apache.commons.math3.geometry.euclidean.threed.Plane;
//import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;


/*
 *  This is a simple example program for STL files viewing with basic affine transforms
 *  @author Tomasz Tatarski 2021
 */
public class TesselationDraw extends JFrame {
    List<Triangle> list;
    String name;

    public TesselationDraw(List<Triangle> dataArray,String nameD){

        super("Simple STL viewer");
        this.list = dataArray;
         this.name = nameD;

        setSize(950,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public void paint(Graphics graphics){
        super.paint(graphics);
        int rat=77;
        int xOfs=425;
        int yOfs=350;
        int zOfs=250;
        int X=0;
        int Y=11;
        int Z=0;

        Graphics2D g2D = (Graphics2D) graphics;
        g2D.setColor(Color.RED);

        Stroke stroke1 = new BasicStroke(1f);

        g2D.drawString("STL file view  "+ name,20,40);
        g2D.setColor(Color.DARK_GRAY);
        Stroke stroke = new BasicStroke(0.5f);
        g2D.setStroke(stroke);

        int cnt=0;
        for (Triangle t: list
             ) {
            cnt++;


            g2D.drawLine(xOfs+(int)(t.xc-0.6*t.zc)*rat, Y+yOfs+(int)(1*t.yc - 0.7*t.zc)*rat, xOfs+(int)(1*t.xa-0.7*t.za)*rat, Y+yOfs+(int)(1*t.ya - 0.7*t.za)*rat);
            //(x,y,z) -> (Ox + 1*x - .7*z, Oy + 1*y - .7*z)
            g2D.drawLine(xOfs+(int)(t.xa-0.6*t.za)*rat, Y+yOfs+(int)(1*t.ya - 0.6*t.za)*rat, xOfs+(int)(1*t.xb-0.7*t.zb)*rat, Y+yOfs+(int)(1*t.yb - 0.7*t.zb)*rat);
            g2D.drawLine(xOfs+(int)(t.xb-0.6*t.zb)*rat, Y+yOfs+(int)(1*t.yb - 0.6*t.zb)*rat, xOfs+(int)(1*t.xc-0.7*t.zc)*rat, Y+yOfs+(int)(1*t.yc - 0.7*t.zc)*rat);


        }
        g2D.drawString("number of triangles : "+ cnt,720,40);

    }
}
