import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Test
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL(
            "http://laughingsquid.com/wp-content/uploads/tumblr_mhnyr45pK51r4zr2vo2_r1_500.gif");
        JOptionPane.showMessageDialog(null, "Hello","Title",
            JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
        }

    }
    