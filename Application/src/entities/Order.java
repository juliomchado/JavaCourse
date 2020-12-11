package entities;

import java.util.Date;

import entities_enums.OrderStatus;

public class Order {
    private Integer id;
    private Date moment;
    private OrderStatus status;


    public Order() {
    }

    public Order(Integer id, Date moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return this.moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return this.status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Order id(Integer id) {
        this.id = id;
        return this;
    }

    public Order moment(Date moment) {
        this.moment = moment;
        return this;
    }

    public Order status(OrderStatus status) {
        this.status = status;
        return this;
    }

    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", moment='" + getMoment() + "'" +
            ", status='" + getStatus() + "'" +
            "}";
    }
    
}
