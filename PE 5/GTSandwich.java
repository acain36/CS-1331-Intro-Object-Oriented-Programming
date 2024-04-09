public class GTSandwich {
    public static void main(String[] args) {

    }

    private String bread;
    private String meat;
    private String[] extras;
    private int numMeat;
    private double price;
    private boolean hasSauce;
    private boolean makeCombo;

    private String coupon;

//Constructors ::
    public GTSandwich(String bread, String meat, String[] extras, int numMeat,
        double price, boolean hasSauce, boolean makeCombo) {
        this.bread = bread;
        this.meat = meat;
        this.extras = extras;
        this.numMeat = numMeat;
        this.price = price;
        this.hasSauce = hasSauce;
        this.makeCombo = makeCombo;
    }

    public GTSandwich(String bread, String meat, boolean makeCombo) {
        String[] array = new String[0];
        this.bread = bread;
        this.meat = meat;
        this.extras = array;
        this.numMeat = 4;
        this.price = 8.75;
        this.hasSauce = true;
        this.makeCombo = makeCombo;
    }

    public GTSandwich() {
        String[] array = new String[0];
        this.bread = "Rye";
        this.meat = "Turkey";
        this.extras = array;
        this.numMeat = 4;
        this.price = 8.75;
        this.hasSauce = true;
        this.makeCombo = true;
    }

    //Get and Set Methods ::
    public String getBread() {
        return this.bread;
    }

    public String getMeat() {
        return this.meat;
    }

    public String[] getExtras() {
        return this.extras;
    }

    public int getNumMeat() {
        return this.numMeat;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean getHasSauce() {
        return this.hasSauce;
    }

    public boolean getMakeCombo() {
        return this.makeCombo;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setExtras(String[] extras) {
        this.extras = extras;
    }

    public void setNumMeat(int numMeat) {
        this.numMeat = numMeat;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setHasSauce(boolean hasSauce) {
        this.hasSauce = hasSauce;
    }

    public void setMakeCombo(boolean makeCombo) {
        if (makeCombo && !(this.makeCombo)) {
            price += 2.0;
        } else if (!(makeCombo) && this.makeCombo) {
            price -= 2.0;
        }
        this.makeCombo = makeCombo;
    }

    //Coupon Functions
    public void applyCoupon(String coupon) {
        if (coupon.compareTo("CS1331") != 0) {
            System.out.println("Coupon Not Applied");
        } else if  (coupon.compareTo("CS1331") == 0) {
            price /= 2.0;
            numMeat *= 2;
            System.out.println("Coupon Applied");
        }
    }

    public void applyCoupon() {
        if (price >= 20.0) {
            price = price - 5.0;
            if (!(makeCombo)) {
                this.makeCombo = true;
            }
            System.out.println("Discount Applied");
        } else {
            System.out.println("Discount Not Applied");
        }
    }

    public void printExtras() {
        String[] array = new String[0];
        String output = "The customer wants these extras:";
        if (extras.length == array.length) {
            System.out.println("The customer wants no extras");
        } else if  (extras.length != array.length) {
            for (int i = 0; i < extras.length; i++) {
                output += (" " + extras[i]);
            }
            System.out.println(output);
        }

    }
    public String toString() {
        return "GT Sandwich that costs " + String.format("%.2f", this.price) + " with "
                    + getBread() + ", " + getMeat()  + ", "
                    + getNumMeat() + " slices of meat, Sauce: "
                    + getHasSauce() + ", Combo : " + getMakeCombo() + ".";
    }

}