package pl.zzpj2020.solid.ocp.usa.solution;

public class ALState implements USAState {
    private final int MAX_SPEED = 0;

    @Override
    public int getStateMaxSpeed() {
        return this.MAX_SPEED;
    }
}
