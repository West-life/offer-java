package offer2019;

/**
 * Create by xuzhijun.online on 2019/8/5.
 */
public class Power {

    boolean flag = false;

    public double Power(double base, int exponent) {
        double res = 0.0;
        if (equal(base, 0.0) && exponent < 0) {
            flag = true;
            return res;
        }
        if (exponent < 0) {
            res = powerWithUnsignedExponent(base, -exponent);
            return 1 / res;
        } else {
            return powerWithUnsignedExponent(base, exponent);
        }
    }

    public double powerWithUnsignedExponent(double base, int exponent) {
        if (equal(base, 0.0)) {
            return 0.0;
        }
        if (exponent == 0) {
            return 1;
        }
        if ((exponent & 1) == 1) {
            double res = powerWithUnsignedExponent(base, (exponent - 1) >> 1);
            return res * res * base;
        }else {
            double res = powerWithUnsignedExponent(base,exponent >> 1);
            return res * res;
        }
    }

    public boolean equal(double a, double b) {
        if ((a - b < 0.00000001) && (a - b) > -0.00000001) {
            return true;
        }
        return false;
    }
}
