//package ProiectFinal;
//
//import java.util.Scanner;
//
//public class CalorieCounter {
//    public static void main(String[] args) {
//
//        Scanner console = new Scanner(System.in);
//        int option;
//        ProductCatalog productCatalog = new ProductCatalog();
//        do {
//            printMenu();
//            System.out.println("Alege optiunea");
//            option = console.nextInt();
//            performSelectedAction(productCatalog, option, console);
//        } while (option != 6);
//    }
//
//    public static void performSelectedAction(ProductCatalog productCatalog, int option, Scanner console) {
//        switch (option) {
//            case 1:
//
//                System.out.println("Introdu  produsul:");
//                Scanner addProd = new Scanner(System.in);
//                String nameProd = addProd.nextLine();
//                System.out.println("Calculeaza caloriile produsului introducand valorile pentru:");
//                System.out.println("1. grasimi:");
//                int grasimi = console.nextInt();
//                System.out.println("2. carbohidrati:");
//                int carbohidrati = console.nextInt();
//                System.out.println("3. proteine:");
//                int proteine = console.nextInt();
//                Product adproduct = new Product(nameProd, grasimi, carbohidrati, proteine);
//                int totalCalorii = Product.computeCalories(grasimi, carbohidrati, proteine);
//                System.out.println("Totalul de calorii pentru valorile introduse este " + totalCalorii);
//                productCatalog.addProduct(adproduct);
//                System.out.println("Produsul a fost adaugat in lista");
//
//                break;
//            case 2:
//                System.out.println("Calculeaza caloriile pentru un produs ce nu apartine listei");
//                System.out.println("Introdu produsul");
//                String nameProd2 = console.nextLine();
//                System.out.println("1. grasimi:");
//                int grasimi2 = console.nextInt();
//                System.out.println("2. carbohidrati:");
//                int carbohidrati2 = console.nextInt();
//                System.out.println("3. proteine:");
//                int proteine2 = console.nextInt();
//                Product product2 = new Product(nameProd2, grasimi2, carbohidrati2, proteine2);
//                int totalCalorii2 = product2.computeCalories(grasimi2, carbohidrati2, proteine2);
//                System.out.println("Totalul de calorii pentru produs sunt: " + totalCalorii2);
//                break;
//            case 3:
//                System.out.println("Acestea sunt caloriile pentru fiecare produs existent in lista");
//                productCatalog.printProducts();
//                break;
//            case 4:
//                System.out.println("Sterge un produs din catalog:");
//                String deleteProd = console.next();
//                productCatalog.deleteProduct();
//                System.out.println("Produsul " + deleteProd + " a fost sters din lista");
//                break;
//            case 5:
//                System.out.println("Adauga produsul pe care vrei sa-l cauti in lista");
//                String getAProd = console.nextLine();
//               // Product name = productCatalog.getProductByName(ProductCatalog productCatalog);
//               // System.out.println("Produsul " + name + " a fost gasit in lista");
//                System.out.println("Produsul nu a fost gasit in lista");
//                break;
//            case 6:
//                System.out.println("Aplicatia s-a incheiat");
//                break;
//            default:
//                System.out.println("Optiunea dorita nu este una valida pentru meniul aplicatiei! Mai incearca!");
//        }
//    }
//
//    public static void printMenu() {
//        System.out.println("1. Adauga un produs in calculator si calculeaza-i caloriile");
//        System.out.println("2. Calculeaza caloriile pentru un produs fara a fi adaugat in catalog");
//        System.out.println("3. Afiseaza toate produsele din catalog si caloriile pentru fiecare");
//        System.out.println("4. Sterge un produs din catalog");
//        System.out.println("5. Gaseste un produs dupa nume");
//        System.out.println("6. Iesi din aplicatie");
//    }
//}

