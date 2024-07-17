import lombok.*;

import java.io.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Student implements Serializable {

     String id;
    String name;
    String age;

}

