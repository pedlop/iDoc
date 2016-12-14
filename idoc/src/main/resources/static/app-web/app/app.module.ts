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
import {CabecalhoComponent}              from './page/CabecalhoComponent/CabecalhoComponent';
import {CorpoComponent}                  from './page/CorpoComponent/CorpoComponent';
import {IntroducaoComponent}             from './page/IntroducaoComponent/IntroducaoComponent';
import {DocumentoComponent}             from './page/DocumentoComponent/DocumentoComponent';
import {ModeloDocComponent}             from './page/ModeloDocComponent/ModeloDocComponent';

/**-------------------- DOMINIO E COMUNICAO WebService ----------------------*/

/** ------------------------ SINGLETONS --------------------------------------*/

import {LoginLogoutSingleton}            from './page/LoginLogoutSingleton/LoginLogoutSingleton';


const WINDOW_PROVIDER: ValueProvider = {
    provide: Window,
    useValue: window
};

const appRoutes: Routes = [
  { path: '', redirectTo: '/corpo',pathMatch: 'full'},
  { path: 'login', component: LoginComponent },
  { path: 'app', component: AppComponent},
  { path: 'projetos', component: ProjetosComponent},
  { path: 'campo', component: CampoComponent},
  { path: 'home', component: HomeComponent},
  { path: 'cadastro', component: CadastroComponent},
  { path: 'cabecalho', component: CabecalhoComponent},
  { path: 'introducao', component: IntroducaoComponent},
  { path: 'corpo', component: CorpoComponent},
  { path: 'documento', component: CorpoComponent},
  { path: 'modelodoc', component: CorpoComponent},
  
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
                  CadastroComponent,
                  CabecalhoComponent,
                  CorpoComponent,
                  IntroducaoComponent,
                  ModeloDocComponent,
                  DocumentoComponent
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
