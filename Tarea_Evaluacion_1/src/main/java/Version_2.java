import javax.swing.*;
import java.awt.*;

public class Version_2 {
    private JPanel Version_2;
    private JPanel UsuarioyContraseña;
    private JLabel Usuario;
    private JTextField textFieldUsuario;
    private JLabel Contrasena;
    private JPasswordField passwordFieldContrasena;
    private JCheckBox checkBoxTyC;
    private JPanel TyC;
    private JPanel Acceder;
    private JButton buttonAcceder;
    private JLabel Logo;
    private JRadioButton radioButtonRecordarUsuario;
    private JPanel RecordarSesion;
    private JPanel Idiomas;
    private JComboBox comboBoxIdiomas;

    public Version_2()
    {
        Fondo Panel = new Fondo();
        Panel.setLayout(new BorderLayout());
        Version_2.setOpaque(false);
        Panel.add(Version_2,BorderLayout.CENTER);
        Version_2 = Panel;

        UsuarioyContraseña.setOpaque(false);
        TyC.setOpaque(false);
        Acceder.setOpaque(false);
        RecordarSesion.setOpaque(false);
        Idiomas.setOpaque(false);
        radioButtonRecordarUsuario.setOpaque(false);
        comboBoxIdiomas.setOpaque(false);
        checkBoxTyC.setOpaque(false);
    }

    private static class Fondo extends JPanel
    {
        private final Image imagen;

        public Fondo()
        {
            imagen = new ImageIcon("src/main/resources/FondoGif.gif").getImage();
        }


        @Override
        protected void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Version_2");
        frame.setContentPane(new Version_2().Version_2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
    }

}
