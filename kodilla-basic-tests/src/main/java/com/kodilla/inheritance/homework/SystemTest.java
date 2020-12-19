package com.kodilla.inheritance.homework;

public class SystemTest {
    public static void main(String[] args) {
        Windows windows = new Windows(1995);
        windows.turnOn();
        windows.displayYearOfWindows();
        windows.turnOf();

        Linux linux = new Linux(1991);
        linux.turnOn();
        linux.displayYearOfLinux();
        linux.turnOf();

    }
}
