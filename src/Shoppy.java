import model.*;

import java.util.ArrayList;
import java.util.List;

public class Shoppy {

    private Cart cart;
    private List<Product> productList;


    public Shoppy() {
        this.productList = new ArrayList<>();
        this.productList.add(new Dress("S", "Kırmızı Elbise", "1", 10.2d));
        this.productList.add(new Dress("M", "Mavi Elbise", "1", 12.2d));
        this.productList.add(new Dress("L", "Mor Elbise", "1", 15.2d));
        this.productList.add(new Jean("31","32", "Mavi Kot", "1", 16.2d));
        this.productList.add(new Jean("31","33", "Gri Kot", "1", 17.2d));
        this.productList.add(new Jean("30","30", "Siyah Kot", "1", 18.2d));
        this.cart = new Cart();
    }

    public static void main(String args[]){
        Shoppy shoppy = new Shoppy();
        shoppy.urunListeleme();

        shoppy.getCart().addToCart(shoppy.getProductList().get(0), 2);
        shoppy.showCart();
        shoppy.getCart().addToCart(shoppy.getProductList().get(4), 1);
        shoppy.showCart();

    }

    public void showCart(){
        for (CartEntry e : this.getCart().getEntryList()){
            System.out.println("Urun adi : "+ e.getProduct().getName() +" adet: "+ e.getQty() + " fiyat : "+ e.getTotalAmount());
        }
        System.out.println("Sepet: "+ this.getCart().getTotalAmount());

        System.out.println("--------------------------------------CART");
    }

    public void urunListeleme(){
        for(Product p : this.productList){
            System.out.println("Urun adi : "+ p.getName() + " fiyat : "+ p.getPrice());
            System.out.println("--------------------------------------PLP");
        }
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
