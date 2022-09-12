public abstract class Hogwarts {

    String fullName;
    int magic;
    int teleport;

    public void compareStudents(Hogwarts studentSecond) {
        int powerOne = this.magic + this.teleport;
        int powerTwo = studentSecond.magic + studentSecond.teleport;
        if (powerOne > powerTwo) {
            System.out.println(this.fullName + " сильнее чем, " + studentSecond.fullName);
        } else if (powerTwo > powerOne) {
            System.out.println(studentSecond.fullName + " сильнее чем, " + this.fullName);
        } else {
            System.out.println(this.fullName + " такой же сильный, как и " + studentSecond.fullName);
        }
    }





    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        if (magic < 0 || magic > 100) {
            throw new RuntimeException("Введено неверное значение.");
        }
        this.magic = magic;
    }

    public int getTeleport() {
        return teleport;
    }

    public void setTeleport(int teleport) {
        if (teleport < 0 || teleport > 100) {
            throw new RuntimeException("Введено неверное значение.");
        }
        this.teleport = teleport;
    }
}
