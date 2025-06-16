package am.order.sportsman;

public enum SportCategory {
SINGLE(" alone"), TEAM(" with my team");

private final String info;

    SportCategory(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
