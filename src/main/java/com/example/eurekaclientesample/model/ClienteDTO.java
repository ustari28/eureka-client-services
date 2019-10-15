package com.example.eurekaclientesample.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClienteDTO {
    private String id;
    private String name;
}
