package backpack;

import backpack.CircleKind;
import backpack.CylindricKind;
import backpack.PlaneKind;

public abstract class AbstractBackpack implements Puttable {
    private CircleKind circleKind;
    private PlaneKind planeKind;
    private CylindricKind cylindricKind;

    public AbstractBackpack(CircleKind circleKind, PlaneKind planeKind, CylindricKind cylindricKind) {
        this.circleKind = circleKind;
        this.planeKind = planeKind;
        this.cylindricKind = cylindricKind;
    }

    public AbstractBackpack() {

    }

    public CircleKind getCircleKind() {
        return circleKind;
    }

    public void setCircleKind(CircleKind circleKind) {
        this.circleKind = circleKind;
    }

    public PlaneKind getPlaneKind() {
        return planeKind;
    }

    public void setPlaneKind(PlaneKind planeKind) {
        this.planeKind = planeKind;
    }

    public CylindricKind getCylindricKind() {
        return cylindricKind;
    }

    public void setCylindricKind(CylindricKind cylindricKind) {
        this.cylindricKind = cylindricKind;
    }
}
//    private String owner;
//    private String color;
//
//    public AbstractBackpack(String owner, String color) {
//        this.owner = owner;
//        this.color = color;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public String getOwner() {
//        return owner;
//    }
//
//    public void setOwner(String owner) {
//        this.owner = owner;
//    }
//}
