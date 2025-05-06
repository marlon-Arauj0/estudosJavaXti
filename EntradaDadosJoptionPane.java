import javax.swing.JOptionPane;

public class EntradaDadosJoptionPane {

  public static void main (String[] args) {
  
  String nome = JOptionPane.showInputDialog("Qual seu Nome? ");
  JOptionPane.showMessageDialog(null, nome);
  
  }
}
