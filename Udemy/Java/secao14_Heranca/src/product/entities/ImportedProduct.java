package product.entities;

public class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct() {

    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public double totalPrice() {
        return price + customsFee;
    }

    @Override
    public String priceTag() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" $ ");
        sb.append(String.format("%.2f", totalPrice()));
        return sb.toString();
    }


}
