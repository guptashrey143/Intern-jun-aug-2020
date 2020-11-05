package ThirdTask;

/*A program to check if a given number can be displayed using
1. a given number of loose 7 segment leds
2. a given number of constructed 7 segment leds
*/
public class NoDisplayedUsing7Segments {
    public static boolean canCreate(String str, int noLed){
        int ledCount = 0;
        if(Integer.parseInt(str) == 0){
            return noLed >= 6;
        }
        if(Integer.parseInt(str) < 0){
            ledCount++;
        }
        int check = 0;
        for (int i = 0; i < str.length(); i++) {
             switch(str.charAt(i)){
                 case '0':
                     if(check == 1)
                        ledCount += 6;
                     break;
                 case '6':
                 case '9':
                     check = 1;
                     ledCount += 6;
                     break;
                 case '1':
                     check = 1;
                     ledCount += 2;
                     break;
                 case '2':
                 case '3':
                 case '5':
                     check = 1;
                     ledCount += 5;
                     break;
                 case '4':
                     check = 1;
                     ledCount += 4;
                     break;
                 case '7':
                     check = 1;
                     ledCount += 3;
                     break;
                 case '8':
                     check = 1;
                     ledCount += 7;
                     break;
             }
        }
        return ledCount <= noLed;
    }
    public static boolean canDisplay(String str, int noSegments){
        int ledCount = 0;
        int check = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != '0'){
                check = 1;
                ledCount++;
                if(str.charAt(i) == '1'){
                    if(i < str.length() - 1){
                        if(str.charAt(i + 1) == '1'){
                            i++;
                        }
                    }
                }
            }else{
                if(check == 1){
                    ledCount++;
                }
            }
        }
        return ledCount <= noSegments;
    }

    public static void main(String[] args) {

        System.out.println(canCreate("99", 5));
        System.out.println(canCreate("111", 6));
        System.out.println(canCreate("-87", 9));

        System.out.println();

        System.out.println(canDisplay("02728", 4));
        System.out.println(canDisplay("90654", 4));
        System.out.println(canDisplay("5711", 3));
        System.out.println(canDisplay("6121", 3));

    }
}
