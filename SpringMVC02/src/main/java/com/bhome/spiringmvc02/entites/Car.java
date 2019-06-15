package com.bhome.spiringmvc02.entites;

import com.sun.glass.ui.Size;

import java.util.ArrayList;
import java.util.List;

/**车*/
public class Car {
    /**编号*/
    private int id;
    /**名称*/
    private String name;
    /**价格*/
    private double price;
    /**尺寸*/
    private Size size;

    private List<Integer> ids;
    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public Car(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Car() {
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public static List<Car> getCars() {
        return cars;
    }

    public static void setCars(List<Car> cars) {
        Car.cars = cars;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", size=" + size +
                ", ids=" + ids +
                '}';
    }

    public static List<Car> cars=new ArrayList<>();
    static {
        cars.add(new Car(101,"朗逸",16.59));
        cars.add(new Car(102,"菲斯塔",15.50));
        cars.add(new Car(103,"雅阁",25.98));
        cars.add(new Car(104,"卡罗拉",17.58));
        cars.add(new Car(105,"轩逸",16.15));
    }
}