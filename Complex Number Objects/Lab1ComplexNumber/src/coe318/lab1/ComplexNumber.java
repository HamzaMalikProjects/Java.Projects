package coe318.lab1;
/**
 * ComplexNumber models a complex number expressed in rectangular form (real and
 * imaginary parts). It is an <em>immutable</em> object.
 *
 * @author Hamza Malik
 */
public class ComplexNumber {
//Instance variable declarations
    double realnum;
    double imaginarynum;

    /**
     * Construct a ComplexNumber given its real and imaginary parts.
     *
     * @param re The real component
     * @param im The imaginary component
     */
    public ComplexNumber(double re, double im) {
//Initialize the instance variables
     realnum = re;
     imaginarynum = im;
    }

    /**
     * Returns the real component.
     *
     * @return the real
     */
    public double getReal() {
         return realnum; //A stub: to be fixed
    }

    /**
     * Returns the imaginary component.
     *
     * @return the imaginary
     */
    public double getImaginary() {
        return imaginarynum; //A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber number that is the negative of <em>this</em>.
     * Note: the original ComplexNumber is <b>NOT</b>
     * modified.
     *
     * @return -this
     */
    public ComplexNumber negate() {
        return new ComplexNumber(-realnum, -imaginarynum); //A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is the sum of <em>this</em> and
     * <em>z</em>. Note: the original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this + z
     */
    public ComplexNumber add(ComplexNumber z) {
        return new ComplexNumber((realnum+z.realnum),(imaginarynum+z.imaginarynum));  //A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is the difference of <em>this</em> and
     * <em>z</em>. Note: the original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this + z
     */
    public ComplexNumber subtract(ComplexNumber z) {
        return new ComplexNumber((realnum-z.realnum), (imaginarynum-z.imaginarynum)); //A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is the product of <em>this</em> and
     * <em>z</em>. Note: the original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this * z
     */
    public ComplexNumber multiply(ComplexNumber z) {
        return new ComplexNumber((realnum*z.realnum - imaginarynum*z.imaginarynum), (imaginarynum*z.realnum + realnum*z.imaginarynum)); //A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is the reciprocal of <em>this</em>.
     * Note: the original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @return 1.0 / this
     */
    public ComplexNumber reciprocal() {
        return new ComplexNumber((realnum/(realnum*realnum + imaginarynum*imaginarynum)),(-imaginarynum/(realnum*realnum + imaginarynum*imaginarynum))); //A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is
     * <em>this</em> divided by <em>z</em>. Note: the original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this / z
     */
    public ComplexNumber divide(ComplexNumber z) {
      double x = z.realnum;
      double y = z.imaginarynum;
     
     ComplexNumber divided = new ComplexNumber(
              ((realnum*x + imaginarynum*y)/(x*x + y*y)),
              ((imaginarynum*x - realnum*y)/(x*x + y*y)));
     
      return divided; //A stub: to be fixed
    }

    /**
     * Returns a String representation of
     * <em>this</em> in the format:
     * <pre>
     * real +-(optional) i imaginary
     * </pre> If the imaginary part is zero, only the real part is converted to
     * a String. A "+" or "-" is placed between the real and imaginary parts
     * depending on the the sign of the imaginary part.
     * <p>
     * Examples:
     * <pre>
     * ..println(new ComplexNumber(0,0); -> "0.0"
     * ..println(new ComplexNumber(1,1); -> "1.0 + i1.0"
     * ..println(new ComplexNumber(1,-1); -> "1.0 - i1.0"
     * </pre>
     *
     * @return the String representation.
     */
    @Override
    public String toString() {
//DO NOT MODIFY THIS CODE!
        String str = "" + this.getReal();
        if (this.getImaginary() == 0.0) {
            return str;
        }
        if (this.getImaginary() > 0) {
            return str + " + i" + this.getImaginary();
        } else {
            return str + " - i" + -this.getImaginary();
        }
    }
}

