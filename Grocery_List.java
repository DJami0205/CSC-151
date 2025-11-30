import java.util.Scanner;

public class Grocery_List {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Grocery prices - 50 items
        // Dairy & Eggs
        final double MILK_PRICE = 3.99;
        final double EGGS_PRICE = 4.99;
        final double CHEESE_PRICE = 5.49;
        final double BUTTER_PRICE = 4.49;
        final double YOGURT_PRICE = 3.29;
        
        // Meat & Protein
        final double BEEF_PRICE = 9.99;
        final double CHICKEN_PRICE = 8.99;
        final double PORK_PRICE = 7.99;
        final double SALMON_PRICE = 12.99;
        final double BACON_PRICE = 6.99;
        
        // Fruits
        final double APPLE_PRICE = 1.99;
        final double BANANA_PRICE = 0.79;
        final double ORANGE_PRICE = 1.49;
        final double GRAPES_PRICE = 3.99;
        final double STRAWBERRY_PRICE = 4.49;
        final double WATERMELON_PRICE = 5.99;
        final double PINEAPPLE_PRICE = 3.49;
        final double MANGO_PRICE = 2.99;
        final double BLUEBERRY_PRICE = 4.99;
        final double PEACH_PRICE = 2.49;
        
        // Vegetables
        final double LETTUCE_PRICE = 2.49;
        final double TOMATO_PRICE = 2.99;
        final double CUCUMBER_PRICE = 1.49;
        final double CARROT_PRICE = 1.99;
        final double BROCCOLI_PRICE = 2.79;
        final double POTATO_PRICE = 3.49;
        final double ONION_PRICE = 1.79;
        final double BELL_PEPPER_PRICE = 2.29;
        final double SPINACH_PRICE = 2.99;
        final double CORN_PRICE = 1.99;
        
        // Bakery & Grains
        final double BREAD_PRICE = 2.49;
        final double RICE_PRICE = 6.49;
        final double PASTA_PRICE = 1.79;
        final double CEREAL_PRICE = 4.99;
        final double FLOUR_PRICE = 3.99;
        
        // Drinks
        final double WATER_PRICE = 4.99;
        final double SODA_PRICE = 5.49;
        final double JUICE_PRICE = 3.99;
        final double COFFEE_PRICE = 8.99;
        final double TEA_PRICE = 4.49;
        final double ENERGY_DRINK_PRICE = 2.99;
        final double SPORTS_DRINK_PRICE = 1.99;
        final double LEMONADE_PRICE = 3.49;
        
        // Pantry & Canned
        final double SOUP_PRICE = 2.49;
        final double BEANS_PRICE = 1.99;
        final double TUNA_PRICE = 1.49;
        final double PEANUT_BUTTER_PRICE = 4.99;
        final double OLIVE_OIL_PRICE = 7.99;
        final double SALT_PRICE = 1.29;
        
        // Tax rate
        final double TAX_RATE = 0.06;
        
        // Cart quantities (49 items, not 50)
        int[] quantities = new int[49];
        String continueShopping = "y";
        
        System.out.println("========================================");
        System.out.println("   WELCOME TO FRESH MART GROCERY! 🛒");
        System.out.println("========================================");
        System.out.println();
        
