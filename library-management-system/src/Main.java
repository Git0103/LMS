public class Main {
    public static void main(String[] args) {
        // Initialize the GUI
        javax.swing.SwingUtilities.invokeLater(() -> {
            new gui.LibraryUI().setVisible(true);
        });
    }
}