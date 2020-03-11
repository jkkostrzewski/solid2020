package pl.zzpj2020.solid.lsp.shape;

public class Rectangle extends Shape {
    private double firstSideLength;
    private double secondSideLength;

    @Override
    public void calculateSurfaceArea() {
        super.surfaceArea = firstSideLength * secondSideLength;
    }

    @Override
    public void calculateCircuit() {
        super.circuit = firstSideLength * 2 + secondSideLength * 2;
    }
}
