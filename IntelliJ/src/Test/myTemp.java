package Test;

public class myTemp {
    String name;
    Save save;

    public myTemp(String temp, Save save) {
        this.name = temp;
        this.save = save;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}
