public class Romnumbers {

        public int getArabicNumberFromRom(String romNumb) {
            byte var3 = -1;
            switch(romNumb.hashCode()) {
                case 73:
                    if (romNumb.equals("I")) {
                        var3 = 0;
                    }
                    break;
                case 86:
                    if (romNumb.equals("V")) {
                        var3 = 4;
                    }
                    break;
                case 88:
                    if (romNumb.equals("X")) {
                        var3 = 9;
                    }
                    break;
                case 2336:
                    if (romNumb.equals("II")) {
                        var3 = 1;
                    }
                    break;
                case 2349:
                    if (romNumb.equals("IV")) {
                        var3 = 3;
                    }
                    break;
                case 2351:
                    if (romNumb.equals("IX")) {
                        var3 = 8;
                    }
                    break;
                case 2739:
                    if (romNumb.equals("VI")) {
                        var3 = 5;
                    }
                    break;
                case 72489:
                    if (romNumb.equals("III")) {
                        var3 = 2;
                    }
                    break;
                case 84982:
                    if (romNumb.equals("VII")) {
                        var3 = 6;
                    }
                    break;
                case 2634515:
                    if (romNumb.equals("VIII")) {
                        var3 = 7;
                    }
            }

            switch(var3) {
                case 0:
                    return 1;
                case 1:
                    return 2;
                case 2:
                    return 3;
                case 3:
                    return 4;
                case 4:
                    return 5;
                case 5:
                    return 6;
                case 6:
                    return 7;
                case 7:
                    return 8;
                case 8:
                    return 9;
                case 9:
                    return 10;
                default:
                    return Integer.parseInt(romNumb);
            }
        }

        public String getRomNumberFromArabic(int result) {
            switch(result) {
                case 1:
                    return "I";
                case 2:
                    return "II";
                case 3:
                    return "III";
                case 4:
                    return "IV";
                case 5:
                    return "V";
                case 6:
                    return "VI";
                case 7:
                    return "VII";
                case 8:
                    return "VIII";
                case 9:
                    return "IX";
                case 10:
                    return "X";
                default:
                    return Integer.toString(result);
            }
        }
    }






