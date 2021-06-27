package com.bfyamada.spring.activemq.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Account implements Serializable {
    private static final long serialVersionUID = 1L;

    private String Id;
    private String nome;
    private String status;
}
