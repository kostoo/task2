package entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "id", "name", "locomotive_type", "date", "wagons"})
@XmlRootElement(name = "train")
public class Train {

    @XmlElement(name = "id")
    private String id;

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "locomotive-type")
    private String locomotive_type;

    @XmlElement(name = "form-date")
    private Date date;

    @XmlElementWrapper(name = "wagons")
    @XmlElement(name = "wagon")
    private List<Wagon> wagons;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocomotive_type() {
        return locomotive_type;
    }

    public void setLocomotive_type(String locomotive_type) {
        this.locomotive_type = locomotive_type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Wagon> getWagons() {
        return wagons;
    }

    public void setWagons(List<Wagon> wagons) {
        this.wagons = wagons;
    }

    @Override
    public String toString() {
        return "Entity.Train{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", locomotive_type='" + locomotive_type + '\'' +
                ", date=" + date +
                ", wagons=" + wagons +
                '}';
    }
}
