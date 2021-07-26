// package com.org.app;

// import java.util.ArrayList;
// import java.util.List;

// import org.springframework.http.HttpStatus;
// import org.springframework.http.MediaType;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
// @RequestMapping("api")
// public class MyUnknownController {
//     @GetMapping(value = "/unkn", produces = MediaType.APPLICATION_JSON_VALUE)
//     public ResponseEntity<List<String>> getNames() throws Exception {
        
//         List<String> lstConfig = new ArrayList<>();
//         lstConfig.add("Test123");
//         lstConfig.add("Test456");
//         lstConfig.add("Test678");

//         return new ResponseEntity<List<String>>(lstConfig, HttpStatus.OK);
//     }
// }
