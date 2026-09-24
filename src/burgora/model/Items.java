/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package burgora.model;

/**
 *
 * @author Naseeha
 */
public class Items {
    private String id;
    private String name;
    private String description;
    private int qty;
    private double unitPrice;

    public Items(String id, String name, String description, int qty, double unitPrice) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Items{" + "id=" + id + ", name=" + name + ", description=" + description + ", qty=" + qty + ", unitPrice=" + unitPrice + '}';
    }
    
}
