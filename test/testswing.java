import javax.swing.JFrame;
/**
 * 简单的swing窗口
 * @author lenovo
 *
 */
public class testswing {
    public static void main(String[] args) {
	JFrame frame=new JFrame("hello Swing");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(300,200);
	frame.setVisible(true);
    }

}
