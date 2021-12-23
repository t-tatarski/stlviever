public class Triangle {

    double xa;
    double ya;
    double za;
    double xb;
    double yb;
    double zb;
    double xc;
    double yc;
    double zc;

    public Triangle( double xa, double ya, double za, double xb, double yb, double zb, double xc, double yc, double zc) {

        this.xa = xa;
        this.ya = ya;
        this.za = za;
        this.xb = xb;
        this.yb = yb;
        this.zb = zb;
        this.xc = xc;
        this.yc = yc;
        this.zc = zc;
    }

    public double getXa() {
        return xa;
    }

    public void setXa(double xa) {
        this.xa = xa;
    }

    public double getYa() {
        return ya;
    }

    public void setYa(double ya) {
        this.ya = ya;
    }

    public double getZa() {
        return za;
    }

    public void setZa(double za) {
        this.za = za;
    }

    public double getXb() {
        return xb;
    }

    public void setXb(double xb) {
        this.xb = xb;
    }

    public double getYb() {
        return yb;
    }

    public void setYb(double yb) {
        this.yb = yb;
    }

    public double getZb() {
        return zb;
    }

    public void setZb(double zb) {
        this.zb = zb;
    }

    public double getXc() {
        return xc;
    }

    public void setXc(double xc) {
        this.xc = xc;
    }

    public double getYc() {
        return yc;
    }

    public void setYc(double yc) {
        this.yc = yc;
    }

    public double getZc() {
        return zc;
    }

    public void setZc(double zc) {
        this.zc = zc;
    }


    @Override
    public String toString() {
        return "Triangle{" +
                "xa=" + xa +
                ", ya=" + ya +
                ", za=" + za +
                ", xb=" + xb +
                ", yb=" + yb +
                ", zb=" + zb +
                ", xc=" + xc +
                ", yc=" + yc +
                ", zc=" + zc +
                '}';
    }
}
