public class PhoneApp{
    SmartPhone[] smartPhoneArray;

    public PhoneApp() {
        smartPhoneArray = new SmartPhone[5];
        initializeSmartPhones();
        double totalPrice = calculateTotalPrice(smartPhoneArray);
        System.out.println("Total Price of SmartPhones: TL" + totalPrice);
    }

    private void initializeSmartPhones() {
        smartPhoneArray[0] = new SmartPhone(1, "Phone A", 1.200, "123456", 128, 4, 12);
        smartPhoneArray[1] = new SmartPhone(2, "Phone B", 1.300, "456789", 256, 8, 16);
        smartPhoneArray[2] = new SmartPhone(3, "Phone C", 1.120, "987456", 512, 8, 20);
        smartPhoneArray[3] = new SmartPhone(4, "Phone D", 1.560, "456321", 256, 12, 16);
        smartPhoneArray[4] = new SmartPhone(5, "Phone E", 1.450, "478523", 512, 16, 24);
    }



    public static double calculateTotalPrice(SmartPhone[] smartPhoneArray) {
        double totalPrice = 0.0;
        for (SmartPhone smartPhone : smartPhoneArray) {
            totalPrice += smartPhone.price;
        }
        return totalPrice;
    }
}