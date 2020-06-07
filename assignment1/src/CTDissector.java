class CTDissector {
    //fields
    private String colonSeparated, countryCode, returnSection;
    private int areaCode, prefix, number, idx, idx2, idx3;

    //constructor
    public CTDissector(String fullValue) {
        colonSeparated = fullValue;

        int numberLength = colonSeparated.length();

        idx = colonSeparated.indexOf(':');
        idx2 = colonSeparated.indexOf(':', idx + 1);
        idx3 = colonSeparated.lastIndexOf(':');

        //use Integer.parseInt to convert an integer to a string type
        countryCode = colonSeparated.substring(0, idx);
        areaCode = Integer.parseInt(colonSeparated.substring(idx + 1, idx2));
        prefix = Integer.parseInt(colonSeparated.substring(idx2 + 1, idx3));
        number = Integer.parseInt(colonSeparated.substring(idx3 + 1, numberLength));
    }


    //methods
    public String getPhoneNumber() {
        return colonSeparated;
    }

    public String getPhoneNumber(int input) {
        switch (input) {
            case 1:
                returnSection = countryCode;
                break;
            case 2:
                returnSection = Integer.toString(areaCode);
                break;
            case 3:
                returnSection = Integer.toString(prefix);
                break;
            case 4:
                returnSection = Integer.toString(number);
                break;
            default:
                returnSection = " ";
                break;
        }
        return returnSection;
    }
}