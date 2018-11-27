import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import { HttpClient} from '@angular/common/http';
@Component({
  selector: 'app-register-show',
  templateUrl: './register-show.component.html',
  styleUrls: ['./register-show.component.css']
})
export class RegisterShowComponent implements OnInit {

  data:any={}
  
  constructor(private route:ActivatedRoute, private httpClient: HttpClient) { }
  SumbitRegister(){
    alert('register !!!')
  }


  ngOnInit() {
    this.route.params.subscribe(prams=>{
      this.data = prams
      console.log(prams)
    })
  }

  save() {
    this.httpClient.post('http://localhost:8080/Customer/' + this.data.initial + '/' + this.data.firstname + '/' + this.data.gender + '/' + this.data.address + '/' + this.data.province + '/' + this.data.email + '/' + this.data.phonenumber + '/' + this.data.username + '/' + this.data.password,this.data)
    .subscribe(
      data =>   {console.log('PUT Request is successful', data);},
      error =>  {console.log('Error', error);}
      );
    }

}
