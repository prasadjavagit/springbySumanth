package info.inetsolv.beans;

import lombok.Data;

@Data
public class Person {
    private Integer pid;
    private String name;
    private Address address;
}
