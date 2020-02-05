package edu.wctc;

import java.io.Serializable;
import java.util.ArrayList;

public class Room implements Serializable {

    private static int roomCount;
    private int roomNum;


    private ArrayList<Wall> wallList;

    public Room(double length, double width, double height) throws BadWidthException, BadHeightException {
        wallList = new ArrayList<Wall>();

        Wall wallA = new Wall(length, height);
        wallList.add(wallA);
        Wall wallB = new Wall(length, height);
        wallList.add(wallB);
        Wall wallC = new Wall(width, height);
        wallList.add(wallC);
        Wall wallD = new Wall(width, height);
        wallList.add(wallD);

        roomCount++;
        roomNum = roomCount;
    }



    public double getArea() {
        double area = 0;

        for (int i = 0; i < wallList.size(); i++) {
            Wall w = wallList.get(i);
            area += w.getArea();
        }

        return area;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNum= " + roomNum + "Area= " + getArea() +
                '}';
    }
}
