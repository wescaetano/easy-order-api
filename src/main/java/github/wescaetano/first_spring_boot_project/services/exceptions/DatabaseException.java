package github.wescaetano.first_spring_boot_project.services.exceptions;

public class DatabaseException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public DatabaseException(String message) {
        super(message);
    }
}
