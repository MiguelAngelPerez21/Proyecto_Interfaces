import javax.swing.*;
import java.awt.*;

public class Version_1
{
    private JPanel Version_1;
    private JPanel UsuarioyContraseña;
    private JLabel Usuario;
    private JTextField textFieldUsuario;
    private JLabel Contrasena;
    private JPasswordField passwordFieldContrasena;
    private JCheckBox checkBoxTyC;
    private JPanel TyC;
    private JPanel Acceder;
    private JButton buttonAcceder;
    private JLabel logo;

    public Version_1()
    {
        Fondo Panel = new Fondo();
        Panel.setLayout(new BorderLayout());
        Version_1.setOpaque(false);
        Panel.add(Version_1,BorderLayout.CENTER);
        Version_1 = Panel;

        UsuarioyContraseña.setOpaque(false);
        TyC.setOpaque(false);
        Acceder.setOpaque(false);
        buttonAcceder.setOpaque(false);
        checkBoxTyC.setOpaque(false);
    }

    private static class Fondo extends JPanel
    {
        private final Image imagen;

        public Fondo()
        {
            imagen = new ImageIcon("src/main/resources/fondo.jpg").getImage();
        }


        @Override
        protected void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        }
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Version_1");
        frame.setContentPane(new Version_1().Version_1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
