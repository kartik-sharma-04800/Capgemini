enum LengthUnit {
    FEET(1), INCHES(1.0/12), YARDS(3), CM(0.0328084);
    final double factor;
    LengthUnit(double f) { factor = f; }
    double getFactor() { return factor; }
}
