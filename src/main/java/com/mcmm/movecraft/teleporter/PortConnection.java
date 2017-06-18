package com.mcmm.movecraft.teleporter;

/**
 * Created by Marco on 01.06.2017.
 *
 * Ist ein Datenobjekt zur Verknüpfung der Teleporter
 */
public class PortConnection {
    double startX;
    double startY;
    double startZ;
    double endX;
    double endY;
    double endZ;

    public PortConnection(double startX, double startY, double startZ, double endX, double endY, double endZ) {
        this.startX = startX;
        this.startY = startY;
        this.startZ = startZ;
        this.endX = endX;
        this.endY = endY;
        this.endZ = endZ;
    }

    /**
     *
     * @param o
     * Es werden hier nur die Start Koordinaten überprüft da sich ein Ende auch mit
     * mehreren Starts verbinden lassen soll.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PortConnection that = (PortConnection) o;

        if (Double.compare(that.startX, startX) != 0) return false;
        if (Double.compare(that.startY, startY) != 0) return false;
        if (Double.compare(that.startZ, startZ) != 0) return false;
        return true;

    }


    public double getStartX() {
        return startX;
    }

    public void setStartX(double startX) {
        this.startX = startX;
    }

    public double getStartY() {
        return startY;
    }

    public void setStartY(double startY) {
        this.startY = startY;
    }

    public double getStartZ() {
        return startZ;
    }

    public void setStartZ(double startZ) {
        this.startZ = startZ;
    }

    public double getEndX() {
        return endX;
    }

    public void setEndX(double endX) {
        this.endX = endX;
    }

    public double getEndY() {
        return endY;
    }

    public void setEndY(double endY) {
        this.endY = endY;
    }

    public double getEndZ() {
        return endZ;
    }

    public void setEndZ(double endZ) {
        this.endZ = endZ;
    }


    @Override
    public String toString() {
        return startX + "," + startY + "," + startZ + "," + endX + "," + endY + "," + endZ + ";";
    }
}
