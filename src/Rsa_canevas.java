import java.io.*;
import java.math.*;
import java.util.*;

class Rsa_canevas {


    static final BigInteger ZERO = new BigInteger("0");
    static final BigInteger ONE = new BigInteger("1");
    static final BigInteger TWO = new BigInteger("2");
    static final BigInteger THREE = new BigInteger("3");

    public static BigInteger M2BI(String m){
        String message = "";
        int position = 0;

        while (position < m.length()){
            char caractere = m.charAt(position);
            switch (caractere) {
                case 'a':
                    message = message + "01";
                    position ++;
                    break;
                case 'b':
                    message = message + "02";
                    position ++;
                    break;
                case 'c':
                    message = message + "03";
                    position ++;
                    break;
                case 'd':
                    message = message + "04";
                    position ++;
                    break;
                case 'e':
                    message = message + "05";
                    position ++;
                    break;
                case 'f':
                    message = message + "06";
                    position ++;
                    break;
                case 'g':
                    message = message + "07";
                    position ++;
                    break;
                case 'h':
                    message = message + "08";
                    position ++;
                    break;
                case 'i':
                    message = message + "09";
                    position ++;
                    break;
                case 'j':
                    message = message + "10";
                    position ++;
                    break;
                case 'k':
                    message = message + "11";
                    position ++;
                    break;
                case 'l':
                    message = message + "12";
                    position ++;
                    break;
                case 'm':
                    message = message + "13";
                    position ++;
                    break;
                case 'n':
                    message = message + "14";
                    position ++;
                    break;
                case 'o':
                    message = message + "15";
                    position ++;
                    break;
                case 'p':
                    message = message + "16";
                    position ++;
                    break;
                case 'q':
                    message = message + "17";
                    position ++;
                    break;
                case 'r':
                    message = message + "18";
                    position ++;
                    break;
                case 's':
                    message = message + "19";
                    position ++;
                    break;
                case 't':
                    message = message + "20";
                    position ++;
                    break;
                case 'u':
                    message = message + "21";
                    position ++;
                    break;
                case 'v':
                    message = message + "22";
                    position ++;
                    break;
                case 'w':
                    message = message + "23";
                    position ++;
                    break;
                case 'x':
                    message = message + "24";
                    position ++;
                    break;
                case 'y':
                    message = message + "25";
                    position ++;
                    break;
                case 'z':
                    message = message + "26";
                    position ++;
                    break;
                case ' ':
                    message = message + "27";
                    position ++;
                    break;
                case '-':
                    message = message + "28";
                    position ++;
                    break;
                case '!':
                    message = message + "29";
                    position ++;
                    break;
                case ',':
                    message = message + "30";
                    position ++;
                    break;
                case '\'':
                    message = message + "31";
                    position ++;
                    break;
            }
        }
        BigInteger BI = new BigInteger(message);
        return BI;
    }


    public static String BI2M(BigInteger m){
        String message = "";
        String mm = m.toString();
        int position = 0;

        if (mm.length() % 2 != 0){
            mm = "0" + mm;
        }
        while (position < mm.length()){
            String caracteres = mm.substring(position,position+2) ;
            if (caracteres.equals("01")){
                message = message + "a";
                position = position + 2;
            }
            else if (caracteres.equals("02")){
                message = message + "b";
                position = position +2;
            }
            else if (caracteres.equals("03")){
                message = message + "c";
                position = position +2;
            }
            else if (caracteres.equals("04")){
                message = message + "d";
                position = position +2;
            }
            else if (caracteres.equals("05")){
                message = message + "e";
                position = position +2;
            }
            else if (caracteres.equals("06")){
                message = message + "f";
                position = position +2;
            }
            else if (caracteres.equals("07")){
                message = message + "g";
                position = position +2;
            }
            else if (caracteres.equals("08")){
                message = message + "h";
                position = position +2;
            }
            else if (caracteres.equals("09")){
                message = message + "i";
                position = position +2;
            }
            else if (caracteres.equals("10")){
                message = message + "j";
                position = position +2;
            }
            else if (caracteres.equals("11")){
                message = message + "k";
                position = position +2;
            }
            else if (caracteres.equals("12")){
                message = message + "l";
                position = position +2;
            }
            else if (caracteres.equals("13")){
                message = message + "m";
                position = position +2;
            }
            else if (caracteres.equals("14")){
                message = message + "n";
                position = position +2;
            }
            else if (caracteres.equals("15")){
                message = message + "o";
                position = position +2;
            }
            else if (caracteres.equals("16")){
                message = message + "p";
                position = position +2;
            }
            else if (caracteres.equals("17")){
                message = message + "q";
                position = position +2;
            }
            else if (caracteres.equals("18")){
                message = message + "r";
                position = position +2;
            }
            else if (caracteres.equals("19")){
                message = message + "s";
                position = position +2;
            }
            else if (caracteres.equals("20")){
                message = message + "t";
                position = position +2;
            }
            else if (caracteres.equals("21")){
                message = message + "u";
                position = position +2;
            }
            else if (caracteres.equals("22")){
                message = message + "v";
                position = position +2;
            }
            else if (caracteres.equals("23")){
                message = message + "w";
                position = position +2;
            }
            else if (caracteres.equals("24")){
                message = message + "x";
                position = position +2;
            }
            else if (caracteres.equals("25")){
                message = message + "y";
                position =position +2;
            }
            else if (caracteres.equals("26")){
                message = message + "z";
                position =position +2;
            }
            else if (caracteres.equals("27")){
                message = message + " ";
                position = position +2;
            }
            else if (caracteres.equals("28")){
                message = message + "-";
                position = position +2;
            }
            else if (caracteres.equals("29")){
                message = message + "!";
                position = position +2;
            }
            else if (caracteres.equals("30")){
                message = message + ",";
                position = position +2;
            }
            else if (caracteres.equals("31")){
                message = message + "\'";
                position = position +2;
            }
        }
        return message;
    }






