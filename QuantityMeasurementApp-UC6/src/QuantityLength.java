class QuantityLength {
    final double value;
    final LengthUnit unit;
    
    QuantityLength(double v, LengthUnit u) {
        if (u == null || !Double.isFinite(v)) throw new IllegalArgumentException();
        value = v;
        unit = u;
    }
    
    static double convert(double v, LengthUnit s, LengthUnit t) {
        if (s == null || t == null || !Double.isFinite(v)) throw new IllegalArgumentException();
        return v * s.getFactor() / t.getFactor();
    }
    
    QuantityLength to(LengthUnit t) {
        return new QuantityLength(convert(value, unit, t), t);
    }
    
    static QuantityLength add(QuantityLength q1, QuantityLength q2) {
        if (q1 == null || q2 == null) throw new IllegalArgumentException();
        double sumInBase = q1.value * q1.unit.getFactor() + q2.value * q2.unit.getFactor();
        return new QuantityLength(sumInBase / q1.unit.getFactor(), q1.unit);
    }
    
    static QuantityLength add(double v1, LengthUnit u1, double v2, LengthUnit u2) {
        return add(new QuantityLength(v1, u1), new QuantityLength(v2, u2));
    }
    
    QuantityLength add(QuantityLength other) {
        return add(this, other);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof QuantityLength)) return false;
        QuantityLength q = (QuantityLength) o;
        return Math.abs(value * unit.getFactor() - q.value * q.unit.getFactor()) < 1e-5;
    }
    
    @Override
    public String toString() {
        return value == (int)value ? value + " " + unit : String.format("%.2f %s", value, unit);
    }
}
