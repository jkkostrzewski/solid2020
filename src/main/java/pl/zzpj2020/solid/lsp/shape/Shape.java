package pl.zzpj2020.solid.lsp.shape;

public class Shape {
    protected double surfaceArea;
    protected double circuit;

    public void calculateSurfaceArea() {
        this.surfaceArea = 0;
    }

    public void calculateCircuit() {
        this.circuit = 0;
    }
}
