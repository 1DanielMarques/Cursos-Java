package pedido2.entities;

import pedido2.entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> orderItems = new ArrayList<>();
    private double total = 0;

    public Order() {

    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addIOrderItems(OrderItem orderItem) {
        orderItems.add(orderItem);
    }

    public void removeIOrderItems(OrderItem orderItem) {
        orderItems.remove(orderItem);
    }

    public Double total() {
        for (OrderItem i : orderItems) {
            total += i.subTotal();
        }
        return total;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: " + sdf.format(moment) + "\n");
        sb.append("Order Status: " + status + "\n");
        sb.append("Client: " + client.getName());
        sb.append(" (" + client.getBirthDate() + ") - ");
        sb.append(client.getEmail());
        sb.append("Order Items: \n");
        for (OrderItem oI : orderItems) {
            oI.toString();
        }
        return sb.toString();
    }

}
