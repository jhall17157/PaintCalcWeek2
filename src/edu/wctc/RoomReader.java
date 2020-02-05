package edu.wctc;

import java.io.*;
import java.util.ArrayList;

public class RoomReader {

    public ArrayList<Room> readRoomFile(String filename) throws IOException, ClassNotFoundException {
        ArrayList<Room> rooms = new ArrayList<>();
        FileInputStream fis = new FileInputStream(filename);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Object obj;
        try {
            while ((obj = ois.readObject()) != null) {
                Room rom = (Room) obj;
                rooms.add(rom);
            }

        } catch (EOFException e) {

        }
        ois.close();
        return rooms;
    }
}
