package UC4;

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
        double thisBase = this.convertToBaseUnit();
        double otherBase = other.convertToBaseUnit();
        return Math.abs(thisBase - otherBase) < 1e-5;
    }

    @Override
    public int hashCode() {
        double rounded = Math.round(convertToBaseUnit() * 1e6) / 1e6;
        return Double.hashCode(rounded);
    }

    @Override
    public String toString() {
        String formatted = String.format("%.6f", value).replaceAll("0+$", "");
        if (formatted.endsWith(".")) {
            formatted += "0";
        }
        return "Quantity(" + formatted + ", " + unit.name().toLowerCase() + ")";
    }
}