        // Main shopping loop
        do {
            System.out.println("========================================");
            System.out.println("          GROCERY MENU");
            System.out.println("========================================");
            System.out.println("DAIRY & EGGS:");
            System.out.println(" 1. Milk (1 gal)      - $" + MILK_PRICE);
            System.out.println(" 2. Eggs (1 dozen)    - $" + EGGS_PRICE);
            System.out.println(" 3. Cheese (1 lb)     - $" + CHEESE_PRICE);
            System.out.println(" 4. Butter (1 lb)     - $" + BUTTER_PRICE);
            System.out.println(" 5. Yogurt (32 oz)    - $" + YOGURT_PRICE);
            System.out.println();
            System.out.println("MEAT & PROTEIN:");
            System.out.println(" 6. Beef (1 lb)       - $" + BEEF_PRICE);
            System.out.println(" 7. Chicken (1 lb)    - $" + CHICKEN_PRICE);
            System.out.println(" 8. Pork (1 lb)       - $" + PORK_PRICE);
            System.out.println(" 9. Salmon (1 lb)     - $" + SALMON_PRICE);
            System.out.println("10. Bacon (1 lb)      - $" + BACON_PRICE);
            System.out.println();
            System.out.println("FRUITS:");
            System.out.println("11. Apples (1 lb)     - $" + APPLE_PRICE);
            System.out.println("12. Bananas (1 lb)    - $" + BANANA_PRICE);
            System.out.println("13. Oranges (1 lb)    - $" + ORANGE_PRICE);
            System.out.println("14. Grapes (1 lb)     - $" + GRAPES_PRICE);
            System.out.println("15. Strawberries      - $" + STRAWBERRY_PRICE);
            System.out.println("16. Watermelon (ea)   - $" + WATERMELON_PRICE);
            System.out.println("17. Pineapple (ea)    - $" + PINEAPPLE_PRICE);
            System.out.println("18. Mango (ea)        - $" + MANGO_PRICE);
            System.out.println("19. Blueberries       - $" + BLUEBERRY_PRICE);
            System.out.println("20. Peaches (1 lb)    - $" + PEACH_PRICE);
            System.out.println();
            System.out.println("VEGETABLES:");
            System.out.println("21. Lettuce (head)    - $" + LETTUCE_PRICE);
            System.out.println("22. Tomatoes (1 lb)   - $" + TOMATO_PRICE);
            System.out.println("23. Cucumber (ea)     - $" + CUCUMBER_PRICE);
            System.out.println("24. Carrots (1 lb)    - $" + CARROT_PRICE);
            System.out.println("25. Broccoli (head)   - $" + BROCCOLI_PRICE);
            System.out.println("26. Potatoes (5 lb)   - $" + POTATO_PRICE);
            System.out.println("27. Onions (1 lb)     - $" + ONION_PRICE);
            System.out.println("28. Bell Peppers (ea) - $" + BELL_PEPPER_PRICE);
            System.out.println("29. Spinach (bunch)   - $" + SPINACH_PRICE);
            System.out.println("30. Corn (4 ears)     - $" + CORN_PRICE);
            System.out.println();
            System.out.println("BAKERY & GRAINS:");
            System.out.println("31. Bread (loaf)      - $" + BREAD_PRICE);
            System.out.println("32. Rice (5 lb)       - $" + RICE_PRICE);
            System.out.println("33. Pasta (box)       - $" + PASTA_PRICE);
            System.out.println("34. Cereal (box)      - $" + CEREAL_PRICE);
            System.out.println("35. Flour (5 lb)      - $" + FLOUR_PRICE);
            System.out.println();
            System.out.println("DRINKS:");
            System.out.println("36. Water (24 pack)   - $" + WATER_PRICE);
            System.out.println("37. Soda (12 pack)    - $" + SODA_PRICE);
            System.out.println("38. Juice (64 oz)     - $" + JUICE_PRICE);
            System.out.println("39. Coffee (12 oz)    - $" + COFFEE_PRICE);
            System.out.println("40. Tea (box)         - $" + TEA_PRICE);
            System.out.println("41. Energy Drink (ea) - $" + ENERGY_DRINK_PRICE);
            System.out.println("42. Sports Drink (ea) - $" + SPORTS_DRINK_PRICE);
            System.out.println("43. Lemonade (64 oz)  - $" + LEMONADE_PRICE);
            System.out.println();
            System.out.println("PANTRY & CANNED:");
            System.out.println("44. Soup (can)        - $" + SOUP_PRICE);
            System.out.println("45. Beans (can)       - $" + BEANS_PRICE);
            System.out.println("46. Tuna (can)        - $" + TUNA_PRICE);
            System.out.println("47. Peanut Butter     - $" + PEANUT_BUTTER_PRICE);
            System.out.println("48. Olive Oil         - $" + OLIVE_OIL_PRICE);
            System.out.println("49. Salt (container)  - $" + SALT_PRICE);
            System.out.println();
            System.out.println("50. View Cart");
            System.out.println("51. Checkout");
            System.out.println("========================================");
            System.out.print("Enter your choice (1-51): ");
            
            int choice = input.nextInt();
            
            // Switch statement for menu selection
            if (choice >= 1 && choice <= 49) {
                System.out.print("How many? ");
                int qty = input.nextInt();
                quantities[choice - 1] += qty;
                System.out.println(qty + " item(s) added to cart!");
                System.out.println();
                
                // Ask to continue shopping
                System.out.print("Continue shopping? (y/n): ");
                continueShopping = input.next().toLowerCase();
                System.out.println();
                
            } else if (choice == 50) {
                displayCart(quantities);
                
                // Ask to continue shopping after viewing cart
                System.out.print("Continue shopping? (y/n): ");
                continueShopping = input.next().toLowerCase();
                System.out.println();
                
            } else if (choice == 51) {
                // Checkout - exit the loop
                System.out.println("Proceeding to checkout...");
                System.out.println();
                continueShopping = "n";
                
            } else {
                System.out.println("Invalid choice! Please try again.");
                System.out.println();
            }
            
        } while (continueShopping.equals("y"));
        
