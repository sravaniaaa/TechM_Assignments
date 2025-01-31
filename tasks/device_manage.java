package tasks;
import java.util.*;

class Phone {
    private int pId;
    private String os;
    private String brand;
    private int price;

    
    public Phone(int pId, String os, String brand, int price) {
        this.pId = pId;
        this.os = os;
        this.brand = brand;
        this.price = price;
    }
    public int getPhoneId() {
        return pId;
    }

    public String getOs() {
        return os;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }
}

public class device_manage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phone[] phones = new Phone[4];
        for (int i = 0; i < 4; i++) {
            int pId = sc.nextInt();
            sc.nextLine();
            String os = sc.nextLine();
            String brand = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();
            phones[i] = new Phone(pId, os, brand, price);
        }
        String brand = sc.nextLine();
        String os = sc.nextLine();
    
        int totalBrandPrice = findPriceForGivenBrand(phones, brand);
        if (totalBrandPrice > 0) {
            System.out.println(totalBrandPrice);
        } else {
            System.out.println("The given Brand is not available");
        }

        Phone phone = getPhoneIdBasedOnOs(phones, os);
        if (phone != null) {
            System.out.println(phone.getPhoneId());
        } else {
            System.out.println("No phones are available with specified os and price range");
        }
    }

    public static int findPriceForGivenBrand(Phone[] phones, String brand) {
        int total = 0;
        for (Phone phone : phones) {
            if (phone.getBrand().equalsIgnoreCase(brand)) {
                total += phone.getPrice();
            }
        }
        return total;
    }

    public static Phone getPhoneIdBasedOnOs(Phone[] phones, String os) {
        for (Phone phone : phones) {
            if (phone.getOs().equalsIgnoreCase(os) && phone.getPrice() >= 50000) {
                return phone;
            }
        }
        return null;
    }
}
