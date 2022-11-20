package vehicle;



public enum Vehicle {
    BMW(1000,"red"), MERCEDES(2000, "white"), AUDI(3000, "black");
    int price;
    String color;

    Vehicle(int price, String color){
        this.price = price;
        this.color = color;
    }
    int getPrice(){
        return price;
    }
    String getColor(){
        return color;
    }
    public String toString(){
        return this.name()+" price: "+getPrice()+" color: "+getColor();

    }
}
