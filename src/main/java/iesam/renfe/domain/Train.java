package iesam.renfe.domain;

public class Train {
    private String id;
    private String type;
    private String maxSpeed;
    private String capacity;
    private String price;

    public Train(String id, String type, String maxSpeed, String capacity, String price) {
        this.id = id;
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.capacity = capacity;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Train{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", maxSpeed='" + maxSpeed + '\'' +
                ", capacity='" + capacity + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
