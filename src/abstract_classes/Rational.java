package abstract_classes;

public class Rational extends Number implements Comparable<Rational> {
	private static final long serialVersionUID = 1L;
	private long numerator;
	private long denominator;

	public Rational() {
		this(0, 1);
	}

	public Rational(long numerator, long denominator) {
		long gcd = getGcd(numerator, denominator);
		this.numerator = ((denominator > 0) ? 1 : -1) * numerator / gcd;
		this.denominator = denominator / gcd;
	}

	public long getNumerator() {
		return numerator;
	}

	public long getDenominator() {
		return denominator;
	}

	public Rational add(Rational secondRational) {
		long numerator1 = (secondRational.getDenominator() * this.numerator)
				+ (this.denominator * secondRational.getNumerator());
		long denominator1 = this.denominator * secondRational.getDenominator();
		return new Rational(numerator1, denominator1);
	}

	public Rational subtract(Rational secondRational) {
		long numerator1 = (secondRational.getDenominator() * this.numerator)
				- (this.denominator * secondRational.getNumerator());
		long denominator1 = this.denominator * secondRational.getDenominator();
		return new Rational(numerator1, denominator1);
	}

	public Rational multiply(Rational secondRational) {
		long numerator1 = (secondRational.getNumerator() * this.numerator);

		long denominator1 = (this.denominator * secondRational.getDenominator());
		;
		return new Rational(numerator1, denominator1);
	}

	public Rational divide(Rational secondRational) {
		long numerator1 = (secondRational.getDenominator() * this.numerator);

		long denominator1 = (this.denominator * secondRational.getNumerator());
		;
		return new Rational(numerator1, denominator1);
	}

	private static long getGcd(long n, long d) {
		long n1 = Math.abs(n);
		long n2 = Math.abs(d);
		int gcd = 1;
		for (int k = 1; k <= n1 && k <= n2; k++) {
			if (n1 % k == 0 && n2 % k == 0)
				gcd = k;
		}

		return gcd;
	}

	@Override
	public String toString() {
//		return "Rational [numerator=" + numerator + ", denominator=" + denominator + "]"
		if (denominator == 1)
			return numerator + "";
			else
			return numerator + "/" + denominator;
	}

	@Override // Implement the abstract intValue method in Number
	public int intValue() {
		return (int) doubleValue();
	}

	@Override // Implement the abstract floatValue method in Number
	public float floatValue() {
		return (float) doubleValue();
	}

	@Override // Implement the doubleValue method in Number
	public double doubleValue() {
		return numerator * 1.0 / denominator;
	}

	@Override // Implement the abstract longValue method in Number
	public long longValue() {
		return (long) doubleValue();
	}

	@Override
	public int compareTo(Rational rational) {
		if (this.subtract(rational).getNumerator() > 0) {
			return 1;
		} else if (this.subtract(rational).getNumerator() < 0) {
			return -1;
		} else
			return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this.subtract((Rational) obj).getNumerator() > 0 || this.subtract((Rational) obj).getNumerator() < 0) {
			return false;
		}
		return true;
	}

}
