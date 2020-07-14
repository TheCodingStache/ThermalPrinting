package thecodingstahce;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        PrinterService printerService = new PrinterService();
        System.out.println(printerService.getPrinters());
        //print some stuff. Change the printer name to your thermal printer name.
        printerService.printString("Epson-TM-Impact-Receipt", "Ambrosia");
        // cut that paper!
        //0x1d and V represents the ESC/POS commands in hex which are made from the manufacturer
        byte[] cutP = new byte[]{0x1d, 'V', 1};
        printerService.printBytes("Epson-TM-Impact-Receipt", cutP);
    }
}
