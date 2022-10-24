package com.java.ipetruniv;
/** Class to apply arithmetic operations on
 * primitive types of : byte, short, long, double, float,
 * and write results to console
 */
public class homework01 {
    public static void main(String[] args) {
        System.out.println("Work with Byte [-128..127]");
        byte aByte = -10;
        byte bByte = 2;

        byte SumByte = (byte) (aByte + bByte);
        System.out.println(aByte + "+" + bByte + "=" + SumByte );

        byte SubByte = (byte) (aByte - bByte);
        System.out.println(aByte + "-" + bByte + "=" + SubByte );

        byte MulByte = (byte) (aByte * bByte);
        System.out.println(aByte + "*" + bByte + "=" + MulByte );

        byte DivByte = (byte) (aByte / bByte);
        System.out.println(aByte + "/" + bByte + "=" + DivByte );


        System.out.println("\n Work with Short [-32,768..32,767]");
        short  Short01 = 1234;
        short  Short02 = 15;

        short SumShort= (short) (Short01 + Short02);
        System.out.println(Short01 + "+" + Short02 + "=" + SumShort );

        short SubShort = (short) (Short01 - Short02);
        System.out.println(Short01 + "-" + Short02 + "=" + SubShort );

        short MulShort = (short) (Short01 * Short02);
        System.out.println(Short01 + "*" + Short02 + "=" + MulShort );

        short DivShort = (short) (Short01 / Short02);
        System.out.println(Short01+ "/" + Short02+ "=" + DivShort );


        System.out.println("\n Work with Long [-9223372036854775808..9223372036854775807]");
        long  Long01 = 253434L;
        long  Long02 = 2315453L;

        long SumLong= (long) (Long01 + Long02);
        System.out.println(Long01 + "+" + Long02 + "=" + SumLong );

        long SubLong = (long) (Long01 - Long02);
        System.out.println(Long01 + "-" + Long02 + "=" + SubLong );

        long MulLong = (long) (Long01 * Long02);
        System.out.println(Long01 + "*" + Long02 + "=" + MulLong );

        long DivLong = (long) (Long01 / Long02);
        System.out.println(Long01+ "/" + Long02+ "=" + DivLong );


        System.out.println("\n Work with Double  [-2^63..2^63-1]");
        double  Double01 = 253443d;
        double  Double02 = 231543d;

        double  SumDouble= (double) (Double01 + Double02);
        System.out.println(Double01 + "+" + Double02 + "=" + SumDouble );

        double SubDouble = (double) (Double01 - Double02);
        System.out.println(Double01 + "-" + Double02 + "=" + SubDouble );

        double  MulDouble = (double) (Double01 * Double02);
        System.out.println(Double01 + "*" + Double02 + "=" + MulDouble );

        double  DivDouble = (double) (Double01 / Double02);
        System.out.println(Double01+ "/" + Double02+ "=" + DivDouble );


        System.out.println("\n Work with Float  [-2^63..2^63-1]");
        float   Float01 = 2.345f;
        float   Float02 = 3.14f;

        float   SumFloat= (float) (Float01 + Float02);
        System.out.println(Float01 + "+" + Float02 + "=" + SumFloat );

        float  SubFloat = (float) (Float01 - Float02);
        System.out.println(Float01 + "-" + Float02 + "=" + SubFloat );

        float   MulFloat = (float) (Float01 * Float02);
        System.out.println(Float01 + "*" + Float02 + "=" + MulFloat );

        float   DivFloat = (float) (Float01 / Float02);
        System.out.println(Float01+ "/" + Float02+ "=" + DivFloat );

    }
}
