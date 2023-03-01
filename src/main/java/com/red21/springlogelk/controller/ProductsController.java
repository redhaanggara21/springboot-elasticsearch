package com.red21.springlogelk.controller;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/product")
public class ProductsController {

    // private final ProductRepository productRepository;

    // @PostMapping(value = "/", consumes = "application/json")
    // public ResponseEntity<Object> create(@RequestBody Product product) {
    //     try{
    //         productRepository.save(product);
    //         return ResponseEntity.status(HttpStatus.CREATED).body("Create Successfully");
    //     }catch (Exception e) {
    //         if(!e.getMessage().contains("Created")){
    //             throw e;
    //         }
    //     }
    //     return ResponseEntity.status(HttpStatus.CREATED).body("Created");
    // }

    // @GetMapping(value = "/{id}", produces = "application/json")
    // public ResponseEntity<Object> retrieve(@PathVariable Long id) {
    //     return ResponseEntity.ok(productRepository.findById(id)
    //             .orElseThrow(() -> new ResourceNotFoundException("ID: " + id)));
    // }

    // @GetMapping(produces = "application/json")
    // public ResponseEntity<Object> retrieve() {
    //     return ResponseEntity.ok(productRepository.findAll());
    // }

    // @PutMapping(value = "/", consumes = "application/json")
    // public ResponseEntity<Object> update(@RequestBody Product product) {
    //     try{
    //         return ResponseEntity.ok(productRepository.save(product));
    //     }catch (Exception e) {
    //         if(!e.getMessage().contains("200 OK")){
    //             e.getLocalizedMessage();
    //             throw e;
    //         }
    //     }
    //     return ResponseEntity.status(HttpStatus.ACCEPTED).body("Updated");
    // }

    // @DeleteMapping(value = "/{id}")
    // public ResponseEntity<Object> delete(@PathVariable Long id) {
    //     try {
    //         productRepository.deleteById(id);
    //         return ResponseEntity.status(HttpStatus.ACCEPTED).body("Deleted");
    //     }catch (Exception e) {
    //         if(!e.getMessage().contains("200")){
    //             e.getLocalizedMessage();
    //             throw e;
    //         }
    //     }
    //     return ResponseEntity.status(HttpStatus.ACCEPTED).body("Deleted");
    // }

}
