package ru.gb.androidlf;

import java.io.Serializable;

public class CalcInput implements Serializable {
    private String firstNumber;
    private String inputNumber;
    private String textResult;
    private double resultNumber;
    private char sign;

    CalcInput() {
        this.firstNumber = "";
        this.inputNumber = "";
        this.textResult = "";
        this.sign = '0';
    }

    public String getTextResult() {
        return textResult;
    }

    public String getInputNumber() {
        return inputNumber;
    }

    public char getSign() {
        return sign;
    }

    void inputFunction(char input) {
        switch (input) {
            case '1':
                inputNumber += "1";
                textResult = firstNumber + inputNumber;
                break;
            case '2':
                inputNumber += "2";
                textResult = firstNumber + inputNumber;
                break;
            case '3':
                inputNumber += "3";
                textResult = firstNumber + inputNumber;
                break;
            case '4':
                inputNumber += "4";
                textResult = firstNumber + inputNumber;
                break;
            case '5':
                inputNumber += "5";
                textResult = firstNumber + inputNumber;
                break;
            case '6':
                inputNumber += "6";
                textResult = firstNumber + inputNumber;
                break;
            case '7':
                inputNumber += "7";
                textResult = firstNumber + inputNumber;
                break;
            case '8':
                inputNumber += "8";
                textResult = firstNumber + inputNumber;
                break;
            case '9':
                inputNumber += "9";
                textResult = firstNumber + inputNumber;
                break;
            case '0':
                if (!inputNumber.equals("0")) {
                    inputNumber += "0";
                    textResult = firstNumber + inputNumber;
                    break;
                }
            case '.':
                if (!inputNumber.contains(".")) {
                    inputNumber += ".";
                    textResult = firstNumber + inputNumber;
                    break;
                }
        }
    }

    void operationFunction(char signN) {
        switch (signN) {
            case '+':
                if (this.sign == '0') {
                    this.sign = '+';
                    firstNumber = inputNumber + " + ";
                    break;
                }
                else if (this.sign != '+') {
                    this.sign = '+';
                    firstNumber = firstNumber
                            .replace(firstNumber.substring
                                    (firstNumber.indexOf(" ")), " + ");
                    break;
                }
            case '-':
                if (this.sign == '0') {
                    this.sign = '-';
                    firstNumber = inputNumber + " - ";
                    break;
                }
                else if (this.sign != '-') {
                    this.sign = '-';
                    firstNumber = firstNumber
                            .replace(firstNumber.substring
                                    (firstNumber.indexOf(" ")), " - ");
                    break;
                }
            case '*':
                if (this.sign == '0') {
                    this.sign = '*';
                    firstNumber = inputNumber + " * ";
                    break;
                }
                else if (this.sign != '*') {
                    this.sign = '*';
                    firstNumber = firstNumber
                            .replace(firstNumber.substring
                                    (firstNumber.indexOf(" ")), " * ");
                    break;
                }
            case '/':
                if (this.sign == '0') {
                    this.sign = '/';
                    firstNumber = inputNumber + " / ";
                    break;
                }
                else if (this.sign != '/') {
                    this.sign = '/';
                    firstNumber = firstNumber
                            .replace(firstNumber.substring
                                    (firstNumber.indexOf(" ")), " / ");
                    break;
                }
        }
        inputNumber = "";
        textResult = firstNumber + inputNumber;
    }

    void resultFunction() {
        switch (this.sign) {
            case '+':
                resultNumber =
                        Double.parseDouble(firstNumber.substring(0, firstNumber.indexOf(" ")))
                                + Double.parseDouble(inputNumber);
                if (resultNumber % (int)resultNumber == 0) textResult = Integer.toString((int)resultNumber);
                else textResult = Double.toString(resultNumber);
                break;
            case '-':
                resultNumber =
                        Double.parseDouble(firstNumber.substring(0, firstNumber.indexOf(" ")))
                                - Double.parseDouble(inputNumber);
                if (resultNumber % (int)resultNumber == 0) textResult = Integer.toString((int)resultNumber);
                else textResult = Double.toString(resultNumber);
                break;
            case '*':
                resultNumber =
                        Double.parseDouble(firstNumber.substring(0, firstNumber.indexOf(" ")))
                                * Double.parseDouble(inputNumber);
                if (resultNumber % (int)resultNumber == 0) textResult = Integer.toString((int)resultNumber);
                else textResult = Double.toString(resultNumber);
                break;
            case '/':
                resultNumber =
                        Double.parseDouble(firstNumber.substring(0, firstNumber.indexOf(" ")))
                                / Double.parseDouble(inputNumber);
                if (resultNumber % (int)resultNumber == 0) textResult = Integer.toString((int)resultNumber);
                else textResult = Double.toString(resultNumber);
                break;
        }
        inputNumber = Double.toString(resultNumber);
        this.sign = '0';
    }

    void clearAll() {
        this.firstNumber = "";
        this.inputNumber = "";
        this.textResult = "";
        this.sign = '0';
    }


}

