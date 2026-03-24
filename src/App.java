


import java.util.Scanner;  
import static view.Menu.consoleMenu;
import view.Menu;
import service.InventoryService;
import service.ClientService;
import service.SubscriptionService;


public class App {  
    public static void main(String[] args) throws Exception {
            System.out.println("Bem-vindo ao sistema de gestão de cestas de frutas, legumes e verduras!");  
            consoleMenu( command -> {
                switch (command) {
                    case "1":
                        InventoryService.addProduct();
                        break;
                    case "2":
                        InventoryService.updateProduct();
                        break;
                    case "3":
                        InventoryService.listProducts();
                        break;
                    case "4":
                        InventoryService.removeProduct();
                        break;
                    case "5":
                        ClientService.registerClient();
                        break;
                    case "6":
                        // Implementar planos de assinatura
                        break;
                    case "7":
                        // Implementar processamento de pedidos
                        break;
                    case "0":
                        System.out.println("Encerrando o sistema. Até logo!");
                        System.exit(0);
                    default:
                        System.out.println("Comando inválido. Por favor, tente novamente.");
                }
            });
    }
if (command.equals("1")) {
    InventoryService.addProduct();
} else if (command.equals("2")) {
    InventoryService.updateProduct();
} else if (command.equals("3")) {
    InventoryService.listProducts();
} else if (command.equals("4")) {
    InventoryService.removeProduct();
} else if (command.equals("5")) {
    ClientService.registerClient();
} else if (command.equals("6")) {
    // Implementar planos de assinatura
} else if (command.equals("7")) {
    // Implementar processamento de pedidos
} else if (command.equals("0")) {
    System.out.println("Encerrando o sistema. Até logo!");
    System.exit(0);
} else {
    System.out.println("Comando inválido. Por favor, tente novamente.");
}
}
