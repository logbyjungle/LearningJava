package jungle3;

public enum tool {

    axe(10,1),
    sword(5,5);

    protected final int damage;
    protected final int speed;
    tool(int damage, int speed) {
        this.damage = damage;
        this.speed = speed;
    }
}
