package com.isil.Parcial1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/")
public class BancoController {

    @Autowired
    private BancoRepository bancoRepository;
    @GetMapping("/get")
    public List<Banco> index(){
        List<Banco> bancos = bancoRepository.findAll();
        return bancos;
    }
    @PostMapping("/add")
    public ResponseEntity<HashMap<String,String>> add(
        @RequestBody Banco bancos
    ){
        HashMap<String, String> resp = new HashMap<>();
        try{
            bancoRepository.save(bancos);
            resp.put("code","200");
            resp.put("message","Creado Correctamente");
            return ResponseEntity.ok(resp);
        }catch(Exception e){
            resp.put("code","505");
            resp.put("message", e.getMessage());
            return ResponseEntity.internalServerError().body(resp);

        }
    }




}
