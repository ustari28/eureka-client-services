package com.example.eurekaclientesample;

import com.alan.feign.client.ClienteDTO;
import com.alan.feign.client.IClientRest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alan Dávila<br>
 *         27 Jul. 2017 22:22
 */
@RestController
@RequestMapping("/client")
public class ClientRest implements IClientRest {

    @Override
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<ClienteDTO> get(@PathVariable("id") String id) {
        return new ResponseEntity<ClienteDTO>(ClienteDTO.builder().id(id).nombre("test1").build(), HttpStatus.OK);
    }

    @Override
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<ClienteDTO> create() {
        return new ResponseEntity<ClienteDTO>(ClienteDTO.builder().id("id").nombre("test1").build(), HttpStatus
                .CREATED);
    }
}
