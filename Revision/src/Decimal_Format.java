import java.text.*;



class Decimal_Format {
    public static void main(String[] args) {

        String pattern="+977-##########";

        DecimalFormat format = new DecimalFormat(pattern);
        String dFormat =format.format(1234567654);
        System.out.println("Phone NUmber:"+dFormat);


        //Locale locale = new Locale("US","Nepal");
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setCurrencySymbol("Rs");
        String currency="0d000.00";


        DecimalFormat todo = new DecimalFormat(currency,symbols);
        todo.setGroupingSize(3);

        String cash = todo.format(1234535.45);

        System.out.println(cash);
    }
}
