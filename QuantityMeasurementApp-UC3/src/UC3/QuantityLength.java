package UC3;

public class QuantityLength {
    private final double value;
    private final LengthUnit unit;

    public QuantityLength(double value, LengthUnit unit) {
        if (unit == null) {
            throw new IllegalArgumentException("Unit cannot be null");
        }
        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public LengthUnit getUnit() {
        return unit;
    }

    public double convertToBaseUnit() {
        return unit.convertToBase(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        QuantityLength other = (QuantityLength) obj;
        return Double.compare(this.convertToBaseUnit(), other.convertToBaseUnit()) == 0;
    }

    @Override
    public int hashCode() {
        long baseValue = Double.doubleToLongBits(convertToBaseUnit());
        return Long.hashCode(baseValue);
    }

    @Override
    public String toString() {
        return String.format("Quantity(%.1f, %s)", value, unit.name().toLowerCase());
    }
}
