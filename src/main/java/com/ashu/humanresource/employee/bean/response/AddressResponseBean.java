package com.ashu.humanresource.employee.bean.response;

/**
 * Created by Suriyanarayanan K
 * on 07/12/20 11:18 PM.
 */
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class AddressResponseBean {
    private String line1;
    private String line2;
    private String city;
    private String state;
    private String country;
}
