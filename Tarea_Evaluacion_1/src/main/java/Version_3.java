import javax.swing.*;
import java.awt.*;

public class Version_3 {
    private JPanel Version_3;
    private JTabbedPane tabbedPane;
    private JLabel LogoIC;
    private JPanel UsuarioyContraseñaIC;
    private JLabel Usuario;
    private JTextField textFieldUsuario;
    private JLabel Contrasena;
    private JPasswordField passwordFieldContrasena;
    private JPanel IdiomasIC;
    private JComboBox comboBoxIdiomas;
    private JPanel RecordarSesionIC;
    private JRadioButton radioButtonRecordarUsuario;
    private JPanel TyCIC;
    private JCheckBox checkBoxTyC;
    private JPanel AccederIC;
    private JButton buttonAcceder;
    private JPanel JPanelLogoIC;
    private JLabel CorreoElectronico;
    private JLabel NombreUsuario;
    private JTextField textFieldNombreUsuario;
    private JLabel RepetirContrasena;
    private JPasswordField passwordFieldRepetirContrasena;
    private JRadioButton Notificaciones;
    private JButton CrearCuenta;
    private JTextArea a1ACEPTACIONDELOSTextArea;
    private JPanel ImagenCoche;
    private JLabel Coche;
    private JPanel ValoresCoche;
    private JProgressBar progressBar1;
    private JSlider slider1;
    private JSpinner spinner1;
    private JPanel Configuracion;
    private JLabel Pilotos;
    private JLabel Velocidad;
    private JLabel Neumaticos;
    private JLabel Vueltas;
    private JSpinner spinner2;

    public Version_3() {
        Version_3.Fondo Panel = new Version_3.Fondo();
        Panel.setLayout(new BorderLayout());
        Version_3.setOpaque(false);
        Panel.add(Version_3,BorderLayout.CENTER);
        Version_3 = Panel;
    }

    private static class Fondo extends JPanel {
        private final Image imagen;
        public Object tabbedPane;

        public Fondo() {
            imagen = new ImageIcon("src/main/resources/FondoCarrera.gif").getImage();
        }

        @Override
        protected void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Version_3");
        frame.setContentPane(new Version_3().Version_3);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
