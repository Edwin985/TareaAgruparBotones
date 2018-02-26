import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//Edwin Alejandro Cetina Contreras
public class Agrupación extends JFrame implements ActionListener {

    public Agrupación(String titulo) {
        
        JRadioButton birdButton = new JRadioButton("Pajaro");
        birdButton.setMnemonic(KeyEvent.VK_B);
        birdButton.setActionCommand("bird");
        birdButton.setSelected(true);

        JRadioButton catButton = new JRadioButton("Gato");
        catButton.setMnemonic(KeyEvent.VK_C);
        catButton.setActionCommand("cat");

        JRadioButton dogButton = new JRadioButton("Perro");
        dogButton.setMnemonic(KeyEvent.VK_D);
        dogButton.setActionCommand("dog");

        JRadioButton rabbitButton = new JRadioButton("Conejo");
        rabbitButton.setMnemonic(KeyEvent.VK_R);
        rabbitButton.setActionCommand("rabbit");

        JRadioButton pigButton = new JRadioButton("Cerdo");
        pigButton.setMnemonic(KeyEvent.VK_P);
        pigButton.setActionCommand("pig");

        ButtonGroup btgAnimalitos = new ButtonGroup();
        btgAnimalitos.add(birdButton);
        btgAnimalitos.add(catButton);
        btgAnimalitos.add(dogButton);
        btgAnimalitos.add(rabbitButton);
        btgAnimalitos.add(pigButton);

        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new GridLayout(0,1));
        radioPanel.add(birdButton);
        radioPanel.add(catButton);
        radioPanel.add(dogButton);
        radioPanel.add(rabbitButton);
        radioPanel.add(pigButton);
        radioPanel.setBackground(Color.RED);

        JLabel picture = new JLabel(new ImageIcon("src/Loro.gif"));
        JPanel PanelCont2=new JPanel();
        PanelCont2.setLayout(new GridLayout(1,2));
        PanelCont2.add(radioPanel);
        PanelCont2.add(picture);
        PanelCont2.setBackground(Color.YELLOW);
        
        JPanel ButtonPanel = new JPanel();
        ButtonPanel.setLayout(new BoxLayout(ButtonPanel, BoxLayout.X_AXIS));
        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(5, 30, 100, 30);
        ButtonPanel.add(btnAceptar,BorderLayout.CENTER);
        
        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(145, 30, 100, 30);
        ButtonPanel.add(btnCancelar,BorderLayout.WEST);
        
        GridLayout distGrid = new GridLayout(2,0);
        getContentPane().setLayout(distGrid);
        getContentPane().add(PanelCont2);
        getContentPane().add(ButtonPanel);
        getContentPane().setBackground(Color.GREEN);
        pack();
        setTitle(titulo);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Evento producido por " + e.getActionCommand());
    }
    
    public static void main (String[] args) {
        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };
        JFrame frame = new Agrupación("Curso de Java: Agrupar Botones");
        frame.addWindowListener(l);
        frame.pack();
        frame.setVisible(true);
    }
}