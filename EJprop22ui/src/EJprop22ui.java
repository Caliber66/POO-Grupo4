
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EJprop22ui extends javax.swing.JFrame {

    public EJprop22ui() {
        initComponents();
    }

    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCoeficienteA = new javax.swing.JTextField();
        txtCoeficienteB = new javax.swing.JTextField();
        txtCoeficienteC = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de Ecuación Cuadrática");

        jLabel1.setText("Coeficiente A:");

        jLabel2.setText("Coeficiente B:");

        jLabel3.setText("Coeficiente C:");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lblResultado.setFont(new java.awt.Font("Tahoma", 1, 14));
        lblResultado.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCoeficienteA)
                                        .addComponent(txtCoeficienteB)
                                        .addComponent(txtCoeficienteC)
                                        .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(txtCoeficienteA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(txtCoeficienteB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(txtCoeficienteC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnCalcular)
                                .addGap(18, 18, 18)
                                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }

    private void btnCalcularActionPerformed(ActionEvent evt) {
        // Leer los coeficientes de la ecuación cuadrática
        double coeficienteA = Double.parseDouble(txtCoeficienteA.getText());
        double coeficienteB = Double.parseDouble(txtCoeficienteB.getText());
        double coeficienteC = Double.parseDouble(txtCoeficienteC.getText());

        // Calcular el discriminante
        double discriminante = coeficienteB * coeficienteB - 4 * coeficienteA * coeficienteC;

        // Calcular las soluciones
        if (discriminante > 0) {
            double solucion1 = (-coeficienteB + Math.sqrt(discriminante)) / (2 * coeficienteA);
            double solucion2 = (-coeficienteB - Math.sqrt(discriminante)) / (2 * coeficienteA);
            lblResultado.setText("Soluciones: x1 = " + solucion1 + ", x2 = " + solucion2);
        } else if (discriminante == 0) {
            double solucion = -coeficienteB / (2 * coeficienteA);
            lblResultado.setText("Solución Doble: x = " + solucion);
        } else {
            lblResultado.setText("No hay soluciones reales.");
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EJprop22ui().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField txtCoeficienteA;
    private javax.swing.JTextField txtCoeficienteB;
    private javax.swing.JTextField txtCoeficienteC;
}
