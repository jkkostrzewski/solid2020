package pl.zzpj2020.solid.lsp.shape;

public class Square extends Shape {
    private double sideLength;

    @Override
    public void calculateSurfaceArea() {
        super.surfaceArea = sideLength * sideLength;
    }

    @Override
    public void calculateCircuit() {
        super.circuit = sideLength * 4;
    }
}
