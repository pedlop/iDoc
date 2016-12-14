/**-------------------- ANGULAR 2 ----------------------*/
import { NgModule, ValueProvider }       from '@angular/core';
import { BrowserModule }                 from '@angular/platform-browser';
import { FormsModule }                   from '@angular/forms';
import { HttpModule }                    from '@angular/http';
import { RouterModule, Routes }          from '@angular/router';

/**-------------------- BIBLIOTECAS ----------------------*/
//import { TextMaskModule   }              from 'angular2-text-mask';

/**-------------------- PAGINAS - COMPONENT(s) ----------------------*/
import { AppComponent }                  from './page/AppComponent/AppComponent';
import {LoginComponent}                  from './page/LoginComponent/LoginComponent';

/**-------------------- DOMINIO E COMUNICAO WebService ----------------------*/

/** ------------------------ SINGLETONS --------------------------------------*/

import {LoginLogoutSingleton}            from './page/LoginLogoutSingleton/LoginLogoutSingleton';


const WINDOW_PROVIDER: ValueProvider = {
    provide: Window,
    useValue: window
};

const appRoutes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'home', component: AppComponent}
];

@NgModule({
  imports:      [ BrowserModule,
                  HttpModule,
                  RouterModule.forRoot(appRoutes),
                  FormsModule ],
  declarations: [ AppComponent,
                  LoginComponent
                  ],
  providers:    [ WINDOW_PROVIDER],
  bootstrap:    [ AppComponent ]
})
export class AppModule {
    constructor( ){
      
      //CRIA OS SINGLETONS PARA O TODA A APLICAO
      let loginLogout: LoginLogoutSingleton   = new LoginLogoutSingleton();
      
    }
}
