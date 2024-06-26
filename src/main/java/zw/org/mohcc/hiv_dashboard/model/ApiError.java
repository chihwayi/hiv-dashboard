package zw.org.mohcc.hiv_dashboard.model;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ApiError {

    private final HttpStatus status;
    private final String message;
    private final String debugMessage;
}
