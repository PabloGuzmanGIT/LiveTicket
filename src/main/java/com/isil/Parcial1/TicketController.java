package com.isil.Parcial1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/")

public class TicketController {
    @Autowired
    private TicketRepository ticketRepository;

    @GetMapping("/getTicket")
    public List<Ticket> index(){
        List<Ticket> tickets = ticketRepository.findAll();
        return tickets;
    }

    @PostMapping("/addTicket")
    public ResponseEntity<HashMap<String, String>> add(
            @RequestBody Ticket ticket
    ){
        HashMap<String, String> resp = new HashMap<>();
        try {
            ticketRepository.save(ticket);
            resp.put("code","200");
            resp.put("message","Creado Correctamente");
            return ResponseEntity.ok(resp);
        }catch (Exception e){
            resp.put("code","505");
            resp.put("message", e.getMessage());
            return ResponseEntity.internalServerError().body(resp);
        }
    }
}
