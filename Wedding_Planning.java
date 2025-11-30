import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Wedding_Planning extends JFrame {
    // Prices
    private final int PRICE_PER_TABLE = 20;
    private final int PRICE_PER_CHAIR = 10;
    
    // GUI Components
    private JTextField quantityField;
    private JRadioButton tablesButton;
    private JRadioButton chairsButton;
    private JTextArea resultArea;
    private JButton calculateButton;
    private JButton clearButton;
    private JButton exitButton;
    
    // Variables to keep track of totals
    private int totalTables = 0;
    private int totalChairs = 0;
    private int totalCost = 0;
    
    public Wedding_Planning() {
        // Set up the frame
        setTitle("Wedding Rental Calculator");
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        
        // Create main panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        
        // Title Label
        JLabel titleLabel = new JLabel("Wedding Table & Chair Rental");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        mainPanel.add(titleLabel, BorderLayout.NORTH);
        
        // Center panel for input
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(4, 1, 10, 10));
        
        // Price info
        JLabel priceLabel = new JLabel("Tables: $20 each | Chairs: $10 each");
        priceLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        priceLabel.setHorizontalAlignment(JLabel.CENTER);
        centerPanel.add(priceLabel);
        
        // Radio buttons for selection
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new FlowLayout());
        JLabel selectLabel = new JLabel("Select item type: ");
        tablesButton = new JRadioButton("Tables");
        chairsButton = new JRadioButton("Chairs");
        tablesButton.setSelected(true);
        
        ButtonGroup group = new ButtonGroup();
        group.add(tablesButton);
        group.add(chairsButton);
        
        radioPanel.add(selectLabel);
        radioPanel.add(tablesButton);
        radioPanel.add(chairsButton);
        centerPanel.add(radioPanel);
        
        // Quantity input
        JPanel quantityPanel = new JPanel();
        quantityPanel.setLayout(new FlowLayout());
        JLabel quantityLabel = new JLabel("Enter quantity: ");
        quantityField = new JTextField(10);
        quantityPanel.add(quantityLabel);
        quantityPanel.add(quantityField);
        centerPanel.add(quantityPanel);
        
        // Buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        calculateButton = new JButton("Add to Order");
        clearButton = new JButton("Clear Order");
        exitButton = new JButton("Exit");
        
        buttonPanel.add(calculateButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(exitButton);
        centerPanel.add(buttonPanel);
        
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        
        // Result area
        resultArea = new JTextArea(10, 40);
        resultArea.setEditable(false);
        resultArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scrollPane = new JScrollPane(resultArea);
        mainPanel.add(scrollPane, BorderLayout.SOUTH);
        
        add(mainPanel);
        
        // Add action listeners
        calculateButton.addActionListener(new CalculateListener());
        clearButton.addActionListener(new ClearListener());
        exitButton.addActionListener(new ExitListener());
        
        // Display initial message
        displayResults();
    }
    
    // Calculate button listener
    private class CalculateListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Decision structure using if-else
            try {
                int quantity = Integer.parseInt(quantityField.getText());
                
                if (quantity <= 0) {
                    JOptionPane.showMessageDialog(null, 
                        "Please enter a positive number!", 
                        "Invalid Input", 
                        JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                // If statement to check which item is selected
                if (tablesButton.isSelected()) {
                    totalTables += quantity;
                } else if (chairsButton.isSelected()) {
                    totalChairs += quantity;
                }
                
                // Calculate total cost
                totalCost = (totalTables * PRICE_PER_TABLE) + 
                           (totalChairs * PRICE_PER_CHAIR);
                
                // Display results
                displayResults();
                
                // Clear the input field
                quantityField.setText("");
                
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, 
                    "Please enter a valid number!", 
                    "Invalid Input", 
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    // Clear button listener (uses loop structure)
    private class ClearListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // Reset all values
            totalTables = 0;
            totalChairs = 0;
            totalCost = 0;
            quantityField.setText("");
            
            // Display cleared results
            displayResults();
            
            JOptionPane.showMessageDialog(null, 
                "Order cleared! You can start a new order.", 
                "Order Cleared", 
                JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    // Exit button listener
    private class ExitListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int choice = JOptionPane.showConfirmDialog(null, 
                "Are you sure you want to exit?", 
                "Exit Confirmation", 
                JOptionPane.YES_NO_OPTION);
            
            if (choice == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }
    
    // Display results using loop structure
    private void displayResults() {
        StringBuilder output = new StringBuilder();
        
        output.append("========================================\n");
        output.append("       CURRENT RENTAL ORDER\n");
        output.append("========================================\n\n");
        
        output.append("TABLES:\n");
        output.append("  Quantity: " + totalTables + " tables\n");
        output.append("  Cost: " + totalTables + " x $" + PRICE_PER_TABLE + 
                     " = $" + (totalTables * PRICE_PER_TABLE) + "\n\n");
        
        output.append("CHAIRS:\n");
        output.append("  Quantity: " + totalChairs + " chairs\n");
        output.append("  Cost: " + totalChairs + " x $" + PRICE_PER_CHAIR + 
                     " = $" + (totalChairs * PRICE_PER_CHAIR) + "\n\n");
        
        output.append("========================================\n");
        output.append("  TOTAL COST: $" + totalCost + "\n");
        output.append("========================================\n\n");
        
        // Loop structure - display breakdown using while loop
        output.append("ITEM BREAKDOWN:\n");
        int itemCount = 1;
        int currentTables = totalTables;
        int currentChairs = totalChairs;
        
        // While loop to show tables
        while (currentTables > 0) {
            if (itemCount <= totalTables) {
                output.append("  Table #" + itemCount + " - $" + PRICE_PER_TABLE + "\n");
                currentTables--;
                itemCount++;
            }
        }
        
        // Reset counter for chairs
        itemCount = 1;
        
        // While loop to show chairs (limiting display to first 10 for readability)
        while (currentChairs > 0 && itemCount <= 10) {
            output.append("  Chair #" + itemCount + " - $" + PRICE_PER_CHAIR + "\n");
            currentChairs--;
            itemCount++;
        }
        
        if (totalChairs > 10) {
            output.append("  ... and " + (totalChairs - 10) + " more chairs\n");
        }
        
        resultArea.setText(output.toString());
    }
    
    public static void main(String[] args) {
        // Run the GUI
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Wedding_Planning calculator = new Wedding_Planning();
                calculator.setVisible(true);
            }
        });
    }
}