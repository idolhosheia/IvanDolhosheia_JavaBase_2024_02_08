package com.homework.homework19;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        this.x = point.getX();
        this.y = point.getY();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distanceTo(Point secondPoint) {
        return Math.sqrt(Math.pow(secondPoint.getX() - this.getX(), 2)
                +  Math.pow(secondPoint.getY() - this.getY(), 2));
    }

    public static double distanceBetweenTwoPoints(Point firstPoint, Point secondPoint) {
        return Math.sqrt(Math.pow(firstPoint.getX() - secondPoint.getX(), 2)
                +  Math.pow(firstPoint.getY() - secondPoint.getY(), 2));
    }
//
//    public static boolean compareTwoPoints(Point secondPoint){
//        if (firstPoint == this);
//        return true;
//        else {
//            return false;
//        }
//    }
}
//        Створит клас Point - точка на площині. Будемо вважати, що координати цілі значення щоб не ускладнювати задачу.
//        Передбачити наступний функціонал:
//
//        змінити або отримати поточні координати;
//        розрахувати відстань до іншої точки;
//        розрахувати відстань між двома точками;
//        додати можливість порівнювати дві точки - точки вважаються рівними, якщо їх координати співпадають;
//        перевизначити метод toString();
//        додати можливість створювати копію обʼєкту (через метод clone та конструктор копіювання)
//        Застосувати знання по ООП та класу Object. Уникати дублювання коду.