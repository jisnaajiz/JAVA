import java.awt.*;
import java.applet.*;
public class AppletDemo extends Applet
{
public void init()
{
setBackground(Color.yellow);
}
public void paint(Graphics g)
{
g.drawString("welcome",100,200);
g.setColor(Color.green);
}}
/*<applet code =AppletDemo width=400 height=500></applet>*/

