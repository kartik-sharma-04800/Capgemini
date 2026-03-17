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
