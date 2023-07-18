public class Main {
    public static void main(String[] args) {
        PhoneApp phoneApp = new PhoneApp();
        double result = phoneApp.calculateTotalPrice(phoneApp.smartPhoneArray);

        System.out.println("Toplam fiyat: " + result);
    }
}