package com.isil.Parcial1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/")
public class ProveedorController {

    @Autowired
    private ProveedorRepository proveedorRepository;

    @GetMapping("/getProveedor")
    public List<Proveedor>index(){
        List<Proveedor> proveedores = proveedorRepository.findAll();
        return proveedores;
    }
    @PostMapping("/addProveedor")
    public ResponseEntity<HashMap<String, String>> add(
            @RequestBody Proveedor proveedores
    ){
        HashMap<String, String> resp = new HashMap<>();
        try{
            proveedorRepository.save(proveedores);
            resp.put("code","200");
            resp.put("message","Creado Correctamente");

        }catch (Exception e){
            resp.put("code","505");
            resp.put("message","Creado Correctamente");
            return ResponseEntity.internalServerError().body(resp);
        }
        return null;
    }
}
