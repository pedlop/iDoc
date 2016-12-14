import {Component}                     from '@angular/core';
import { Response   }                  from '@angular/http';
import { Router }                      from '@angular/router';
/********************************************** */
import {LoginLogoutSingleton}          from '../LoginLogoutSingleton/LoginLogoutSingleton';
/********************************************** */

@Component({
    selector:'login',
    templateUrl: 'app/page/LoginComponent/LoginComponent.html',
    providers:[  ]
})
export class LoginComponent{

  constructor(  public  router : Router ) {
    
  
  }

  
}