    public static BigInteger Attaque(BigInteger e, BigInteger N) {
        BigInteger d = new BigInteger("40");
        BigInteger cond = new BigInteger("3").divide(N.sqrt());
        BigInteger firstFraction = e.divide(N);
        ArrayList<BigInteger> coefficient = euclideEtapeCoefficient(e,N);
        System.out.println(coefficient);
        return cond;
    }



    private static ArrayList<BigInteger> euclideEtapeCoefficient(BigInteger e,BigInteger N){
        BigInteger inter = N;
        ArrayList<BigInteger> toReturn = new ArrayList<>();
        while(!N.equals(BigInteger.ZERO)){
            toReturn.add(e.divide(N));
            inter = e.mod(N);
            e = N;
            N = inter;
        }

        return toReturn;
    }

    /*
    fi = ni/di

    Cas n°1
    n0 = q0
    d0 = 1

    Cas n°2
    n1 = q0*q1+1
    d1 = q0 soit n0

    Cas général
    ni = qini−1 + ni−2
    di = qidi−1 + di−2
     */
    private static ArrayList<BigInteger> fiCalcul(ArrayList<BigInteger> listq){
        System.out.println(listq);
        ArrayList<BigInteger> listeReturn = new ArrayList<BigInteger>();
        BigInteger n0 = listq.get(0);
        BigInteger d0 = new BigInteger("1");
        listeReturn.add(n0.divide(d0));
        BigInteger n1 = listq.get(0).multiply(listq.get(1)).add(new BigInteger("1"));
        BigInteger d1 = listq.get(0);
        listeReturn.add(n1.divide(d1));
        BigInteger ni = new BigInteger("0");
        BigInteger di = new BigInteger("0");
        for (int i = 2; i < listq.size(); i++){
            ni = listq.get(i).multiply(n1).add(n0);
            di = listq.get(i).multiply(d1).add(d0);
            listeReturn.add(ni.divide(di));
            n0 = n1;
            d0 = d1;
            n1 = ni;
            d1 = di;
        }
        listeReturn.add(ni.divide(di));
        return listeReturn;
    }




    public static void main (String[] args) {
        RSA rsa = new RSA(16);

        String r = "j'aime les teleteub";

        BigInteger message = M2BI(r);
        BigInteger c = rsa.chiffrementRSA(message);
        System.out.println(c);
        ArrayList<BigInteger> b = fiCalcul(euclideEtapeCoefficient(rsa.getPublicKey().getN(),rsa.getPublicKey().getE()));
        for(BigInteger bi : b){
            BigInteger p = rsa.dechiffrementRsa(c,bi,rsa.getPublicKey().getN());
            System.out.println(BI2M(p) + " La clé = " + bi.toString());
        }
        BigInteger p = rsa.dechiffrementRsa(c);
        System.out.println(BI2M(p));
        System.out.println(euclideEtapeCoefficient(BigInteger.valueOf(311),BigInteger.valueOf(30)));

    }






}