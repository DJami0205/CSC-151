import javax.swing.JOptionPane;

public class ShapeAreaCalculator {
    public static void main(String[] args) {
        // Menu message
        String[] options = {"Rectangle", "Circle"};
        int choice = JOptionPane.showOptionDialog(
            null,
            "Choose a shape to calculate the area:",
            "Area Calculator",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            null,
            options,
            options[0]
        );

        if (choice == 0) {
            // Rectangle calculation
            String lengthInput = JOptionPane.showInputDialog(null, "Enter the length of the rectangle:");
            String widthInput = JOptionPane.showInputDialog(null, "Enter the width of the rectangle:");

            try {
                double length = Double.parseDouble(lengthInput);
                double width = Double.parseDouble(widthInput);
                double area = length * width;

                JOptionPane.showMessageDialog(null, "The area of the rectangle is: " + area);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input! Please enter numeric values.");
            }

        } else if (choice == 1) {
            // Circle calculation
            String radiusInput = JOptionPane.showInputDialog(null, "Enter the radius of the circle:");

            try {
                double radius = Double.parseDouble(radiusInput);
                double area = Math.PI * radius * radius;

                JOptionPane.showMessageDialog(null, "The area of the circle is: " + area);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input! Please enter a numeric value.");
            }

        } else {
            // User closed the menu dialog or clicked Cancel
            JOptionPane.showMessageDialog(null, "No shape selected. Program exiting.");
        }

        System.exit(0); // Close the program
    }
}
