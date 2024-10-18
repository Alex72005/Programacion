package jerarquia;

public abstract class Animal {
    private String sex;
    private int daysAge;
    private String codeEAN = "LIBRE";

    public Animal(String sex, int daysAge, String codeEAN) {
        this.sex = sex;
        this.daysAge = daysAge;
        this.codeEAN = Integer.toString((int) (Math.random() * (200)));
    }

    public String getSex() {
        return sex;
    }

    public int getDaysAge() {
        return daysAge;
    }

    public String getCodeEAN() {
        return codeEAN;
    }



    public void racismo () {
        System.out.print("putos negros");
    }
}
