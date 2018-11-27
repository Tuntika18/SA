import { Component, OnInit } from '@angular/core';
import { Router } from "@angular/router";
import { RegisterService } from '../Service/register.service';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})

export class RegisterComponent implements OnInit {
  initials: Array<any>;
  provinces: Array<any>;
  genders: Array<any>;

  data: any = {
    initial:'',
    firstname:'',
    gender:'',
    address:'',
    province:'',
    email:'',
    phonenumber:'',
    username:'',
    password:''
  };
  customers: any = {
    initialSelect: '',
    provinceSelect: '',
    genderSelect: ''
  };


  showdatainput() {
    console.log(this.data)


  }
  constructor(private router:Router,private registerService: RegisterService, private httpClient: HttpClient) { }

  ngOnInit() {
    this.registerService.getInitials().subscribe(data => {
      this.initials = data;
      console.log(this.initials);
    });
    this.registerService.getProvinces().subscribe(data => {
      this.provinces = data;
      console.log(this.provinces);
    });
    this.registerService.getGenders().subscribe(data => {
      this.genders = data;
      console.log(this.genders);
    });
  }

  SubmitdData(){
    console.log(this.data)
    const data  = this.data
      this.router.navigate(['register-show',{
        initial:       data.initial,
        firstname:     data.firstname,
        gender:        data.gender,
        address:       data.address,
        province:      data.province,
        email:         data.email,
        phonenumber:   data.phonenumber,
        username:      data.username,
        password:       data.password,
        }])
 
  }



}



