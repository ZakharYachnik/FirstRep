import javax.swing.JOptionPane;

public class Git {

    public static void main(String[] args) {

        MyClass obj = new MyClass();

        obj.setPrivet("Привет, Сергей!");
        String text = "Приветствие: " + obj.getPrivet();

        JOptionPane.showMessageDialog(null, text);
    }

}
