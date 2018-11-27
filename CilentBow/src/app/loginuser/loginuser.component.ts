import { Component, OnInit } from '@angular/core';
import { LoginUserService } from '../Service/login-user.service';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-loginuser',
  templateUrl: './loginuser.component.html',
  styleUrls: ['./loginuser.component.css']
})
export class LoginUserComponent implements OnInit {

credentials = {username: '', password: ''};

constructor(private app:LoginUserService ,private router: Router, private http: HttpClient) {}
  Autention(){
    console.log(this.credentials)

    if((this.credentials.username === "" || this.credentials.password ===  "" )){
      alert('enter  User or pass  ')
    }
     else {
      this.app.authenticate(this.credentials,()=>{
        if(this.app.authenticated){
         this.router.navigate(['home',{}]);
        }else{
        alert('No User ')
        }
      })
     
    }

    
  }


  ngOnInit() {
  }

}
