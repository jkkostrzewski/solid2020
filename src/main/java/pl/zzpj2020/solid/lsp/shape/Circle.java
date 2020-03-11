package pl.zzpj2020.solid.lsp.shape;

public class Circle extends Shape {
    private double radius;

    @Override
    public void calculateSurfaceArea() {
        super.surfaceArea = Math.PI * radius * radius;
    }

    @Override
    public void calculateCircuit() {
        super.circuit = 2 * Math.PI * radius;
    }
}