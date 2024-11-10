import java.awt.*;

public abstract class  BlackBoxCell
{

    final static int STATUS_BLANK = 0;

    final static int CELL_SIZE = 60;


    public abstract void drawSelf(Graphics g);

    public abstract void setStatus(int s);

    public abstract int getStatus();

    public abstract boolean hasBall();
}
