/*
You are given a string date representing a Gregorian calendar date in the yyyy-mm-dd format.

date can be written in its binary representation obtained by converting year, month, and day to their binary representations without any leading zeroes and writing them down in year-month-day format.

Return the binary representation of date.
 */

public class $3280_Convert_Date_to_Binary {

    public static void main(String[] args) {

        System.out.println(convertDateToBinary("2080-02-29"));
    }

    public static String convertDateToBinary(String date) {

        return Integer.toBinaryString(Integer.parseInt(date.substring(0,4))) + "-" +
                Integer.toBinaryString(Integer.parseInt(date.substring(5,7))) + "-" +
                Integer.toBinaryString(Integer.parseInt(date.substring(8,10)));


    }
}
