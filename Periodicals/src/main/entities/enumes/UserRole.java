package main.entities.enumes;

public enum UserRole {
    ADMIN("admin"), USER("user"), BLOCKED("blocked");

    private final String stringRole;

    UserRole(String stringRole){
        this.stringRole = stringRole;
    }

    public String getStringRole() {
        return stringRole;
    }
}
