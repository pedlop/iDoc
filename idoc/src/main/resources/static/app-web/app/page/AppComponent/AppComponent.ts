import {Component }             from '@angular/core';
import { Router }               from '@angular/router';
import {LoginComponent}         from '../LoginComponent/LoginComponent';
import {LoginLogoutSingleton}   from '../LoginLogoutSingleton/LoginLogoutSingleton';

@Component({
    selector:'my-app',
    templateUrl:'app/page/AppComponent/AppComponent.html'
})
export class AppComponent{

    
    constructor( public router : Router){
        
    }

    
    
}