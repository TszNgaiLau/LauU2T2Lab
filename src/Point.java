public class Point {
    private int x;
    private int y;

    public Point(int one, int two) {
        x = one;
        y = two;
    }

    public  Point(int one) {
        x = one;
        y = one;
    }

    public Point() {
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int newX) {
        x = newX;
    }

    public void setY(int newY) {
        y = newY;
    }
    public String coordinate() {
        return "(" + getX() + "," + getY() + ")";
    }

    public String quadrant() {
        if (x == 0 && y == 0) {
            return "origin";
        } else if (x == 0 && y < 0) {
            return "on an axis";
        } else if (x < 0 && y == 0) {
            return "on an axis";
        } else if (x == 0 && y > 0) {
            return "on an axis";
        } else if (x > 0 && y == 0) {
            return "on an axis";
        } else if (x > 0 && y > 0)  {
            return "I";
        } else if (x > 0 && y < 0) {
            return "IV";
        } else if (x < 0 && y < 0) {
            return "III";
        } else if (x < 0 && y > 0) {
            return "II";
        }
        return null;
    }
}
