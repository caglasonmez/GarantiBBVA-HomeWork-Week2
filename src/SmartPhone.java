class SmartPhone extends Phone {
    private int storage;
    private int ram;
    private int camera;


    // No-args constructor
   /* public SmartPhone() {
        this.id = 0;
        this.name = "";
        this.price = 0.0;
        this.phoneNumber = "";
        this.storage = 0;
        this.ram = 0;
        this.camera = 0;
    }

    // All-args constructor
    public SmartPhone(int id, String name, double price, String phoneNumber, int storage, int ram, int camera) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.phoneNumber = phoneNumber;
        this.storage = storage;
        this.ram = ram;
        this.camera = camera;
    }*/

    public SmartPhone(int id, String name, double price, String phoneNumber, int storage, int ram, int camera) {
        super(id, name, price, phoneNumber);
        this.storage = storage;
        this.ram = ram;
        this.camera = camera;
    }
}