package ProiectFinal;

public class Product {
    String numeProd;
    int grasimi;
    int carbohidrati;
    int proteine;
    int calorii;

    public Product(String numeProd, int grasimi, int carbohidrati, int proteine) {
        this.grasimi = grasimi;
        this.carbohidrati = carbohidrati;
        this.proteine = proteine;
        this.numeProd = numeProd;
        this.calorii = computeCalories(grasimi, carbohidrati, proteine);
    }

    public static int computeCalories(int grasimi, int carbohidrati, int proteine) {
        int calorii = grasimi + carbohidrati + proteine;
        return calorii;
    }

    @Override
    public String toString() {
        return "Product{" +
                "numeProd='" + numeProd + '\'' +
                ", grasimi=" + grasimi +
                ", carbohidrati=" + carbohidrati +
                ", proteine=" + proteine +
                ", calorii=" + calorii +
                '}';
    }
}

