package com.mcmm.movecraft.teleporter;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraft.world.WorldSavedData;
import net.minecraft.world.storage.MapStorage;

import java.util.LinkedList;

/**
 * Created by Marco on 02.06.2017.
 *
 * Speichert die Verknüpfungen in einer Liste
 * Soll auch das Speichern nach Verlassen der Karte übernehmen --> funktioniert nicht (bin verzweifelt dran)
 */
public class TeleportData extends WorldSavedData {
    private static final String DATA_NAME = "MOVECRAFT_DATA";

    private LinkedList<PortConnection> connectionList = new LinkedList<>();

    public TeleportData()
    {
        super(DATA_NAME);
    }
    public TeleportData(String name) {
        super(name);
    }

    @Override
    public void readFromNBT(NBTTagCompound nbt) {
        System.out.println("in read");
        String str = nbt.getString("connList");
        for (String s :
                str.split(";")) {
            String[] coordFeld = s.split(",");
            if(coordFeld != null)
            {
                boolean error = false;
                for (String coord :
                        coordFeld) {
                    if(coord.isEmpty())
                    {
                        error = true;
                    }
                }
                if(!error)
                {
                    connectionList.add(new PortConnection(Double.parseDouble(coordFeld[0]),
                            Double.parseDouble(coordFeld[1]),
                            Double.parseDouble(coordFeld[2]),
                            Double.parseDouble(coordFeld[3]),
                            Double.parseDouble(coordFeld[4]),
                            Double.parseDouble(coordFeld[5])));
                }

            }

        }

    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        System.out.println("in write");
        String sconnList = "";
        for (PortConnection pc :
                connectionList) {
            sconnList += pc.toString();
        }

        compound.setString("connList", sconnList);
        return compound;
    }

    public static TeleportData get(World world) {

        MapStorage storage = world.getPerWorldStorage();
        TeleportData instance = (TeleportData) storage.getOrLoadData(TeleportData.class, DATA_NAME);


        if (instance == null) {
            instance = new TeleportData();
            storage.setData(DATA_NAME, instance);
        }

        return instance;
    }

    public void addListEntry(PortConnection pc)
    {
        connectionList.add(pc);
        markDirty();
    }

    public PortConnection isInList(PortConnection pc)
    {
        for (PortConnection portCon : connectionList) {
            if(pc.equals(portCon))
            {
                return portCon;
            }
        }
        return null;
    }

    public boolean deleteListEntry(PortConnection pc)
    {
        markDirty();
        return connectionList.remove(pc);

    }

    public LinkedList<PortConnection> getList()
    {
        return connectionList;
    }
}
