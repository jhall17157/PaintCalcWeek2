package edu.wctc;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class RoomWriter {
    public void writeRoomFile(String filename, ArrayList<Room> roomList) throws IOException {

        FileOutputStream fos = new FileOutputStream(filename);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for (int i = 0; i < roomList.size(); i++) {
            Room room = roomList.get(i);
            oos.writeObject(room);
        }
        oos.close();
    }
}
