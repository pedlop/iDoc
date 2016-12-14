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
import {ProjetosComponent}               from './page/ProjetosComponent/ProjetosComponent';
import {CampoComponent}                  from './page/CampoComponent/CampoComponent';
import {HomeComponent}                   from './page/HomeComponent/HomeComponent';
import {CadastroComponent}               from './page/CadastroComponent/CadastroComponent';
/**-------------------- DOMINIO E COMUNICAO WebService ----------------------*/

/** ------------------------ SINGLETONS --------------------------------------*/

import {LoginLogoutSingleton}            from './page/LoginLogoutSingleton/LoginLogoutSingleton';


const WINDOW_PROVIDER: ValueProvider = {
    provide: Window,
    useValue: window
};

const appRoutes: Routes = [
  { path: '', redirectTo: '/home',pathMatch: 'full'},
  { path: 'login', component: LoginComponent },
  { path: 'app', component: AppComponent},
  { path: 'projetos', component: ProjetosComponent},
  { path: 'campo', component: CampoComponent},
  { path: 'home', component: HomeComponent},
  { path: 'projetos', component: ProjetosComponent},
  { path: 'cadastro', component: CadastroComponent}
];

@NgModule({
  imports:      [ BrowserModule,
                  HttpModule,
                  RouterModule.forRoot(appRoutes),
                  FormsModule ],
  declarations: [ AppComponent,
                  LoginComponent,
                  ProjetosComponent,
                  CampoComponent,
                  ProjetosComponent,
                  HomeComponent,
                  CadastroComponent
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
