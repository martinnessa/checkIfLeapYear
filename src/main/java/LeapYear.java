public class LeapYear {

    public boolean isLeapYear(int year){
        boolean result;

        //År som kan deles rent på 4 men ikke 100 eller kan deles rent på 400 er skuddår
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
