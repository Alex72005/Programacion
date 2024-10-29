package jerarquia;

public class Cat extends Animal {
    //Attributes
    public String color;
    public String breed;
    public String typeHair;
    public String name;
    public int chip;
    public String ownerName;
    public String ownerDNI;

    //Constructs

    public Cat (String sex, int daysAge, String codeEAN, String color, String breed, String typeHair, String name, String ownerName) {
        super(sex, daysAge, codeEAN);
        this.color = color;
        this.breed = breed;
        this.typeHair = typeHair;
        this.name = name;
        this.chip = (int) (Math.random() * 999);
        this.ownerName = ownerName;
        this.ownerDNI = Integer.toString((int) (Math.random() * (200)));
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", typeHair='" + typeHair + '\'' +
                ", name='" + name + '\'' +
                ", chip=" + chip +
                ", ownerName='" + ownerName + '\'' +
                ", ownerDNI='" + ownerDNI + '\'' +
                '}';
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public String getTypeHair() {
        return typeHair;
    }

    public String getName() {
        return name;
    }

    public int getChip() {
        return chip;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnerDNI() {
        return ownerDNI;
    }

    public void racismo () {
        super.racismo();
    }

    public String getSex() {
       return super.getSex();
    }

    public int getDaysAge() {
        return super.getDaysAge();
    }

    public String getCodeEAN() {
        return super.getCodeEAN();
    }
}
