package io.swagger.api;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-09-27T20:41:13.008650-10:00[Pacific/Honolulu]")
public class ApiException extends Exception {
    private int code;
    public ApiException (int code, String msg) {
        super(msg);
        this.code = code;
    }
}
