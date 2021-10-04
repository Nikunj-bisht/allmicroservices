package com.example.fmicro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class Authcontroller {



//    @Autowired
//    public Authcontroller(Urbanuserdao urbanuserdao){
//        this.urbanuserdao = urbanuserdao;
//    }
//
//    @RequestMapping(value = "/signup", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
//    public @ResponseBody ResponseEntity<?> save(@RequestBody Signupuser signuser){
//
////        List<Signupuser> list = new ArrayList<>();
////
////        try {
////            String password = PasswordCheck.getencryptedpassword(signuser.getPassword());
////            Urbanuser users = new Urbanuser(signuser.getUser_name(), password
////                    , signuser.getEmail(), signuser.getPhn_num());
////
////           urbanuserdao.save(users);
//
//            list.add(signuser);
//            return new ResponseEntity<>(list, HttpStatus.ACCEPTED);
//
//        } catch (Exception e) {
//
//            e.printStackTrace();
//            return new ResponseEntity<>("Try again", HttpStatus.BAD_REQUEST);
////}
//
//
//        }
//
//}

//@PostMapping(value = "/login")
//public @ResponseBody ResponseEntity<?> userlogin(@RequestBody Signupuser signupuser){
//try{
//
// if(urbanuserdao.finduser(signupuser.getEmail(),signupuser.getPassword())){
//
//     return new ResponseEntity<>("Success", HttpStatus.OK);
//
//
// }else{
//     return new ResponseEntity<>("Wrong credentials!!", HttpStatus.NON_AUTHORITATIVE_INFORMATION);
//
// }
//
//        }catch(Exception e){
//    e.printStackTrace();
//            return new ResponseEntity<>("Try again", HttpStatus.BAD_REQUEST);
//
//        }
//
//
//}
//
//@GetMapping(value = "/prac")
//    public String fetch(){
//        return null;
//}


}
