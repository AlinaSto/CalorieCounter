package ProiectFinal;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ProductCatalog {
    //public static final Product[] listaProduse = new Product[100];
   public final static int MAXIM_PRODUSE = 100;
    Product[] products; //lista produse
    int nrProduseAdaugate;
public ProductCatalog() {
    products = new Product[MAXIM_PRODUSE];
    nrProduseAdaugate = 0;
}

    public void printProducts() {
        //  System.out.println("Lista de produse:");
        for (int i = 0; i <= nrProduseAdaugate; i++) {
            System.out.println(products[i]);
        }
    }

    public boolean addProduct(Product addProd) {
        if (nrProduseAdaugate >= 100) {  // || != listaProduse[i}
            return false;
        }
        int findProd = findProduct(addProd.numeProd);
        products[nrProduseAdaugate] = addProd;
        nrProduseAdaugate++;
        return true;
    }
    public int findProduct(String prodName ) {
        for(int i = 0; i < nrProduseAdaugate; i++) {
            if (products[i].numeProd.equals (prodName)) {
                return i;
            }
        }
            return -1;
        }


    public boolean deleteProduct(String prodName) {
        int findProd = findProduct(prodName);
        if (nrProduseAdaugate >= 100) {
            return false;
        }
        for (int i = findProd; i < nrProduseAdaugate; i++) {
            products[i] = products[i + 1];
        }
        nrProduseAdaugate--;
        return true;
    }

    public int getProductByName(String prodName) {
        Scanner console = new Scanner(System.in);
        System.out.println("Introdu produsul:");
        prodName = console.next();
       // int findProd = findProduct(prodName);
        for (int i =0; i< nrProduseAdaugate; i++) {
            if (products[i].numeProd.equals(prodName)) {
                return i;
            }
        }
        return -1;

    }


}

