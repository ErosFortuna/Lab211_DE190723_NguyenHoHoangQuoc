/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

import java.lang.Math;

/**
 *
 * @author ASUS PC
 */
public class BaseNumberChange {

    private String number;

    public BaseNumberChange(String number) {
        this.number = number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public String changeBaseNumber(int in, int out) {
        if (in > 3 || out > 3) {
            return null;
        }
        if (in == out) {
            return number;
        }
        String result = "";
        int temp1 = 0;
        String temp2 = "";
        switch (in) {
            case 1: {
                switch (out) {
                    case 2: {
                        for (int i = 0; i < number.length(); i++) {
                            temp1 += (int) ((number.charAt(i) - '0') * Math.pow(2, (number.length() - 1) - i));
                        }
                        result = String.valueOf(temp1);
                        break;
                    }
                    case 3: {
                        while (number.length() % 4 != 0) {
                            number = '0' + number;
                        }
                        for (int i = 0; i < number.length(); i += 4) {
                            temp2 = number.substring(i, i + 4);
                            temp1 = 0;
                            for (int j = 0; j < temp2.length(); j++) {
                                temp1 += (int) ((temp2.charAt(j) - '0') * Math.pow(2, (temp2.length() - 1) - j));
                            }
                            switch (temp1) {
                                case 10:
                                    result += 'A';
                                    continue;
                                case 11:
                                    result += 'B';
                                    continue;
                                case 12:
                                    result += 'C';
                                    continue;
                                case 13:
                                    result += 'D';
                                    continue;
                                case 14:
                                    result += 'E';
                                    continue;
                                case 15:
                                    result += 'F';
                                    continue;
                                default:
                                    result += String.valueOf(temp1);
                                    continue;
                            }
                        }
                        break;
                    }
                }
            }
            case 2: {
                switch (out) {
                    case 1: {
                        while (Integer.parseInt(number) != 0) {
                            temp1 = Integer.parseInt(number) % 2;
                            result = String.valueOf(temp1) + result;
                            number = String.valueOf(Integer.parseInt(number) / 2);
                        }
                        break;
                    }
                    case 3: {
                        while (Integer.parseInt(number) != 0) {
                            temp1 = Integer.parseInt(number) % 16;
                            number = String.valueOf(Integer.parseInt(number) / 16);
                            switch (temp1) {
                                case 10:
                                    result = 'A' + result;
                                    continue;
                                case 11:
                                    result = 'B' + result;
                                    continue;
                                case 12:
                                    result = 'C' + result;
                                    continue;
                                case 13:
                                    result = 'D' + result;
                                    continue;
                                case 14:
                                    result = 'E' + result;
                                    continue;
                                case 15:
                                    result = 'F' + result;
                                    continue;
                                default:
                                    result = String.valueOf(temp1) + result;
                                    continue;
                            }

                        }
                        break;
                    }
                }

            }
            case 3: {
                switch (out) {
                    case 1: {
                        for (int i = 0; i < number.length(); i++) {
                            temp2 = String.valueOf(number.charAt(i)).toLowerCase();
                            switch (temp2) {
                                case "f":
                                    temp1 = 15;
                                    break;
                                case "e":
                                    temp1 = 14;
                                    break;
                                case "d":
                                    temp1 = 13;
                                    break;
                                case "c":
                                    temp1 = 12;
                                    break;
                                case "b":
                                    temp1 = 11;
                                    break;
                                case "a":
                                    temp1 = 10;
                                    break;
                                default:
                                    temp1 = Integer.parseInt(temp2);
                            }
                            temp2 = "";
                            while (temp1 != 0) {
                                temp2 = String.valueOf(temp1 % 2) + temp2;
                                temp1 /= 2;
                            }
                            while (temp2.length() % 4 != 0) {
                                temp2 = '0' + temp2;
                            }
                            result += temp2;
                        }
                        break;
                    }
                    case 2: {
                        int temp3 = 0;
                        for (int i = 0; i < number.length(); i++) {
                            temp2 = String.valueOf(number.charAt(i)).toLowerCase();
                            switch (temp2) {
                                case "f":
                                    temp1 = 15;
                                    break;
                                case "e":
                                    temp1 = 14;
                                    break;
                                case "d":
                                    temp1 = 13;
                                    break;
                                case "c":
                                    temp1 = 12;
                                    break;
                                case "b":
                                    temp1 = 11;
                                    break;
                                case "a":
                                    temp1 = 10;
                                    break;
                                default:
                                    temp1 = Integer.parseInt(temp2);
                            }
                            temp3 += temp1 * Math.pow(16, (number.length() - 1) - i);
                        }
                        result = String.valueOf(temp3);
                    }
                    break;
                }
            }
        }
        return result;
    }

}
