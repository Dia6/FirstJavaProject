package Lab2.AnimalRescue;

public class Food {
    private String name = "Petkult";
    private String type = "grains";
    private float priceInLei = 25;
    private float quantityInKg = 0.25f;
    private float availableQtyInKg = 175f;

    public float getAvailableQtyInKg() {
        return availableQtyInKg;
    }
    public void setAvailableQtyInKg(float availableQtyInKg) {
        this.availableQtyInKg = availableQtyInKg;
    }

    public float getQuantityInKg() {
        return quantityInKg;
    }
    public void setQuantityInKg(float quantityInKg) {
        this.quantityInKg = quantityInKg;
    }

    public float getPriceInLei() {
        return priceInLei;
    }
    public void setPriceInLei(float priceInLei) {
        this.priceInLei = priceInLei;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}