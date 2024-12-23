package com.devupvers.App.Controller;
import com.devupvers.App.Model.UserModel;
import com.devupvers.App.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/details")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping
    public ResponseEntity<UserModel> createDetail(@RequestBody UserModel detail) {
        UserModel createdDetail = userService.createDetail(detail);
        return ResponseEntity.ok(createdDetail);
    }
}