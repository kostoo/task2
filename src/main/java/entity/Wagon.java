package entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"id", "num", "seats", "type"})
@XmlRootElement(name = "wagon")
public class Wagon {

    @XmlElement(name = "id")
    private int id;
    @XmlElement(name = "num")
    private int num;
    @XmlElement(name = "seats")
    private int seats;
    @XmlElement(name = "type")
    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Entity.Wagon{" +
                "id=" + id +
                ", num=" + num +
                ", seats=" + seats +
                ", type='" + type + '\'' +
                '}';
    }
}
