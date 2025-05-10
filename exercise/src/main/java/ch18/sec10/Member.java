package ch18.sec10;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Member implements Serializable {
    private String id;
    private String name;
}
