class YIDissector {
    //fields
    String colonSeparated, countryCode;
    int areaCode, prefix, number;

    //constructor
    YIDissector(String c) {
        colonSeparated = c;
    }

    //methods
    public void getPhoneNumber() {
        int index = 1;
        switch (index) {
            case 1:
                System.out.println(countryCode);
                break;
            case 2:
                System.out.println(areaCode);
                break;
            case 3:
                System.out.println(prefix);
                break;
            case 4:
                System.out.println(number);
                break;
            default:
                System.out.println(colonSeparated);
                break;
        }
    }
}
public class ReneeProg1 {
    public static void main(String[] args) {
//      YIDissector phoneNumber = new YIDissector("1:919:882:5000");
        String phoneNumber = "1:919:882:5000";
        int idx, idx2, idx3;
        int numberLength = phoneNumber.length();
        System.out.println(numberLength);

        idx = phoneNumber.indexOf(':');
        System.out.println("Index of first occurrence of : is: " + idx);
        idx2 = phoneNumber.indexOf(':', idx+1);
        System.out.println("Index of second occurrence of : is: " + idx2);
        idx3 = phoneNumber.lastIndexOf(':');
        System.out.println("Index of last occurrence of : is: " + idx3);


        String countryCode = phoneNumber.substring(0, idx);
        System.out.println("country code is: " + countryCode);
        String areaCode = phoneNumber.substring(idx+1, idx2);
        System.out.println("area code is: " + areaCode);
        String prefix = phoneNumber.substring(idx2+1, idx3);
        System.out.println("prefix is: " + prefix);
        String number = phoneNumber.substring(idx3+1, numberLength);
        System.out.println("number is: " + number);

//        System.out.println(phoneNumber.getPhoneNumber());
//        System.out.println(phoneNumber.getPhoneNumber(4));
//        System.out.println(phoneNumber.getPhoneNumber(1));
//        System.out.println(phoneNumber.getPhoneNumber(3));
//        System.out.println(phoneNumber.getPhoneNumber(2));
        }

    }