        // Calculate total
        double subtotal = calculateTotal(quantities);
        double tax = subtotal * TAX_RATE;
        double total = subtotal + tax;
        
        // Display final receipt
        displayReceipt(quantities, subtotal, tax, total);
        
        input.close();
    }
    
    // Method to calculate total
    public static double calculateTotal(int[] quantities) {
        double[] prices = {
            3.99, 4.99, 5.49, 4.49, 3.29,  // Dairy
            9.99, 8.99, 7.99, 12.99, 6.99, // Meat
            1.99, 0.79, 1.49, 3.99, 4.49, 5.99, 3.49, 2.99, 4.99, 2.49, // Fruits
            2.49, 2.99, 1.49, 1.99, 2.79, 3.49, 1.79, 2.29, 2.99, 1.99, // Vegetables
            2.49, 6.49, 1.79, 4.99, 3.99,  // Bakery
            4.99, 5.49, 3.99, 8.99, 4.49, 2.99, 1.99, 3.49, // Drinks
            2.49, 1.99, 1.49, 4.99, 7.99, 1.29  // Pantry
        };
        
        double total = 0;
        for (int i = 0; i < quantities.length; i++) {
            total += quantities[i] * prices[i];
        }
        return total;
    }
    
    // Method to display cart
    public static void displayCart(int[] quantities) {
        String[] items = {
            "Milk", "Eggs", "Cheese", "Butter", "Yogurt",
            "Beef", "Chicken", "Pork", "Salmon", "Bacon",
            "Apples", "Bananas", "Oranges", "Grapes", "Strawberries",
            "Watermelon", "Pineapple", "Mango", "Blueberries", "Peaches",
            "Lettuce", "Tomatoes", "Cucumber", "Carrots", "Broccoli",
            "Potatoes", "Onions", "Bell Peppers", "Spinach", "Corn",
            "Bread", "Rice", "Pasta", "Cereal", "Flour",
            "Water", "Soda", "Juice", "Coffee", "Tea",
            "Energy Drink", "Sports Drink", "Lemonade",
            "Soup", "Beans", "Tuna", "Peanut Butter", "Olive Oil", "Salt"
        };
        
        double[] prices = {
            3.99, 4.99, 5.49, 4.49, 3.29,
            9.99, 8.99, 7.99, 12.99, 6.99,
            1.99, 0.79, 1.49, 3.99, 4.49, 5.99, 3.49, 2.99, 4.99, 2.49,
            2.49, 2.99, 1.49, 1.99, 2.79, 3.49, 1.79, 2.29, 2.99, 1.99,
            2.49, 6.49, 1.79, 4.99, 3.99,
            4.99, 5.49, 3.99, 8.99, 4.49, 2.99, 1.99, 3.49,
            2.49, 1.99, 1.49, 4.99, 7.99, 1.29
        };
        
        System.out.println();
        System.out.println("========================================");
        System.out.println("         YOUR SHOPPING CART");
        System.out.println("========================================");
        
        boolean isEmpty = true;
        int totalItems = 0;
        int uniqueItems = 0;
        
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] > 0) {
                isEmpty = false;
                uniqueItems++;
                totalItems += quantities[i];
                System.out.println(items[i] + " x" + quantities[i] + 
                                 " = $" + String.format("%.2f", quantities[i] * prices[i]));
            }
        }
        
        if (isEmpty) {
            System.out.println("Your cart is empty!");
        } else {
            System.out.println();
            System.out.println("Total unique items: " + uniqueItems);
            System.out.println("Total quantity: " + totalItems + " items");
        }
        
        System.out.println("========================================");
        System.out.println();
    }
    
    // Method to display receipt
    public static void displayReceipt(int[] quantities, double subtotal, double tax, double total) {
        String[] items = {
            "Milk", "Eggs", "Cheese", "Butter", "Yogurt",
            "Beef", "Chicken", "Pork", "Salmon", "Bacon",
            "Apples", "Bananas", "Oranges", "Grapes", "Strawberries",
            "Watermelon", "Pineapple", "Mango", "Blueberries", "Peaches",
            "Lettuce", "Tomatoes", "Cucumber", "Carrots", "Broccoli",
            "Potatoes", "Onions", "Bell Peppers", "Spinach", "Corn",
            "Bread", "Rice", "Pasta", "Cereal", "Flour",
            "Water", "Soda", "Juice", "Coffee", "Tea",
            "Energy Drink", "Sports Drink", "Lemonade",
            "Soup", "Beans", "Tuna", "Peanut Butter", "Olive Oil", "Salt"
        };
        
        double[] prices = {
            3.99, 4.99, 5.49, 4.49, 3.29,
            9.99, 8.99, 7.99, 12.99, 6.99,
            1.99, 0.79, 1.49, 3.99, 4.49, 5.99, 3.49, 2.99, 4.99, 2.49,
            2.49, 2.99, 1.49, 1.99, 2.79, 3.49, 1.79, 2.29, 2.99, 1.99,
            2.49, 6.49, 1.79, 4.99, 3.99,
            4.99, 5.49, 3.99, 8.99, 4.49, 2.99, 1.99, 3.49,
            2.49, 1.99, 1.49, 4.99, 7.99, 1.29
        };
        
        System.out.println();
        System.out.println("========================================");
        System.out.println("           GROCERY RECEIPT");
        System.out.println("========================================");
        System.out.println("         FRESH MART GROCERY");
        System.out.println("       123 Main Street");
        System.out.println("     Spring Lake, NC 28390");
        System.out.println("========================================");
        System.out.println();
        
        int itemCount = 0;
        int totalItems = 0;
        
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] > 0) {
                itemCount++;
                totalItems += quantities[i];
                System.out.println(itemCount + ". " + items[i] + " x" + quantities[i] + 
                                 " @ $" + prices[i] + " = $" + 
                                 String.format("%.2f", quantities[i] * prices[i]));
            }
        }
        
        System.out.println();
        System.out.println("Total Items Purchased: " + totalItems);
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("Subtotal:        $" + String.format("%.2f", subtotal));
        System.out.println("Tax (6%):        $" + String.format("%.2f", tax));
        System.out.println("----------------------------------------");
        System.out.println("TOTAL:           $" + String.format("%.2f", total));
        System.out.println("========================================");
        System.out.println();
        
        if (total > 100) {
            System.out.println(" You saved! Orders over $100 qualify for");
            System.out.println("   free delivery on your next purchase!");
            System.out.println();
        }
        
        System.out.println("Thank you for shopping at Fresh Mart!!");
        System.out.println("Have a great day!");
    }
}5