import javax.swing.JOptionPane;

public class Git {

    public static void main(String[] args) {

        MyClass obj = new MyClass();

        obj.setPrivet("Проверяем pull request");
        String text = "Проверка: " + obj.getPrivet();

        JOptionPane.showMessageDialog(null, text);
    }

}
